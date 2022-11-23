
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
    "label",
    "quantity",
    "unit"
})
@Generated("jsonschema2pojo")
public class Zn__1 implements Serializable
{

    @JsonProperty("label")
    private String label;
    @JsonProperty("quantity")
    private double quantity;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1332156682886405299L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Zn__1() {
    }

    /**
     * 
     * @param unit
     * @param quantity
     * @param label
     */
    public Zn__1(String label, double quantity, String unit) {
        super();
        this.label = label;
        this.quantity = quantity;
        this.unit = unit;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Zn__1 withLabel(String label) {
        this.label = label;
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

    public Zn__1 withQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Zn__1 withUnit(String unit) {
        this.unit = unit;
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

    public Zn__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Zn__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(this.quantity);
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
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
