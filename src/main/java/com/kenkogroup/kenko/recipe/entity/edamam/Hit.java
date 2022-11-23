
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
    "recipe"
})
@Generated("jsonschema2pojo")
public class Hit implements Serializable
{

    @JsonProperty("recipe")
    private RecipeEdamam recipe;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8197256028772567418L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hit() {
    }

    /**
     * 
     * @param recipe
     */
    public Hit(RecipeEdamam recipe) {
        super();
        this.recipe = recipe;
    }

    @JsonProperty("recipe")
    public RecipeEdamam getRecipe() {
        return recipe;
    }

    @JsonProperty("recipe")
    public void setRecipe(RecipeEdamam recipe) {
        this.recipe = recipe;
    }

    public Hit withRecipe(RecipeEdamam recipe) {
        this.recipe = recipe;
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

    public Hit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recipe");
        sb.append('=');
        sb.append(((this.recipe == null)?"<null>":this.recipe));
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
