package com.kenkogroup.kenko.recipePersonalized.service;

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
    public List <String> analyseRecipePerso(RecipePersonalized recipePerso){
        return analyse.analyseRecipe(recipePerso);
    }

    public List<String> analyseRecipes(List<RecipePersonalized> recipes){
        return analyse.analyseRecipes(recipes);
    }
}
