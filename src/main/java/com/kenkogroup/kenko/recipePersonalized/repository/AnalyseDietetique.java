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


    //FONCTIONS AUXILIAIRES


    /**
     * Calcul poucentage de la quantité d'une catégorie d'aliments
     *
     * @param quantityTotal
     * @param quantityCategory
     * @return
     */
    public double percentageCategory(double quantityTotal, double quantityCategory) {
        double percentage = 0;
        percentage = (quantityCategory * 100) / quantityTotal;
        return percentage;
    }

    public void afficheAnalyse(List<String> results) {
        System.out.println("Resultats d'analyse de votre recette :");
        for (String s : results) {
            if (s != "") System.out.println(s);
        }
    }

    //ANALYSE UN SEUL REPAS


    /**
     * Calcul la quantité totale d'aliments d'une recette
     *
     * @param recipe
     * @return
     */
    public double quantityTotalRecipe(RecipePersonalized recipe) {
        double quantity = 0.00;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            quantity += elem.getQuantity();
        }
        return quantity;
    }

    /**
     * @param recipe
     * @return Calcul la quantité de viandes, poisson et oeufs d'une recette
     */
    public double quantityViandeRecipe(RecipePersonalized recipe) {
        double quantity = 0.00;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if ((elem.getProduct().getCategory().isMeat()) || ((elem.getProduct().getCategory().isOther()) && (elem.getProduct().getCategory().getOther() == EGG)))
                quantity += elem.getQuantity();
        }
        return quantity;
    }

    /**
     * @param recipe
     * @return Calcul la quantité de fruits et légumes d'une recette
     */
    public double quantityFruitsLegumesRecipe(RecipePersonalized recipe) {
        double quantity = 0.0;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if (elem.getProduct().getCategory().isVegetable())
                quantity += elem.getQuantity();
        }
        return quantity;
    }

    /**
     * @param recipe
     * @return Calcul la quantité des féculents (céréales, légumineuses, pain,...) d'une recette
     */
    public double quantityFeculentsRecipe(RecipePersonalized recipe) {
        double quantity = 0.0;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if ((elem.getProduct().getCategory().isOther()) && (elem.getProduct().getCategory().getOther() == BREAD))
                quantity += elem.getQuantity();
        }
        return quantity;
    }

    /**
     * @param recipe
     * @return quantity
     * Calcul la quantité des produits laitiers(lait, fromage, yaourt,...) d'une recette
     */
    public double quantityProduitsLaitiersRecipe(RecipePersonalized recipe) {
        double quantity = 0.0;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if ((elem.getProduct().getCategory().isOther()) && (elem.getProduct().getCategory().getOther() == CHEESE))
                quantity += elem.getQuantity();
        }
        return quantity;
    }

    /**
     * Calcul pourcentage de chaque catégorie d'aliments d'une recette
     *
     * @param recipe
     * @return
     */
    public List<QuantityCat> analyseRecipe(RecipePersonalized recipe) {
        List<QuantityCat> results = new ArrayList<>();
        double quantityTotal = quantityTotalRecipe(recipe);
        String category;
        double percentage;

        //AJOUT POURCENTAGE DES VIANDES
        double quantityCat = quantityViandeRecipe(recipe);
        category = "Viandes et Oeufs";
        percentage = percentageCategory(quantityTotal, quantityCat);
        results.add(new QuantityCat(category, percentage, quantityCat));

        //AJOUT POURCENTAGE DES FECULENTS
        quantityCat = quantityFeculentsRecipe(recipe);
        category = "Féculents";
        percentage = percentageCategory(quantityTotal, quantityCat);
        results.add(new QuantityCat(category, percentage, quantityCat));

        //AJOUT POURCENTAGE FRUITS ET LEGUMES
        quantityCat = quantityFruitsLegumesRecipe(recipe);
        category = "Fruits et Légumes";
        percentage = percentageCategory(quantityTotal, quantityCat);
        results.add(new QuantityCat(category, percentage, quantityCat));

        //AJOUT POURCENTAGE PRODUITS LAITIERS
        quantityCat = quantityProduitsLaitiersRecipe(recipe);
        category = "Produits Laitiers";
        percentage = percentageCategory(quantityTotal, quantityCat);
        results.add(new QuantityCat(category, percentage, quantityCat));
        return results;
    }

    //SEPARER FRUITS ET LEGUMES
    //AJOUTER BOISSON ET SUCRE
    public List<String> recommandationRecipe(RecipePersonalized recipe) {
        List<QuantityCat> analyse = analyseRecipe(recipe);
        List<String> results = new ArrayList<>();
        String type = recipe.getType();
        switch (type) {
            case "petit_dej": {
                for (QuantityCat c : analyse) {
                    String cat = c.getCategory();
                    double per = c.getPercentage();
                    double qua = c.getQuantity();
                    if (cat == "Viandes et Oeufs") {
                        if (qua == 0) results.add("Absence de viandes, poissons, oeufs  ");
                        else if (qua > 200) results.add("Excès de viandes, poissons ou d'oeufs  ");
                        else if (qua > 0 && qua < 60) results.add("Insuffisance de viandes, poissons, oeufs  ");
                    } else if (cat == "Produits Laitiers") {
                        if (qua == 0) results.add("Absence produits laitiers  ");
                        else if (qua > 200) results.add("Excès de produits laitiers  ");
                        else if (qua > 0 && qua < 50) results.add("Insufisance de produits laitiers");
                    } else if (cat == "Fruits et Légumes") {
                        if (qua == 0) results.add("Absence de fruits et légumes  ");
                        else if (qua > 0 && qua < 100) results.add("Insuffisance de fruits et légumes  ");
                    } else {
                        if (qua == 0) results.add("Absence de féculents  ");
                        else if (qua > 200) results.add("Excès de féculents  ");
                        else if (qua > 0 && qua < 50) results.add("Insuffisance de féculents  ");
                    }
                }
            }
            case "dej": {
                for (QuantityCat c : analyse) {
                    String cat = c.getCategory();
                    double per = c.getPercentage();
                    double qua = c.getQuantity();
                    if (cat == "Viandes et Oeufs") {
                        if (qua == 0) results.add("Absence de viandes, poissons, oeufs  ");
                        else if (qua > 200) results.add("Excès de viandes, poissons ou d'oeufs  ");
                        else if (qua > 0 && qua < 60) results.add("Insuffisance de viandes, poissons, oeufs  ");
                    } else if (cat == "Produits Laitiers") {
                        if (qua == 0) results.add("Absence produits laitiers  ");
                        else if (qua > 200) results.add("Excès de produits laitiers  ");
                        else if (qua > 0 && qua < 70) results.add("Insufisance de produits laitiers");
                    } else if (cat == "Fruits et Légumes") {
                        if (qua == 0) results.add("Absence de fruits et légumes  ");
                        else if (qua > 0 && qua < 200) results.add("Insuffisance de fruits et légumes  ");
                    } else {
                        if (qua == 0) results.add("Absence de féculents  ");
                        else if (qua > 450) results.add("Excès de féculents  ");
                        else if (qua > 0 && qua < 90) results.add("Insuffisance de féculents  ");
                    }
                }
            }
            case "dinner": {
                for (QuantityCat c : analyse) {
                    String cat = c.getCategory();
                    double per = c.getPercentage();
                    double qua = c.getQuantity();
                    if (cat == "Viandes et Oeufs") {
                        if (qua == 0) results.add("Absence de viandes, poissons, oeufs  ");
                        else if (qua > 150) results.add("Excès de viandes, poissons ou d'oeufs  ");
                        else if (qua > 0 && qua < 60) results.add("Insuffisance de viandes, poissons, oeufs  ");
                    } else if (cat == "Produits Laitiers") {
                        if (qua == 0) results.add("Absence produits laitiers  ");
                        else if (qua > 150) results.add("Excès de produits laitiers  ");
                        else if (qua > 0 && qua < 70) results.add("Insufisance de produits laitiers");
                    } else if (cat == "Fruits et Légumes") {
                        if (qua == 0) results.add("Absence de fruits et légumes  ");
                        else if (qua > 0 && qua < 200) results.add("Insuffisance de fruits et légumes  ");
                    } else {
                        if (qua == 0) results.add("Absence de féculents  ");
                        else if (qua > 450) results.add("Excès de féculents  ");
                        else if (qua > 0 && qua < 90) results.add("Insuffisance de féculents  ");
                    }
                }
            }
        }
        return results;
    }

}