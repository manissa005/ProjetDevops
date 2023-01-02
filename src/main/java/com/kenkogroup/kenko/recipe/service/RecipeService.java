package com.kenkogroup.kenko.recipe.service;

import com.kenkogroup.kenko.recipe.entity.edamam.Example;

public interface RecipeService {
	double CaloriesCalculator(String age, String weight, String tall, String sexe);
}
