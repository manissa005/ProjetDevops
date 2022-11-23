
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
    "label",
    "tag",
    "schemaOrgTag",
    "total",
    "hasRDI",
    "daily",
    "unit",
    "sub"
})
@Generated("jsonschema2pojo")
public class Digest implements Serializable
{

    @JsonProperty("label")
    private String label;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("schemaOrgTag")
    private Object schemaOrgTag;
    @JsonProperty("total")
    private double total;
    @JsonProperty("hasRDI")
    private boolean hasRDI;
    @JsonProperty("daily")
    private double daily;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("sub")
    private List<Sub> sub = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4006667361112121474L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Digest() {
    }

    /**
     * 
     * @param schemaOrgTag
     * @param sub
     * @param total
     * @param unit
     * @param daily
     * @param hasRDI
     * @param label
     * @param tag
     */
    public Digest(String label, String tag, Object schemaOrgTag, double total, boolean hasRDI, double daily, String unit, List<Sub> sub) {
        super();
        this.label = label;
        this.tag = tag;
        this.schemaOrgTag = schemaOrgTag;
        this.total = total;
        this.hasRDI = hasRDI;
        this.daily = daily;
        this.unit = unit;
        this.sub = sub;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Digest withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Digest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    @JsonProperty("schemaOrgTag")
    public Object getSchemaOrgTag() {
        return schemaOrgTag;
    }

    @JsonProperty("schemaOrgTag")
    public void setSchemaOrgTag(Object schemaOrgTag) {
        this.schemaOrgTag = schemaOrgTag;
    }

    public Digest withSchemaOrgTag(Object schemaOrgTag) {
        this.schemaOrgTag = schemaOrgTag;
        return this;
    }

    @JsonProperty("total")
    public double getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(double total) {
        this.total = total;
    }

    public Digest withTotal(double total) {
        this.total = total;
        return this;
    }

    @JsonProperty("hasRDI")
    public boolean isHasRDI() {
        return hasRDI;
    }

    @JsonProperty("hasRDI")
    public void setHasRDI(boolean hasRDI) {
        this.hasRDI = hasRDI;
    }

    public Digest withHasRDI(boolean hasRDI) {
        this.hasRDI = hasRDI;
        return this;
    }

    @JsonProperty("daily")
    public double getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(double daily) {
        this.daily = daily;
    }

    public Digest withDaily(double daily) {
        this.daily = daily;
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

    public Digest withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @JsonProperty("sub")
    public List<Sub> getSub() {
        return sub;
    }

    @JsonProperty("sub")
    public void setSub(List<Sub> sub) {
        this.sub = sub;
    }

    public Digest withSub(List<Sub> sub) {
        this.sub = sub;
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

    public Digest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Digest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("schemaOrgTag");
        sb.append('=');
        sb.append(((this.schemaOrgTag == null)?"<null>":this.schemaOrgTag));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(this.total);
        sb.append(',');
        sb.append("hasRDI");
        sb.append('=');
        sb.append(this.hasRDI);
        sb.append(',');
        sb.append("daily");
        sb.append('=');
        sb.append(this.daily);
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("sub");
        sb.append('=');
        sb.append(((this.sub == null)?"<null>":this.sub));
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
