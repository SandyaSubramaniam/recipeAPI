package co.grandcircus.recipeAPI.entities;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "label", "quantity", "unit" })
public class TotalValue {

	private String label;

	private Double quantity;

	private String unit;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getLabel() {

		return label;
	}

	public void setLabel(String label) {

		this.label = label;
	}

	public Double getQuantity() {

		return quantity;
	}

	public void setQuantity(Double quantity) {

		this.quantity = quantity;
	}

	public String getUnit() {

		return unit;
	}

	public void setUnit(String unit) {

		this.unit = unit;
	}

	public Map<String, Object> getAdditionalProperties() {

		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {

		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {

		return "TotalValue [label=" + label + ", quantity=" + quantity + ", unit=" + unit + ", additionalProperties="
				+ additionalProperties + "]";
	}
}
