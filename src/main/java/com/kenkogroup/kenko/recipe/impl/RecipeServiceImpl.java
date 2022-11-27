/*package com.kenkogroup.kenko.recipe.impl;

import java.util.List;

import com.kenkogroup.kenko.recipe.entity.Recipe;
import com.kenkogroup.kenko.recipe.repository.RecipeRepository;
import com.kenkogroup.kenko.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	public RecipeRepository getRecipeRepository() {
		return recipeRepository;
	}

	@Override
	public List<Recipe> getAllRecipes() {
		return (List<Recipe>)recipeRepository.findAll();
	}

	@Override
	public Recipe getRecipeById(int recipeId) {
		return recipeRepository.findById(recipeId).orElse(null);
	}

	@Override
	public Recipe addRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
	}

	@Override
	public Recipe deleteRecipe(int recipeId) throws Exception {
		Recipe deletedRecipe = null;
		try {
			deletedRecipe = recipeRepository.findById(recipeId).orElse(null);
			if(deletedRecipe == null) {
				throw new Exception("This recipe doesn't exist");
			}
			else {
				recipeRepository.deleteById(recipeId);
			}
			
		}
		catch(Exception e) {
			throw e;
			
		}
		return deletedRecipe;
	}

}
*/