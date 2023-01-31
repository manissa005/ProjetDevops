package com.kenkogroup.kenko.recipePersonalized.controller;
import  com.kenkogroup.kenko.Quantity.QuantityCat;
import com.kenkogroup.kenko.recipePersonalized.entity.RecipePersonalized;
import com.kenkogroup.kenko.recipePersonalized.service.RecipePersoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import com.kenkogroup.kenko.recipe.entity.edamam.Example;
import com.kenkogroup.kenko.recipe.entity.edamam.Hit;
import com.kenkogroup.kenko.recipe.entity.edamam.RecipeEdamam;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import com.kenkogroup.kenko.ingredient.entity.Ingredient;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/recipePersonalized")
public class RecipePersoController {
     private List<RecipePersonalized> recipes = new ArrayList<>();
    private List<RecipeEdamam> likeRecettes = new ArrayList<>();
    @Autowired
    private RecipePersoService recipePersoService;
    @PostMapping("/add")
    public void addRecipe(@RequestBody RecipePersonalized recipePerso) {
        System.out.print("recette perso recupere : " + recipePerso);
        recipePersoService.addRecipePerso(recipePerso);
    }

    @PutMapping("/update/{id}")
    public void updateRecipe(@PathVariable int id, @RequestBody RecipePersonalized recipe) {
        System.out.print("recette perso modifie : " + recipe);
        recipePersoService.updateRecipePerso(id, recipe);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRecipe(@PathVariable("id") int id) {
        recipePersoService.deleteRecipePerso(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/analyse")
    public List<String> analyseRecipe(@RequestBody RecipePersonalized recipePerso) {
        System.out.print("recette a analyser: " + recipePerso);
        List<String> results = conversion(recipePersoService.analyseRecipePerso(recipePerso));
        if(recipePersoService.getAnalyse().quantityTotalRecipe(recipePerso)<250.0){
            results.add("Quantité Totale insuffisante  ");
        }else{
            if(recipePersoService.getAnalyse().quantityTotalRecipe(recipePerso)>650.0){
                results.add("Quantité Totale très grande");
            }
                else results.addAll(recipePersoService.recommandationRecipe(recipePersoService.analyseRecipePerso(recipePerso)));
        }
        recipes.add(recipePerso);
        return results;
    }
    /*
        Conversion liste de quantityCat en liste de string
     */
    public List<String> conversion(List<QuantityCat> list){
        List<String> results = new ArrayList<>();
        for (QuantityCat c : list){
            results.add(c.getCategory()+"  :  "+ Math.round(c.getPercentage()*100.0)/100.0+"%  ");
        }
        return results;
    }
    @GetMapping("/getRecipes")
    public List<RecipePersonalized> getRecipes(){
        return recipes;
    }
    @GetMapping("/analyseRecipes")
    public List<String> analyseRecipes(){
        List<String> results;
        System.out.println("LISTES DE RECETTES A ANALYSER");
        for (RecipePersonalized recipe : recipes){
            System.out.println(recipe);
        }
        results = conversion(recipePersoService.analyseRecipes(recipes));
        results.addAll(recipePersoService.recommandationRecipes(recipePersoService.analyseRecipes(recipes)));
        //recipePersoService.getAnalyse().afficheAnalyse(results);
        return results;
    }

    @GetMapping("/postLike/{id}")
    public void postLike(@PathVariable String id) throws JsonProcessingException {
        likeRecettes.clear();
//System.out.println("request is : " + requestServlet.getRequestURL().toString() + "?" + requestServlet.getQueryString());
        RecipePersonalized recipe = null;
        System.out.println("LENGTH " + recipes.size());
        for (int i = 0; i < recipes.size(); i++) {
            System.out.println("name value is : " + id);
            System.out.println("getName() value is : " + recipes.get(i).getName());
            if (recipes.get(i).getName().equals(id)){
                recipe = recipes.get(i);
            }
        }
        System.out.println(recipe);
        if (recipe != null){
            List<Ingredient> ingredients = new ArrayList<>();
            String search = "";
            int cpt = 0;
            for (Ingredient elem : recipe.getIngredients()) {
                if(cpt <= 1 || cpt <= recipe.getIngredients().size())
                {
                    if(elem.getQuantity() > 0)
                    {
                        search = elem.getProduct().getName() + "+";
                        cpt = cpt + 1;
                    }
                }
            }

            if (ingredients.size() == 1)
                search = ingredients.get(0).getProduct().getName();
            else if(ingredients.size() > 1)
                search = ingredients.get(0).getProduct().getName() + "+" + ingredients.get(1).getProduct().getName();
            System.out.println("SEARH : " + search);
            String url = "https://api.edamam.com/search?q=" + search
                    + "&app_id=656be70f&app_key=036042af3e99ebf91c95f241611890b9";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "*/*")
                    .header("Accept-Encoding", "deflate, br")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = null;
            try {
                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            String responseString = response.body();

            Example data = new ObjectMapper().readValue(responseString, Example.class);

            List<Hit> hitList = data.getHits();

            for (Hit hit : hitList) {
                likeRecettes.add(hit.getRecipe());
            }
        }
    }
    @GetMapping("/getLike")
    public List<RecipeEdamam> getLike() throws JsonProcessingException {
        return likeRecettes;
    }
}
