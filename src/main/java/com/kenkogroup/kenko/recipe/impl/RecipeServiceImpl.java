package com.kenkogroup.kenko.recipe.impl;
import com.kenkogroup.kenko.recipe.service.RecipeService;

import org.springframework.stereotype.Service;



@Service
public class RecipeServiceImpl implements RecipeService {
    @Override
    public double CaloriesCalculator(String age, String weight, String tall, String sexe) {
        Double weightDouble =  Double.parseDouble(weight) * 10;
        Double tallCalculator =  Double.parseDouble(tall) * 6.25;
        Double calories = weightDouble + tallCalculator;
        Double ageDouble =  (Double.parseDouble(age) * 5);
        calories -= ageDouble;
        System.out.println(sexe);

        if(sexe.equals("Homme"))
             calories += 5;
        else {  calories -= 161; }
        return calories/2;
    }

	/*@Autowired
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
*/
}