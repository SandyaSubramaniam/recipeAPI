package co.grandcircus.recipeAPI.entities;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "recipe", "bookmarked", "bought" })
public class Hit {

	@JsonProperty("recipe")
	private Recipe recipe;

	@JsonProperty("bookmarked")
	private Boolean bookmarked;

	@JsonProperty("bought")
	private Boolean bought;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Recipe getRecipe() {

		return recipe;
	}

	@JsonProperty("recipe")
	public void setRecipe(Recipe recipe) {

		this.recipe = recipe;
	}

	@JsonProperty("bookmarked")
	public Boolean getBookmarked() {

		return bookmarked;
	}

	@JsonProperty("bookmarked")
	public void setBookmarked(Boolean bookmarked) {

		this.bookmarked = bookmarked;
	}

	@JsonProperty("bought")
	public Boolean getBought() {

		return bought;
	}

	@JsonProperty("bought")
	public void setBought(Boolean bought) {

		this.bought = bought;
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
	public String toString() {

		return "Hit [recipe=" + recipe + ", bookmarked=" + bookmarked + ", bought=" + bought + ", additionalProperties="
				+ additionalProperties + "]";
	}
}
