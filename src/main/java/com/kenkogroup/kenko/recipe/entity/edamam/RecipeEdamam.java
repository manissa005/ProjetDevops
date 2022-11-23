
package com.kenkogroup.kenko.recipe.entity.edamam;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "uri",
        "label",
        "image",
        "source",
        "url",
        "shareAs",
        "yield",
        "dietLabels",
        "healthLabels",
        "cautions",
        "ingredientLines",
        "ingredients",
        "calories",
        "totalWeight",
        "totalTime",
        "cuisineType",
        "mealType",
        "dishType",
        "totalNutrients",
        "totalDaily",
        "digest"
})
@Generated("jsonschema2pojo")
public class RecipeEdamam implements Serializable {

    @JsonProperty("uri")
    private String uri;
    @JsonProperty("label")
    private String label;
    @JsonProperty("image")
    private String image;
    @JsonProperty("source")
    private String source;
    @JsonProperty("url")
    private String url;
    @JsonProperty("shareAs")
    private String shareAs;
    @JsonProperty("yield")
    private double yield;
    @JsonProperty("dietLabels")
    private List<String> dietLabels = null;
    @JsonProperty("healthLabels")
    private List<String> healthLabels = null;
    @JsonProperty("cautions")
    private List<String> cautions = null;
    @JsonProperty("ingredientLines")
    private List<String> ingredientLines = null;
    @JsonProperty("ingredients")
    private List<Ingredient> ingredients = null;
    @JsonProperty("calories")
    private double calories;
    @JsonProperty("totalWeight")
    private double totalWeight;
    @JsonProperty("totalTime")
    private double totalTime;
    @JsonProperty("cuisineType")
    private List<String> cuisineType = null;
    @JsonProperty("mealType")
    private List<String> mealType = null;
    @JsonProperty("dishType")
    private List<String> dishType = null;
    @JsonProperty("totalNutrients")
    private TotalNutrients totalNutrients;
    @JsonProperty("totalDaily")
    private TotalDaily totalDaily;
    @JsonProperty("digest")
    private List<Digest> digest = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1540829111083965838L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecipeEdamam() {
    }

    /**
     * 
     * @param image
     * @param shareAs
     * @param cautions
     * @param healthLabels
     * @param totalTime
     * @param mealType
     * @param label
     * @param source
     * @param calories
     * @param cuisineType
     * @param uri
     * @param url
     * @param totalNutrients
     * @param dietLabels
     * @param dishType
     * @param yield
     * @param totalWeight
     * @param digest
     * @param ingredients
     * @param totalDaily
     * @param ingredientLines
     */
    public RecipeEdamam(String uri, String label, String image, String source, String url, String shareAs, double yield,
                        List<String> dietLabels, List<String> healthLabels, List<String> cautions, List<String> ingredientLines,
                        List<Ingredient> ingredients, double calories, double totalWeight, double totalTime,
                        List<String> cuisineType, List<String> mealType, List<String> dishType, TotalNutrients totalNutrients,
                        TotalDaily totalDaily, List<Digest> digest) {
        super();
        this.uri = uri;
        this.label = label;
        this.image = image;
        this.source = source;
        this.url = url;
        this.shareAs = shareAs;
        this.yield = yield;
        this.dietLabels = dietLabels;
        this.healthLabels = healthLabels;
        this.cautions = cautions;
        this.ingredientLines = ingredientLines;
        this.ingredients = ingredients;
        this.calories = calories;
        this.totalWeight = totalWeight;
        this.totalTime = totalTime;
        this.cuisineType = cuisineType;
        this.mealType = mealType;
        this.dishType = dishType;
        this.totalNutrients = totalNutrients;
        this.totalDaily = totalDaily;
        this.digest = digest;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public RecipeEdamam withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public RecipeEdamam withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public RecipeEdamam withImage(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public RecipeEdamam withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public RecipeEdamam withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("shareAs")
    public String getShareAs() {
        return shareAs;
    }

    @JsonProperty("shareAs")
    public void setShareAs(String shareAs) {
        this.shareAs = shareAs;
    }

    public RecipeEdamam withShareAs(String shareAs) {
        this.shareAs = shareAs;
        return this;
    }

    @JsonProperty("yield")
    public double getYield() {
        return yield;
    }

    @JsonProperty("yield")
    public void setYield(double yield) {
        this.yield = yield;
    }

    public RecipeEdamam withYield(double yield) {
        this.yield = yield;
        return this;
    }

    @JsonProperty("dietLabels")
    public List<String> getDietLabels() {
        return dietLabels;
    }

    @JsonProperty("dietLabels")
    public void setDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public RecipeEdamam withDietLabels(List<String> dietLabels) {
        this.dietLabels = dietLabels;
        return this;
    }

    @JsonProperty("healthLabels")
    public List<String> getHealthLabels() {
        return healthLabels;
    }

    @JsonProperty("healthLabels")
    public void setHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public RecipeEdamam withHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
        return this;
    }

    @JsonProperty("cautions")
    public List<String> getCautions() {
        return cautions;
    }

    @JsonProperty("cautions")
    public void setCautions(List<String> cautions) {
        this.cautions = cautions;
    }

    public RecipeEdamam withCautions(List<String> cautions) {
        this.cautions = cautions;
        return this;
    }

    @JsonProperty("ingredientLines")
    public List<String> getIngredientLines() {
        return ingredientLines;
    }

    @JsonProperty("ingredientLines")
    public void setIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    public RecipeEdamam withIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
        return this;
    }

