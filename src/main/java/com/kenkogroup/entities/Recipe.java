package com.kenkogroup.entities;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
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
	@Column(name="recipeId")
	private int idRecipe;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private int caterogy;
	
	//@ElementCollection
	//private Map<String,Double> ingredients;
	
	@Column(name="description")
	private String description;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="taken")
	private boolean taken;
	
	
	public Recipe() {
		super();
	}

	public Recipe(String name, int caterogy, Map<String, Double> ingredients, String description, int duration,
			boolean taken) {
		super();
		this.name = name;
		this.caterogy = caterogy;
		//this.ingredients = ingredients;
		this.description = description;
		this.duration = duration;
		this.taken = taken;
	}
	
	

}
