package com.kenkogroup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenkogroup.entities.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

	
}