    @JsonProperty("ingredients")
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public RecipeEdamam withIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @JsonProperty("calories")
    public double getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(double calories) {
        this.calories = calories;
    }

    public RecipeEdamam withCalories(double calories) {
        this.calories = calories;
        return this;
    }

    @JsonProperty("totalWeight")
    public double getTotalWeight() {
        return totalWeight;
    }

    @JsonProperty("totalWeight")
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public RecipeEdamam withTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    @JsonProperty("totalTime")
    public double getTotalTime() {
        return totalTime;
    }

    @JsonProperty("totalTime")
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public RecipeEdamam withTotalTime(double totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    @JsonProperty("cuisineType")
    public List<String> getCuisineType() {
        return cuisineType;
    }

    @JsonProperty("cuisineType")
    public void setCuisineType(List<String> cuisineType) {
        this.cuisineType = cuisineType;
    }

    public RecipeEdamam withCuisineType(List<String> cuisineType) {
        this.cuisineType = cuisineType;
        return this;
    }

    @JsonProperty("mealType")
    public List<String> getMealType() {
        return mealType;
    }

    @JsonProperty("mealType")
    public void setMealType(List<String> mealType) {
        this.mealType = mealType;
    }

    public RecipeEdamam withMealType(List<String> mealType) {
        this.mealType = mealType;
        return this;
    }

    @JsonProperty("dishType")
    public List<String> getDishType() {
        return dishType;
    }

    @JsonProperty("dishType")
    public void setDishType(List<String> dishType) {
        this.dishType = dishType;
    }

    public RecipeEdamam withDishType(List<String> dishType) {
        this.dishType = dishType;
        return this;
    }

    @JsonProperty("totalNutrients")
    public TotalNutrients getTotalNutrients() {
        return totalNutrients;
    }

    @JsonProperty("totalNutrients")
    public void setTotalNutrients(TotalNutrients totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    public RecipeEdamam withTotalNutrients(TotalNutrients totalNutrients) {
        this.totalNutrients = totalNutrients;
        return this;
    }

    @JsonProperty("totalDaily")
    public TotalDaily getTotalDaily() {
        return totalDaily;
    }

    @JsonProperty("totalDaily")
    public void setTotalDaily(TotalDaily totalDaily) {
        this.totalDaily = totalDaily;
    }

    public RecipeEdamam withTotalDaily(TotalDaily totalDaily) {
        this.totalDaily = totalDaily;
        return this;
    }

    @JsonProperty("digest")
    public List<Digest> getDigest() {
        return digest;
    }

    @JsonProperty("digest")
    public void setDigest(List<Digest> digest) {
        this.digest = digest;
    }

    public RecipeEdamam withDigest(List<Digest> digest) {
        this.digest = digest;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RecipeEdamam withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecipeEdamam.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null) ? "<null>" : this.uri));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null) ? "<null>" : this.label));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null) ? "<null>" : this.image));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null) ? "<null>" : this.source));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("shareAs");
        sb.append('=');
        sb.append(((this.shareAs == null) ? "<null>" : this.shareAs));
        sb.append(',');
        sb.append("yield");
        sb.append('=');
        sb.append(this.yield);
        sb.append(',');
        sb.append("dietLabels");
        sb.append('=');
        sb.append(((this.dietLabels == null) ? "<null>" : this.dietLabels));
        sb.append(',');
        sb.append("healthLabels");
        sb.append('=');
        sb.append(((this.healthLabels == null) ? "<null>" : this.healthLabels));
        sb.append(',');
        sb.append("cautions");
        sb.append('=');
        sb.append(((this.cautions == null) ? "<null>" : this.cautions));
        sb.append(',');
        sb.append("ingredientLines");
        sb.append('=');
        sb.append(((this.ingredientLines == null) ? "<null>" : this.ingredientLines));
        sb.append(',');
        sb.append("ingredients");
        sb.append('=');
        sb.append(((this.ingredients == null) ? "<null>" : this.ingredients));
        sb.append(',');
        sb.append("calories");
        sb.append('=');
        sb.append(this.calories);
        sb.append(',');
        sb.append("totalWeight");
        sb.append('=');
        sb.append(this.totalWeight);
        sb.append(',');
        sb.append("totalTime");
        sb.append('=');
        sb.append(this.totalTime);
        sb.append(',');
        sb.append("cuisineType");
        sb.append('=');
        sb.append(((this.cuisineType == null) ? "<null>" : this.cuisineType));
        sb.append(',');
        sb.append("mealType");
        sb.append('=');
        sb.append(((this.mealType == null) ? "<null>" : this.mealType));
        sb.append(',');
        sb.append("dishType");
        sb.append('=');
        sb.append(((this.dishType == null) ? "<null>" : this.dishType));
        sb.append(',');
        sb.append("totalNutrients");
        sb.append('=');
        sb.append(((this.totalNutrients == null) ? "<null>" : this.totalNutrients));
        sb.append(',');
        sb.append("totalDaily");
        sb.append('=');
        sb.append(((this.totalDaily == null) ? "<null>" : this.totalDaily));
        sb.append(',');
        sb.append("digest");
        sb.append('=');
        sb.append(((this.digest == null) ? "<null>" : this.digest));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
