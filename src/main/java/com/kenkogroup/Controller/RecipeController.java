package com.kenkogroup.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kenkogroup.entities.Recipe;
import com.kenkogroup.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@GetMapping("/allRecipes")
	public ResponseEntity<List<Recipe>> getAllRecipes(){
		List<Recipe> recipes = null;
		try {
			System.out.println("je suis dans try dans controller");
			recipes = recipeService.getAllRecipes();
		}
		catch(Exception e){
			e.getMessage();
			System.out.println("je suis dans catch dans controller");
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
}
