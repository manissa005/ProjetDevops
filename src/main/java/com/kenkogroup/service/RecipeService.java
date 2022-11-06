package com.kenkogroup.service;

import java.util.List;

import com.kenkogroup.entities.Recipe;

public interface RecipeService {
	
	public List<Recipe> getAllRecipes();
	public Recipe getRecipeById(int userId);
	public Recipe addRecipe(Recipe recipe);
	public Recipe deleteRecipe(int recipeId) throws Exception;

}
