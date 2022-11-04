package com.kenkogroup.entities;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRecipe;
	private String name;
	private String caterogy;
	private Map<String,Double> ingredients;
	private String description;
	private Long duration;
	private boolean taken;
	
	
	public Recipe() {
		super();
	}

	public Recipe(String name, String caterogy, Map<String, Double> ingredients, String description, Long duration,
			boolean taken) {
		super();
		this.name = name;
		this.caterogy = caterogy;
		this.ingredients = ingredients;
		this.description = description;
		this.duration = duration;
		this.taken = taken;
	}
	
	

}
