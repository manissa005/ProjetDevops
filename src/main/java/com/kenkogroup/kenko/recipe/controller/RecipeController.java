package com.kenkogroup.kenko.recipe.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.management.AttributeNotFoundException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kenkogroup.kenko.recipe.entity.edamam.Example;
import com.kenkogroup.kenko.recipe.entity.edamam.Hit;
import com.kenkogroup.kenko.recipe.entity.edamam.RecipeEdamam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/recipe")
public class RecipeController {

	@GetMapping("/{search}")
	public List<RecipeEdamam> getRecettes(@PathVariable String search) throws JsonProcessingException {

		String url = "https://api.edamam.com/search?q=" + search
				+ "&app_id=656be70f&app_key=036042af3e99ebf91c95f241611890b9&from=0&to=4";

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.header("Accept", "*/*")
				.header("Accept-Encoding", "deflate, br")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		String responseString = response.body();

		Example data = new ObjectMapper().readValue(responseString, Example.class);

		List<Hit> hitList = data.getHits();

		List<RecipeEdamam> recettes = new ArrayList<>();

		for (Hit hit : hitList) {
			recettes.add(hit.getRecipe());
		}
		return recettes;

	}

	@GetMapping("/{search}/recipeMax/{recipeNumber}/duration/{duration}")
	public List<RecipeEdamam> getRecettesWithNumberOfRecipeWithDuration(@PathVariable String search,@PathVariable String recipeNumber,
																		@PathVariable String duration)
			throws JsonProcessingException {
		String url = "https://api.edamam.com/search?q=" + search
				+ "&app_id=656be70f&app_key=036042af3e99ebf91c95f241611890b9&from=0&to="+recipeNumber+"&time=" + duration;

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.header("Accept", "/")
				.header("Accept-Encoding", "deflate, br")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		String responseString = response.body();

		Example data = new ObjectMapper().readValue(responseString, Example.class);

		List<Hit> hitList = data.getHits();

		List<RecipeEdamam> recettes = new ArrayList<>();

		for (Hit hit : hitList) {
			recettes.add(hit.getRecipe());
		}
		return recettes;
	}

	@GetMapping("/{age}/{weight}/{tall}/{sexe}/{mealType}")
	public List<RecipeEdamam> getRecipeWithCalories(@PathVariable String age,@PathVariable String weight,
													@PathVariable String tall, @PathVariable String sexe,@PathVariable String mealType) throws JsonProcessingException {

		Double weightDouble =  Double.parseDouble(weight) * 10;
		Double tallCalculator =  Double.parseDouble(tall) * 6.25;
		Double calories = weightDouble + tallCalculator;
		Double ageDouble =  (Double.parseDouble(age) * 5);
		calories -= ageDouble;

		if(sexe.equals("Homme"))
			calories += 5;
		else { calories -= 161; }
		List<String> ingredients = Arrays.asList("tomato", "onion","strawberry","Carrot","Garlic",
				"Potato","Orange","Kiwi","Blackberries","Apple","Milk","Butter","Cheese","meat","Beef","Chicken","Fish");
		Random random = new Random();
		System.out.println("Calories : " + calories);
		System.out.println("Calories : " + calories.intValue());
		System.out.println("Calories : " + calories.intValue());
		String url = "https://api.edamam.com/search?q="+ingredients.get(random.nextInt(ingredients.size()+1))
				+"&app_id=656be70f&app_key=036042af3e99ebf91c95f241611890b9&from=0&to=1&calories="
				+calories.intValue()+"-"+calories.intValue()+300+"&mealType="+mealType;
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.header("Accept", "/")
				.header("Accept-Encoding", "deflate, br")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		String responseString = response.body();

		Example data = new ObjectMapper().readValue(responseString, Example.class);

		List<Hit> hitList = data.getHits();

		List<RecipeEdamam> recettes = new ArrayList<>();

		for (Hit hit : hitList) {
			if(hit.getRecipe().getCalories()>2000)
				hit.getRecipe().setCalories(hit.getRecipe().getCalories()/3);
			recettes.add(hit.getRecipe());
		}
		return recettes;
	}

/*
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
	*/

}
