
package com.nikedownloader.model.json;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "tagType",
    "tagValue"
})
public class Tag {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tagType")
    private String tagType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tagValue")
    private String tagValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tagType
     */
    @JsonProperty("tagType")
    public String getTagType() {
        return tagType;
    }

    /**
     * 
     * (Required)
     * 
     * @param tagType
     *     The tagType
     */
    @JsonProperty("tagType")
    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tagValue
     */
    @JsonProperty("tagValue")
    public String getTagValue() {
        return tagValue;
    }

    /**
     * 
     * (Required)
     * 
     * @param tagValue
     *     The tagValue
     */
    @JsonProperty("tagValue")
    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagType).append(tagValue).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tag) == false) {
            return false;
        }
        Tag rhs = ((Tag) other);
        return new EqualsBuilder().append(tagType, rhs.tagType).append(tagValue, rhs.tagValue).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
