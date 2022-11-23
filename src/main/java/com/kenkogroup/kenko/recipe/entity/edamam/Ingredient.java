
package com.kenkogroup.kenko.recipe.entity.edamam;

import java.io.Serializable;
import java.util.HashMap;
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
    "text",
    "quantity",
    "measure",
    "food",
    "weight",
    "foodCategory",
    "foodId",
    "image"
})
@Generated("jsonschema2pojo")
public class Ingredient implements Serializable
{

    @JsonProperty("text")
    private String text;
    @JsonProperty("quantity")
    private double quantity;
    @JsonProperty("measure")
    private Object measure;
    @JsonProperty("food")
    private String food;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("foodCategory")
    private String foodCategory;
    @JsonProperty("foodId")
    private String foodId;
    @JsonProperty("image")
    private String image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5209726388478177273L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ingredient() {
    }

    /**
     * 
     * @param image
     * @param quantity
     * @param measure
     * @param foodId
     * @param weight
     * @param text
     * @param foodCategory
     * @param food
     */
    public Ingredient(String text, double quantity, Object measure, String food, double weight, String foodCategory, String foodId, String image) {
        super();
        this.text = text;
        this.quantity = quantity;
        this.measure = measure;
        this.food = food;
        this.weight = weight;
        this.foodCategory = foodCategory;
        this.foodId = foodId;
        this.image = image;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Ingredient withText(String text) {
        this.text = text;
        return this;
    }

    @JsonProperty("quantity")
    public double getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Ingredient withQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonProperty("measure")
    public Object getMeasure() {
        return measure;
    }

    @JsonProperty("measure")
    public void setMeasure(Object measure) {
        this.measure = measure;
    }

    public Ingredient withMeasure(Object measure) {
        this.measure = measure;
        return this;
    }

    @JsonProperty("food")
    public String getFood() {
        return food;
    }

    @JsonProperty("food")
    public void setFood(String food) {
        this.food = food;
    }

    public Ingredient withFood(String food) {
        this.food = food;
        return this;
    }

    @JsonProperty("weight")
    public double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Ingredient withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @JsonProperty("foodCategory")
    public String getFoodCategory() {
        return foodCategory;
    }

    @JsonProperty("foodCategory")
    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public Ingredient withFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
        return this;
    }

    @JsonProperty("foodId")
    public String getFoodId() {
        return foodId;
    }

    @JsonProperty("foodId")
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public Ingredient withFoodId(String foodId) {
        this.foodId = foodId;
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

    public Ingredient withImage(String image) {
        this.image = image;
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

    public Ingredient withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ingredient.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(this.quantity);
        sb.append(',');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
        sb.append(',');
        sb.append("food");
        sb.append('=');
        sb.append(((this.food == null)?"<null>":this.food));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(this.weight);
        sb.append(',');
        sb.append("foodCategory");
        sb.append('=');
        sb.append(((this.foodCategory == null)?"<null>":this.foodCategory));
        sb.append(',');
        sb.append("foodId");
        sb.append('=');
        sb.append(((this.foodId == null)?"<null>":this.foodId));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
