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

    //ANALYSEDESREPASD'UNJOUR

    /**
     *Calcullaquantitétotaled'alimentsd'unelistederecettes
     *@paramrecipes
     *@return
     */
    public double quantityTotalRecipes(List<RecipePersonalized>recipes){
        double quantity=0.0;
        for(RecipePersonalized recipe: recipes){
            quantity=this.quantityTotalRecipe(recipe);
        }
        return quantity;
    }
    /**
     *@paramrecipes
     *@return
     *Calcullaquantitédeviandes,poissonetoeufsd'unelistederecettes
     */
    public double quantityViandeRecipes(List<RecipePersonalized>recipes){
        double quantity=0.0;
        for(RecipePersonalized recipe:recipes){
            quantity=this.quantityViandeRecipe(recipe);
        }
        return quantity;
    }
    /**
     *@paramrecipes
     *@return
     *Calcullaquantitédefruitsetlégumesd'unelistederecettes
     */
    public double quantityFruitsLegumesRecipes(List<RecipePersonalized>recipes){
        double quantity=0.0;
        for(RecipePersonalized recipe:recipes){
            quantity=this.quantityFruitsLegumesRecipe(recipe);
        }
        return quantity;
    }
    /**
     *@paramrecipes
     *@return
     *Calcullaquantitédesféculents(céréales,légumineuses,pain,...)d'unelistederecettes
     */
    public double quantityFeculentsRecipes(List<RecipePersonalized>recipes){
        double quantity=0.0;
        for(RecipePersonalized recipe:recipes){
            quantity=this.quantityFeculentsRecipe(recipe);
        }
        return quantity;
    }
    /**
     *@paramrecipes
     *@returnquantity
     *Calcullaquantitédesproduitslaitiers(lait,fromage,yaourt,...)d'unelistederecettes
     */
    public double quantityProduitsLaitiersRecipes(List<RecipePersonalized>recipes){
        double quantity=0.0;
        for(RecipePersonalized recipe:recipes){
            quantity=this.quantityProduitsLaitiersRecipe(recipe);
        }
        return quantity;
    }



    /**
     *Calculpourcentagedechaquecatégoried'alimentsdesrecettesd'unejournée
     *@paramrecipes
     *@return
     */
    public List<QuantityCat>analyseDay(List<RecipePersonalized>recipes){
        List<QuantityCat>results= new ArrayList<>();
        if(recipes.size()==3){
            double quantityTotal=quantityTotalRecipes(recipes);
            String category;
            double percentage;

//AJOUTPOURCENTAGEDESVIANDES
            double quantityCat=quantityViandeRecipes(recipes);
            category="ViandesetOeufs";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEDESFECULENTS
            quantityCat=quantityFeculentsRecipes(recipes);
            category="Féculents";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEFRUITSETLEGUMES
            quantityCat=quantityFruitsLegumesRecipes(recipes);
            category="FruitsetLégumes";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEPRODUITSLAITIERS
            quantityCat=quantityProduitsLaitiersRecipes(recipes);
            category="ProduitsLaitiers";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));
        }
        return results;
    }

    public List<String>recommandationDay(List<RecipePersonalized>recipes){
        List<QuantityCat>analyse=analyseDay(recipes);
        List<String>results=new ArrayList<>();
//Analysequantitésdechaquecatégoried'alimentsselonlesnormesd'unjour
        for(QuantityCat c:analyse){
            String cat=c.getCategory();
            double per=c.getPercentage();
            double qua=c.getQuantity();
            if(cat=="ViandesetOeufs"){
                if(qua==0)results.add("Absencedeviandes,poissons,oeufs");
                else if(qua>350)results.add("Excèsdeviandes,poissonsoud'oeufs");
                else if(qua>0&&qua<250)results.add("Insuffisancedeviandes,poissons,oeufs");
            }
            else if(cat=="ProduitsLaitiers"){
                if(qua==0)results.add("Absenceproduitslaitiers");
                else if(qua>500)results.add("Excèsdeproduitslaitiers");
                else if(qua>0&&qua<150)results.add("Insufisancedeproduitslaitiers");
            }
            else if(cat=="FruitsetLégumes"){
                if(qua==0)results.add("Absencedefruitsetlégumes");
                else if(qua>0&&qua<350)results.add("Insuffisancedefruitsetlégumes");
            }
else{
                if(qua==0)results.add("Absencedeféculents");
                else if(qua>700)results.add("Excèsdeféculents");
                else if(qua>0&&qua<350)results.add("Insuffisancedeféculents");
            }
        }

//Analysedelaquantitédechaquerepasseul
        double quantityDay=quantityTotalRecipes(recipes);
        for(RecipePersonalized recipe:recipes){
            String type=recipe.getType();
            double quantityRecipe=quantityTotalRecipe(recipe);
            double percentage=percentageCategory(quantityDay,quantityRecipe);
            switch(type){
                case"petit_dej":{
                    if(percentage==0)results.add("Absencepetitdejeuner!!");
                    else if(percentage<20)results.add("Quantitéinsuffisanteaupetitdejeuner");
                }
                case"dej":{
                    if(percentage==0)results.add("Absencedejeuner!!");
                    else if(percentage<20)results.add("Quantitéinsuffisanteaudejeuner");
                }
                case"dinner":{
                    if(percentage==0)results.add("Absencedinner!!");
                    else if(percentage<20)results.add("Quantitéinsuffisanteaudinner");
                    else if(percentage>55)results.add("Quantitérecommandéedépasséeaudinner");
                }
            }
        }
        return results;
    }

    public double noteDay(){
        double note=0;
        return note;
    }

    //ANALYSE DES REPAS D'UNE SEMAINE

    /**
     *Calculpourcentagedechaquecatégoried'alimentsdesrecettesd'unesemaine
     *@paramrecipes
     *@return
     */
    public List <QuantityCat>analyseWeek(List<RecipePersonalized>recipes){
        List<QuantityCat>results=new ArrayList<>();
        if(recipes.size()==21){
            double quantityTotal=quantityTotalRecipes(recipes);
            String category;
            double percentage;

//AJOUTPOURCENTAGEDESVIANDES
            double quantityCat=quantityViandeRecipes(recipes);
            category="ViandesetOeufs";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEDESFECULENTS
            quantityCat=quantityFeculentsRecipes(recipes);
            category="Féculents";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEFRUITSETLEGUMES
            quantityCat=quantityFruitsLegumesRecipes(recipes);
            category="FruitsetLégumes";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEPRODUITSLAITIERS
            quantityCat=quantityProduitsLaitiersRecipes(recipes);
            category="ProduitsLaitiers";
            percentage=percentageCategory(quantityTotal,quantityCat);
            results.add(new QuantityCat(category,percentage,quantityCat));
        }
        return results;
    }

    public double noteWeek(){
        double note=0;
        return note;
    }


