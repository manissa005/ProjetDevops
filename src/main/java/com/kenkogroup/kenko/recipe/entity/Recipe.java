/*package com.kenkogroup.kenko.recipe.entity;

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
	@Column(name="recipe_id", nullable=false)
	private int idRecipe;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private int category;
	
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

	public Recipe(String name, int category, String description, int duration,
			boolean taken) {
		super();
		this.name = name;
		this.category = category;
		//this.ingredients = ingredients;
		this.description = description;
		this.duration = duration;
		this.taken = taken;
	}
	
	public int getIdRecipe() {
		return idRecipe;
	}

	public void setIdRecipe(int idRecipe) {
		this.idRecipe = idRecipe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}

	public String toString() {
		return "recipe "+idRecipe+" , name : "+name+", category : "+category+", description : "+description+", taken : "+taken;
	}
	
	

}
*/