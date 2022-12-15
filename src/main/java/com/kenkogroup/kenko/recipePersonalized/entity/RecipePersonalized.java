package com.kenkogroup.kenko.recipePersonalized.entity;
import com.kenkogroup.kenko.ingredient.entity.Ingredient;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name = "recipePersonalized")
public class RecipePersonalized {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="idRecipe", nullable=false) //peut poser pb le nom de la colonne
    private int idRecipe;
    //@Column(name="name")
    private String name;
    //@Column(name="category")
    private int category;
    //@OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients;
    //@Column(name="description")
    private String description;
    //@Column(name="duration")
    private int duration;
    //@Column(name="taken")
    private boolean taken;

    public RecipePersonalized() {
    }

    public RecipePersonalized(String name, int category, List<Ingredient> ingredients, String description, int duration, boolean taken ) {
        this.name = name;
        this.category = category;
        this.ingredients=ingredients;
        this.description=description;
        this.duration =duration;
        this.taken =taken;
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
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

    @Override
    public String toString() {
        return "RecipePersonalized{" +
                "idRecipe=" + idRecipe +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", ingredients=" + ingredients +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", taken=" + taken +
                '}';
    }
}
