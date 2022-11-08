package com.kenkogroup.kenko.recipe.service;

import java.util.List;


import com.kenkogroup.kenko.recipe.entity.Recipe;

public interface RecipeService {
	
	public List<Recipe> getAllRecipes();
	public Recipe getRecipeById(int userId);
	public Recipe addRecipe(Recipe recipe);
	public Recipe deleteRecipe(int recipeId) throws Exception;
}
