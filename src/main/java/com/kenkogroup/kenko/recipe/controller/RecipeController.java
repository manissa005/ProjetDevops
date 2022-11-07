package com.kenkogroup.kenko.recipe.controller;

import java.util.List;

import javax.management.AttributeNotFoundException;

import com.kenkogroup.kenko.recipe.entity.Recipe;
import com.kenkogroup.kenko.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/recipe")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@GetMapping("/allRecipes")
	public ResponseEntity<List<Recipe>> getAllRecipes(){
		List<Recipe> recipes = null;
		try {
			recipes = recipeService.getAllRecipes();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<List<Recipe>>(recipes, HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Recipe> getRecipeById(@PathVariable("id") int recipeId){
		Recipe recipe = null;
		try {
			recipe = recipeService.getRecipeById(recipeId);
		}
		catch(Exception e){
			e.getMessage();
		}
		return new ResponseEntity<Recipe>(recipe, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Recipe> addRecipe(@RequestBody Recipe recipe){
		System.out.println("recette recupere : ");
		System.out.println(recipe);
		 Recipe recipe2 = null;
		try {
			recipe2 = recipeService.addRecipe(recipe);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<Recipe>(recipe2, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
    public ResponseEntity<Recipe> updateRecipe(@PathVariable int id,@RequestBody Recipe recipeDetails) {
        Recipe updateRecipe = recipeService.getRecipeById(id);
        if (updateRecipe==null) new AttributeNotFoundException("Recipe not exist with id: " + id);
        updateRecipe.setName(recipeDetails.getName());
        updateRecipe.setCategory(recipeDetails.getCategory());
        updateRecipe.setDescription(recipeDetails.getDescription());
        updateRecipe.setDuration(recipeDetails.getDuration());
        updateRecipe.setTaken(recipeDetails.isTaken());
        recipeService.addRecipe(updateRecipe);
        return ResponseEntity.ok(updateRecipe);
    }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Recipe> deleteRecipeById(@PathVariable("id") int recipeId){
		Recipe recipe = null;
		try {
			recipe = recipeService.deleteRecipe(recipeId);
		}
		catch(Exception e){
			System.out.println("catch");
			e.getMessage();
		}
		
		return new ResponseEntity<Recipe>(recipe, HttpStatus.OK);
	}
}
