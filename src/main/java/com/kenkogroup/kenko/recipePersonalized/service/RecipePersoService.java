package com.kenkogroup.kenko.recipePersonalized.service;

import com.kenkogroup.kenko.Quantity.QuantityCat;
import com.kenkogroup.kenko.recipePersonalized.entity.RecipePersonalized;
import com.kenkogroup.kenko.recipePersonalized.repository.AnalyseDietetique;
import com.kenkogroup.kenko.recipePersonalized.repository.BaseDonnee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecipePersoService {

    @Autowired
    private BaseDonnee base;
    @Autowired
    private AnalyseDietetique analyse;

    public BaseDonnee getBase() {
        return base;
    }

    public void setBase(BaseDonnee base) {
        this.base = base;
    }
    public AnalyseDietetique getAnalyse() {
        return analyse;
    }

    public void addRecipePerso (RecipePersonalized recipePerso){

        base.addRecipePerso(recipePerso);
    }
    public void updateRecipePerso (int id,RecipePersonalized recipePerso){

        base.updateRecipePerso(id,recipePerso);
    }
    public void deleteRecipePerso (int id){

        base.deleteRecipePerso(id);
    }
    public List <QuantityCat> analyseRecipe(RecipePersonalized recipe){
        return analyse.analyseRecipe(recipe);
    }

    public List<QuantityCat> analyseDay(List<RecipePersonalized> recipes){
        return analyse.analyseDay(recipes);
    }
    public List<String> recommandationRecipe(RecipePersonalized recipe){
        return analyse.recommandationRecipe(recipe);
    }
    public List<String> recommandationDay(List<RecipePersonalized> recipes){
        return analyse.recommandationDay(recipes);
    }

    public List<QuantityCat> analyseWeek(List<RecipePersonalized> recipes){
        return analyse.analyseWeek(recipes);
    }
    public List<QuantityCat> analyseMonth(List<RecipePersonalized> recipes){
        return analyse.analyseMonth(recipes);
    }

    public List<String> recommandationWeek(List<RecipePersonalized> recipes){
        return analyse.recommandationWeek(recipes);
    }

    public List<String> recommandationMonth(List<RecipePersonalized> recipes){
        return analyse.recommandationMonth(recipes);
    }
}
