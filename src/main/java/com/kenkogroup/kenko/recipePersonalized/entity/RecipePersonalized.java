package com.kenkogroup.kenko.recipePersonalized.entity;
import com.kenkogroup.kenko.product.entity.Product;

import java.util.Map;

public class RecipePersonalized {

    private int idRecipe;
    private String name;
    private int category;
    private Map<Double,Product> ingredients;
    private String description;
    private int duration;
    private boolean taken;

    public RecipePersonalized() {
    }

    public RecipePersonalized(String name, int category, Map<Double,Product> ingredients, String description, int duration, boolean taken ) {
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

    public Map<Double,Product> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Double,Product> ingredients) {
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
