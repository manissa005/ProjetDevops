package com.kenkogroup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kenkogroup.entities.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

	
}
