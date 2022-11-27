package com.kenkogroup.kenko.recipePersonalized.repository;
import com.kenkogroup.kenko.product.entity.Product;
import com.kenkogroup.kenko.recipePersonalized.entity.RecipePersonalized;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class BaseDonnee {

    private List<RecipePersonalized> recipes;
    private Map<Product,Double> products;

    public List<RecipePersonalized> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<RecipePersonalized> recipes) {
        this.recipes = recipes;
    }

    public Map<Product, Double> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Double> products) {
        this.products = products;
    }

    public void addRecipePerso(RecipePersonalized recipePerso){
        recipes.add(recipePerso);
    }

    public void updateRecipePerso(int id,RecipePersonalized recipePerso){
        recipes.set(recipes.indexOf(findRecipePersoById(id)),recipePerso);
    }

    public void deleteRecipePerso(int id){
        recipes.remove(findRecipePersoById(id));
    }
    public RecipePersonalized findRecipePersoById(int id){
        RecipePersonalized recipePerso = null;
        for (RecipePersonalized recipe : recipes){
            if(recipe.getIdRecipe()==id) recipePerso = recipe;
        }
        return recipePerso;
    }
    //liste de recettes vide au debut ou on ajoute les recettes du user / supp ou modif
    //liste des products qu'on a dans notre apli
    //les product ont des catégorie(string)
    //on aura une fonction qui renvoi des trucs selon les categories
    //fonction qui analyse la liste d'ingredient selon la liste de predicat et renvoi un resultat
}

