package com.kenkogroup.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kenkogroup.entities.Recipe;
import com.kenkogroup.repositories.RecipeRepository;
import com.kenkogroup.service.RecipeService;


@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	@Override
	public List<Recipe> getAllRecipes() {
		System.out.println("je suis dans recipeserviceimpl");
		return (List<Recipe>)recipeRepository.findAll();
	}

	@Override
	public Recipe getRecipeById(int recipeId) {
		return recipeRepository.findById(recipeId).orElse(null);
	}

	@Override
	public Recipe addOrUpdateRecipe(Recipe recipe) {
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
		}
		catch(Exception e) {
			throw e;
			
		}
		return deletedRecipe;
	}

}
