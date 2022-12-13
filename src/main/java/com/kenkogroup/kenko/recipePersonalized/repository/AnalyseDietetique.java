package com.kenkogroup.kenko.recipePersonalized.repository;
import com.kenkogroup.kenko.category.entity.Meat;
import com.kenkogroup.kenko.category.entity.Other;
import com.kenkogroup.kenko.category.entity.Vegetable;
import com.kenkogroup.kenko.ingredient.Ingredient;
import com.kenkogroup.kenko.product.entity.Product;
import com.kenkogroup.kenko.recipePersonalized.entity.RecipePersonalized;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.kenkogroup.kenko.category.entity.Other.BREAD;
import static com.kenkogroup.kenko.category.entity.Other.EGG;

@Service
public class AnalyseDietetique {

    public List<String> analyseIngredients(RecipePersonalized recipe){
        List<String> results = new ArrayList<>();
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients){
            if(elem.getProduct().getCategory().isOther()){
                results.add(elem.getProduct().getCategory().getOther().analyse(elem.getQuantity()));
                System.out.println("other ajoute");
            }
            else {
                if (elem.getProduct().getCategory().isMeat()) {
                    results.add(elem.getProduct().getCategory().getMeat().analyse(elem.getQuantity()));
                    System.out.println("viande ajoute");
                } else {
                    results.add(elem.getProduct().getCategory().getVegetable().analyse(elem.getQuantity()));
                    System.out.println("legume ajoute");
                }
            }
        }
        return results;
    }

    public String analyseQuantiteProteine(RecipePersonalized recipe) {
        String result = "";
        List<Ingredient> ingredients = recipe.getIngredients();
        List<Product> proteines = new ArrayList<>();
        for (Ingredient elem : ingredients) {
            if ((elem.getProduct().getCategory().isMeat())) {proteines.add(elem.getProduct());}
            if ((elem.getProduct().getCategory().isOther())&&(elem.getProduct().getCategory().getOther()==EGG)) proteines.add(elem.getProduct());
        }
        if (proteines.size()>=2) {
            result = "La quantité recommandée de Proteines est dépassée : on ne peut pas avoir ";
            for (Product p : proteines) {
                result+= p.getName()+" ";
            }
            result+="dans une meme recette";
        }
        else result = "pas de depassement proteine";
        return result;
    }
    public  String analyseQuantiteLegumes(RecipePersonalized recipe){
        String result  ="";
        Double quantite=0.0;
        List<Ingredient> ingredients = recipe.getIngredients();
        for (Ingredient elem : ingredients) {
            if (elem.getProduct().getCategory().isVegetable()) quantite+=elem.getQuantity();
        }
        if(quantite==0.0) result = "Il n y a aucun légumes dans votre recette : une portion d'au moins 150 grammes de légumes est recommandés";
        else if(quantite<150.0) result = "La quantité de légumes dans votre recette est très basse : une portion d'au moins 150 grammes de légumes est recommandés";
        return result;
    }

    public List<String> analyseRecipe(RecipePersonalized recipe){
        List<String> results = new ArrayList<>();
        results.addAll(analyseIngredients(recipe));
        results.add(analyseQuantiteLegumes(recipe));
        results.add(analyseQuantiteProteine(recipe));

        return results;
    }

    public Double calculProteines(List<RecipePersonalized> recipes){
        Double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            List<Ingredient> ingredients = recipe.getIngredients();
            for (Ingredient elem : ingredients) {
                if ((elem.getProduct().getCategory().isMeat()) || ((elem.getProduct().getCategory().isOther())&&(elem.getProduct().getCategory().getOther()==EGG)))
                    quantity+=elem.getQuantity();
            }
        }
        return quantity;
    }
    public String analyseProteine(List<RecipePersonalized> recipes){
        String result = "";
        Double quantity = 0.0;
        quantity = calculProteines(recipes);
        if(quantity == 0.0) result = "Il y a 0 proteines dans vos repas, une quantité d'environ 200g d'aliments contenant des proteines est recommandée ";
        else if (quantity>250.0) result = "La quantité recommandée de Proteines est dépassée";
            else if (quantity>0.0 && quantity <100.0) result = "La quantité d'aliments contenant des proteines est très basse";
        return result;
    }

    public Double calculFruitsLegumes(List<RecipePersonalized> recipes){
        Double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            List<Ingredient> ingredients = recipe.getIngredients();
            for (Ingredient elem : ingredients) {
                if (elem.getProduct().getCategory().isVegetable())
                    quantity+=elem.getQuantity();
            }
        }
        return quantity;
    }
    public String analyseFruitsLegumes(List<RecipePersonalized> recipes){
        String result = "";
        Double quantity = 0.0;
        quantity= calculFruitsLegumes(recipes);
        if(quantity == 0.0) result = "Il y a 0 fruits et legumes dans vos repas, une quantité d'environ 400g a 500G de fruits et legumes est recommandée ";
        else if (quantity <400.0) result = "La quantité de fruits et legumes est très basse, une quantité d'environ 400g a 500G de fruits et legumes est recommandée";
        return result;
    }

    public Double calculFeculents(List<RecipePersonalized> recipes){
        Double quantity = 0.0;
        for (RecipePersonalized recipe : recipes){
            List<Ingredient> ingredients = recipe.getIngredients();
            for (Ingredient elem : ingredients) {
                if ((elem.getProduct().getCategory().isOther()) && elem.getProduct().getCategory().getOther() == BREAD)
                    quantity+=elem.getQuantity();
            }
        }
        return quantity;
    }

    public String analyseFeculents(List<RecipePersonalized> recipes){
        String result = "";
        Double quantity = 0.0;
        quantity= calculFeculents(recipes);
        if(quantity == 0.0) result = "Il y a 0 féculents dans vos repas, une quantité d'environ 500g a 600g de féculents est recommandée ";
        else if (quantity <300.0) result = "La quantité de féculents est très basse, une quantité d'environ 500g a 600g de feculents est recommandée";
            else if (quantity>700.0) result = "La quantité recommandée de Proteines est dépassée";
        return result;
    }
    public List<String> analyseRecipes(List<RecipePersonalized> recipes){
        List<String> results = new ArrayList<>();
        results.add(analyseProteine(recipes));
        results.add(analyseFruitsLegumes(recipes));
        results.add(analyseFeculents(recipes));
        return results;
    }
    public void afficheAnalyse(List<String> results){
        System.out.println("Resultats d'analyse de votre recette :");
        for (String s : results){
            if (s!="") System.out.println(s);
        }
    }
    public static void main(String [] args){
        //liste des produits
     /*   Product p1 = new Product(1,"tomate",Vegetable.TOMATO);
        Product p2 = new Product(2,"broc",Vegetable.BROCOLI);
        Product p3 = new Product(3,"corn",Vegetable.CORN);
        Product p4 = new Product(4,"celery",Vegetable.CELERY);
        Product p5 = new Product(5,"pea",Vegetable.PEA);
        Product p6 = new Product(6,"epinard",Vegetable.SPINACH);
        Product p7 = new Product(7,"pomme terre",Vegetable.POTATO);
        Product p8 = new Product(8,"poivron",Vegetable.PEPPER);
        Product p9 = new Product(9,"onion",Vegetable.ONION);

        Product v1 = new Product(10,"poulet", Meat.CHICKEN);
        Product v2 = new Product(11,"Viande", Meat.MEAT);
        Product v3 = new Product(12,"fish", Meat.FISH);

        Product o1 = new Product(13,"pain", Other.BREAD);
        Product o2 = new Product(14,"oeufs", Other.EGG);
        Product o3 = new Product(15,"cheese", Other.CHEESE);
        //liste ingredients
        Map<Double,Product> ingredients1 = new HashMap<>();
        ingredients1.put(120.0,v1);
        ingredients1.put(80.0,o3);
        ingredients1.put(80.0,o1);
        Map<Double,Product> ingredients2 = new HashMap<>();
        ingredients2.put(p1,100.0);
        ingredients2.put(p7,20.0);
        ingredients2.put(v1,120.0);
        ingredients2.put(o3,80.0);
        ingredients2.put(o1,80.0);
        Map<Double,Product> ingredients3 = new HashMap<>();
        ingredients3.put(p1,100.0);
        ingredients3.put(p7,100.0);
        ingredients3.put(v1,120.0);
        ingredients3.put(v3,100.0);
        Map<Double,Product> ingredients4 = new HashMap<>();
        ingredients4.put(p1,100.0);
        ingredients4.put(p7,100.0);
        ingredients4.put(v1,120.0);
        ingredients4.put(o2,1.0);
        Map<Double,Product> ingredients5 = new HashMap<>();
        ingredients5.put(p1,100.0);
        ingredients5.put(p7,100.0);
        ingredients5.put(v1,120.0);
        ingredients5.put(v3,100.0);
        ingredients5.put(o2,2.0);
        Map<Double,Product> ingredients6 = new HashMap<>();
        ingredients6.put(p1,200.0);
        ingredients6.put(p2,200.0);
        ingredients6.put(p3,200.0);
        ingredients6.put(p4,200.0);
        ingredients6.put(p5,200.0);
        ingredients6.put(p6,200.0);
        ingredients6.put(p7,200.0);
        ingredients6.put(p8,200.0);
        ingredients6.put(p9,200.0);
        Map<Product,Double> ingredients7 = new HashMap<>();
        ingredients7.put(v1,120.0);
        ingredients7.put(v3,100.0);
        ingredients7.put(o2,2.0);
        ingredients7.put(p1,100.0);
        ingredients7.put(p2,300.0);
        ingredients7.put(p3,300.0);
        ingredients7.put(p4,300.0);
        ingredients7.put(p5,300.0);
        ingredients7.put(p6,200.0);
        ingredients7.put(p7,200.0);
        ingredients7.put(p8,200.0);
        ingredients7.put(p9,200.0);
        //liste recettes a tester
        RecipePersonalized recipe1 = new RecipePersonalized("recipe1",1,ingredients1,"recette perso 1",10,false);
        RecipePersonalized recipe2 = new RecipePersonalized("recipe2",1,ingredients2,"recette perso 2",10,false);
        RecipePersonalized recipe3 = new RecipePersonalized("recipe3",1,ingredients3,"recette perso 3",10,false);
        RecipePersonalized recipe4 = new RecipePersonalized("recipe4",1,ingredients4,"recette perso 4",10,false);
        RecipePersonalized recipe5 = new RecipePersonalized("recipe5",1,ingredients5,"recette perso 5",10,false);
        RecipePersonalized recipe6 = new RecipePersonalized("recipe6",1,ingredients6,"recette perso 6",10,false);
        RecipePersonalized recipe7 = new RecipePersonalized("recipe7",1,ingredients7,"recette perso 7",10,false);
        //affichage
        AnalyseDietetique analyse = new AnalyseDietetique();
        analyse.afficheAnalyse(analyse.analyseRecipe(recipe1));
        analyse.afficheAnalyse(analyse.analyseRecipe(recipe2));
        analyse.afficheAnalyse(analyse.analyseRecipe(recipe3));
        analyse.afficheAnalyse(analyse.analyseRecipe(recipe4));
        analyse.afficheAnalyse(analyse.analyseRecipe(recipe5));
        analyse.afficheAnalyse(analyse.analyseRecipe(recipe6));
        analyse.afficheAnalyse(analyse.analyseRecipe(recipe7)); */
    }
}
