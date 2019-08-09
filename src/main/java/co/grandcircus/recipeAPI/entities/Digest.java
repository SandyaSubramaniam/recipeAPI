package co.grandcircus.recipeAPI.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "label", "tag", "schemaOrgTag", "total", "hasRDI", "daily", "unit", "sub" })
public class Digest {

	private String label;

	private String tag;

	private Object schemaOrgTag;

	private Double total;

	private Boolean hasRDI;

	private Double daily;

	private String unit;

	private List<Sub> sub = null;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getLabel() {

		return label;
	}

	public void setLabel(String label) {

		this.label = label;
	}

	public String getTag() {

		return tag;
	}

	public void setTag(String tag) {

		this.tag = tag;
	}

	public Object getSchemaOrgTag() {

		return schemaOrgTag;
	}

	public void setSchemaOrgTag(Object schemaOrgTag) {

		this.schemaOrgTag = schemaOrgTag;
	}

	public Double getTotal() {

		return total;
	}

	public void setTotal(Double total) {

		this.total = total;
	}

	public Boolean getHasRDI() {

		return hasRDI;
	}

	public void setHasRDI(Boolean hasRDI) {

		this.hasRDI = hasRDI;
	}

	public Double getDaily() {

		return daily;
	}

	public void setDaily(Double daily) {

		this.daily = daily;
	}

	public String getUnit() {

		return unit;
	}

	public void setUnit(String unit) {

		this.unit = unit;
	}

	public List<Sub> getSub() {

		return sub;
	}

	@JsonProperty("sub")
	public void setSub(List<Sub> sub) {

		this.sub = sub;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {

		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {

		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {

		return "Digest [label=" + label + ", tag=" + tag + ", schemaOrgTag=" + schemaOrgTag + ", total=" + total
				+ ", hasRDI=" + hasRDI + ", daily=" + daily + ", unit=" + unit + ", sub=" + sub
				+ ", additionalProperties=" + additionalProperties + "]";
	}
}
