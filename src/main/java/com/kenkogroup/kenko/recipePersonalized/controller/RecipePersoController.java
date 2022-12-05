package com.kenkogroup.kenko.recipePersonalized.controller;
import com.kenkogroup.kenko.recipePersonalized.entity.RecipePersonalized;
import com.kenkogroup.kenko.recipePersonalized.service.RecipePersoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/recipePersonalized")
public class RecipePersoController {
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
        //RecipePersonalized recipeModifie = {[recipePerso]id,};
        System.out.print("recette a analyser: " + recipePerso);
        List<String> results = recipePersoService.analyseRecipePerso(recipePerso);
        recipePersoService.getAnalyse().afficheAnalyse(results);
        return results;
    }

}
