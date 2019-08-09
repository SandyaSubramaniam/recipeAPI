package co.grandcircus.recipeAPI.entities;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text", "weight" })
public class Ingredient {

	private String text;

	private Double weight;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getText() {

		return text;
	}

	public void setText(String text) {

		this.text = text;
	}

	public Double getWeight() {

		return weight;
	}

	public void setWeight(Double weight) {

		this.weight = weight;
	}

	public Map<String, Object> getAdditionalProperties() {

		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {

		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {

		return "Ingredient [text=" + text + ", weight=" + weight + ", additionalProperties=" + additionalProperties
				+ "]";
	}
}