//ANALYSEDESREPASD'UNMOIS

    /**
     *Calculpourcentagedechaquecatégoried'alimentsdesrecettesd'unmois
     *@paramrecipes
     *@return
     */
    public List<QuantityCat>analyseMonth(List<RecipePersonalized>recipes){
        List<QuantityCat>results=new ArrayList<>();
        double quantityTotal=quantityTotalRecipes(recipes);
        String category;
        double percentage;

//AJOUTPOURCENTAGEDESVIANDES
        double quantityCat=quantityViandeRecipes(recipes);
        category="ViandesetOeufs";
        percentage=percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEDESFECULENTS
        quantityCat=quantityFeculentsRecipes(recipes);
        category="Féculents";
        percentage=percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEFRUITSETLEGUMES
        quantityCat=quantityFruitsLegumesRecipes(recipes);
        category="FruitsetLégumes";
        percentage=percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category,percentage,quantityCat));

//AJOUTPOURCENTAGEPRODUITSLAITIERS
        quantityCat=quantityProduitsLaitiersRecipes(recipes);
        category="ProduitsLaitiers";
        percentage=percentageCategory(quantityTotal,quantityCat);
        results.add(new QuantityCat(category,percentage,quantityCat));
        return results;
    }

    public double noteMonth(){
        double note=0;
        return note;
    }

}