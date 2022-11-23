
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
    "q",
    "from",
    "to",
    "more",
    "count",
    "hits"
})
@Generated("jsonschema2pojo")
public class Example implements Serializable
{

    @JsonProperty("q")
    private String q;
    @JsonProperty("from")
    private long from;
    @JsonProperty("to")
    private long to;
    @JsonProperty("more")
    private boolean more;
    @JsonProperty("count")
    private long count;
    @JsonProperty("hits")
    private List<Hit> hits = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5852702394824824158L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param hits
     * @param q
     * @param more
     * @param count
     * @param from
     * @param to
     */
    public Example(String q, long from, long to, boolean more, long count, List<Hit> hits) {
        super();
        this.q = q;
        this.from = from;
        this.to = to;
        this.more = more;
        this.count = count;
        this.hits = hits;
    }

    @JsonProperty("q")
    public String getQ() {
        return q;
    }

    @JsonProperty("q")
    public void setQ(String q) {
        this.q = q;
    }

    public Example withQ(String q) {
        this.q = q;
        return this;
    }

    @JsonProperty("from")
    public long getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(long from) {
        this.from = from;
    }

    public Example withFrom(long from) {
        this.from = from;
        return this;
    }

    @JsonProperty("to")
    public long getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(long to) {
        this.to = to;
    }

    public Example withTo(long to) {
        this.to = to;
        return this;
    }

    @JsonProperty("more")
    public boolean isMore() {
        return more;
    }

    @JsonProperty("more")
    public void setMore(boolean more) {
        this.more = more;
    }

    public Example withMore(boolean more) {
        this.more = more;
        return this;
    }

    @JsonProperty("count")
    public long getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(long count) {
        this.count = count;
    }

    public Example withCount(long count) {
        this.count = count;
        return this;
    }

    @JsonProperty("hits")
    public List<Hit> getHits() {
        return hits;
    }

    @JsonProperty("hits")
    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }

    public Example withHits(List<Hit> hits) {
        this.hits = hits;
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

    public Example withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Example.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("q");
        sb.append('=');
        sb.append(((this.q == null)?"<null>":this.q));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(this.from);
        sb.append(',');
        sb.append("to");
        sb.append('=');
        sb.append(this.to);
        sb.append(',');
        sb.append("more");
        sb.append('=');
        sb.append(this.more);
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(this.count);
        sb.append(',');
        sb.append("hits");
        sb.append('=');
        sb.append(((this.hits == null)?"<null>":this.hits));
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
