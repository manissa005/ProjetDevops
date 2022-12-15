package com.kenkogroup.kenko.recipePersonalized.repository;
import com.kenkogroup.kenko.Quantity.QuantityCat;
import com.kenkogroup.kenko.ingredient.entity.Ingredient;
import com.kenkogroup.kenko.product.entity.Product;
import com.kenkogroup.kenko.recipePersonalized.entity.RecipePersonalized;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.kenkogroup.kenko.category.entity.Other.*;

@Service
public class AnalyseDietetique {

    /**
     * Calcul la quantité totale d'aliments d'une recette
     * @param recipe
     * @return
     */
    public double quantityTotalRecipe(RecipePersonalized recipe){
        double quantity = 0.00;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
                quantity+=elem.getQuantity();
        }
        return quantity;
    }

    /**
     * @param recipe
     * @return
     * Calcul la quantité de viandes, poisson et oeufs d'une recette
     */
    public double quantityViandeRecipe(RecipePersonalized recipe){
        double quantity = 0.00;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if ((elem.getProduct().getCategory().isMeat()) || ((elem.getProduct().getCategory().isOther())&&(elem.getProduct().getCategory().getOther()==EGG)))
                quantity+=elem.getQuantity();
        }
        return quantity;
    }

    /**
     * @param recipe
     * @return
     * Calcul la quantité de fruits et légumes d'une recette
     */
    public double quantityFruitsLegumesRecipe(RecipePersonalized recipe){
        double quantity=0.0;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if (elem.getProduct().getCategory().isVegetable())
                quantity+=elem.getQuantity();
        }
        return quantity;
    }
    /**
     * @param recipe
     * @return
     * Calcul la quantité des féculents (céréales, légumineuses, pain,...) d'une recette
     */
    public double quantityFeculentsRecipe(RecipePersonalized recipe){
        double quantity=0.0;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if ((elem.getProduct().getCategory().isOther())&&(elem.getProduct().getCategory().getOther()==BREAD))
                quantity+=elem.getQuantity();
        }
        return quantity;
    }

    /**
     * @param recipe
     * @return quantity
     * Calcul la quantité des produits laitiers(lait, fromage, yaourt,...) d'une recette
     */
    public double quantityProduitsLaitiersRecipe(RecipePersonalized recipe){
        double quantity=0.0;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if ((elem.getProduct().getCategory().isOther())&&(elem.getProduct().getCategory().getOther()==CHEESE))
                quantity+=elem.getQuantity();
        }
        return quantity;
    }

    /**
     * Calcul poucentage de la quantité d'une catégorie d'aliments
     * @param quantityTotal
     * @param quantityCategory
     * @return
     */
    public double percentageCategory(double quantityTotal, double quantityCategory){
        double percentage = 0;
        percentage = (quantityCategory*100)/quantityTotal;
        return percentage;
    }
    /**
     * Calcul la quantité totale d'aliments d'une liste de recettes
     * @param recipes
     * @return
     */
    public double quantityTotalRecipes(List<RecipePersonalized> recipes){
        double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            quantity = this.quantityTotalRecipe(recipe);
        }
        return quantity;
    }
    /**
     * @param recipes
     * @return
     * Calcul la quantité de viandes, poisson et oeufs d'une liste de recettes
     */
    public double quantityViandeRecipes(List<RecipePersonalized> recipes){
        double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            quantity = this.quantityViandeRecipe(recipe);
        }
        return quantity;
    }
    /**
     * @param recipes
     * @return
     * Calcul la quantité de fruits et légumes d'une liste de recettes
     */
    public double quantityFruitsLegumesRecipes(List<RecipePersonalized> recipes){
        double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            quantity = this.quantityFruitsLegumesRecipe(recipe);
        }
        return quantity;
    }
    /**
     * @param recipes
     * @return
     * Calcul la quantité des féculents (céréales, légumineuses, pain,...) d'une liste de recettes
     */
    public double quantityFeculentsRecipes(List<RecipePersonalized> recipes){
        double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            quantity = this.quantityFeculentsRecipe(recipe);
        }
        return quantity;
    }
    /**
     * @param recipes
     * @return quantity
     * Calcul la quantité des produits laitiers(lait, fromage, yaourt,...) d'une liste de recettes
     */
    public double quantityProduitsLaitiersRecipes(List<RecipePersonalized> recipes){
        double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            quantity = this.quantityProduitsLaitiersRecipe(recipe);
        }
        return quantity;
    }

    /**
     * Calcul pourcentage de chaque catégorie d'aliments d'une recette
     * @param recipe
     * @return
     */
    public List<QuantityCat> analyseRecipe(RecipePersonalized recipe){
        List<QuantityCat> results = new ArrayList<>();
        double quantityTotal= quantityTotalRecipe(recipe);
        String category;
        double percentage;

        //AJOUT POURCENTAGE DES VIANDES
        double quantityCat = quantityViandeRecipe(recipe);
        category = "Viandes et Oeufs";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));

        //AJOUT POURCENTAGE DES FECULENTS
        quantityCat = quantityFeculentsRecipe(recipe);
        category="Féculents";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));

        //AJOUT POURCENTAGE FRUITS ET LEGUMES
        quantityCat = quantityFruitsLegumesRecipe(recipe);
        category="Fruits et Légumes";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));

        //AJOUT POURCENTAGE PRODUITS LAITIERS
        quantityCat = quantityProduitsLaitiersRecipe(recipe);
        category="Produits Laitiers";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));
        return results;
    }

    /**
     * Calcul pourcentage de chaque catégorie d'aliments d'une liste de recettes
     * @param recipes
     * @return
     */
    public List<QuantityCat> analyseRecipes(List<RecipePersonalized> recipes){
        List<QuantityCat> results = new ArrayList<>();
        double quantityTotal= quantityTotalRecipes(recipes);
        String category;
        double percentage;

        //AJOUT POURCENTAGE DES VIANDES
        double quantityCat = quantityViandeRecipes(recipes);
        category = "Viandes et Oeufs";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));

        //AJOUT POURCENTAGE DES FECULENTS
        quantityCat = quantityFeculentsRecipes(recipes);
        category="Féculents";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));

        //AJOUT POURCENTAGE FRUITS ET LEGUMES
        quantityCat = quantityFruitsLegumesRecipes(recipes);
        category="Fruits et Légumes";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));

        //AJOUT POURCENTAGE PRODUITS LAITIERS
        quantityCat = quantityProduitsLaitiersRecipes(recipes);
        category="Produits Laitiers";
        percentage = percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category, percentage));
        return results;
    }
    public void afficheAnalyse(List<String> results){
        System.out.println("Resultats d'analyse de votre recette :");
        for (String s : results){
            if (s!="") System.out.println(s);
        }
    }

    public List<String> recommandationRecipe(List<QuantityCat> analyse){
        List<String> results = new ArrayList<>();
        for (QuantityCat c : analyse){
            String cat = c.getCategory();
            double per = c.getPercentage();
            if(cat=="Viandes et Oeufs"){
                if (per==0) results.add("Absence de viandes, poissons, oeufs  ");
                else if (per>30) results.add("Excès de viandes, poissons ou d'oeufs  ");
                else if (per>0 && per <10) results.add("Insuffisance de viandes, poissons, oeufs  ");
            }
            else if (cat=="Produits Laitiers"){
                if (per==0) results.add("Absence produits laitiers  ");
                else if (per>30) results.add("Excès de produits laitiers  ");
            }
            else if (cat=="Fruits et Légumes" ) {
                if (per == 0) results.add("Absence de légumes  ");
                else if (per > 0 && per < 30) results.add("Insuffisance de légumes  ");
            }
            else {
                if (per==0) results.add("Absence de féculents  ");
                else if (per>30) results.add("Excès de féculents  ");
                else if (per>0 && per <10) results.add("Insuffisance de féculents  ");
            }
        }
        return results;
    }

    public List<String> recommandationRecipes(List<QuantityCat> analyse){
        List<String> results = new ArrayList<>();
        for (QuantityCat c : analyse){
            String cat = c.getCategory();
            double per = c.getPercentage();
            if(cat=="Viandes et Oeufs"){
                if (per==0) results.add("Absence de viandes, poissons, oeufs  ");
                else if (per>30) results.add("Excès de viandes, poissons ou d'oeufs  ");
                else if (per>0 && per <10) results.add("Insuffisance de viandes, poissons, oeufs  ");
            }
            else if (cat=="Produits Laitiers"){
                if (per==0) results.add("Absence produits laitiers  ");
                else if (per>30) results.add("Excès de produits laitiers  ");
            }
            else if (cat=="Fruits et Légumes" ) {
                if (per == 0) results.add("Absence de légumes  ");
                else if (per > 0 && per < 30) results.add("Insuffisance de légumes  ");
            }
            else {
                if (per==0) results.add("Absence de féculents  ");
                else if (per>30) results.add("Excès de féculents  ");
                else if (per>0 && per <10) results.add("Insuffisance de féculents  ");
            }
        }
        return results;
    }
}
