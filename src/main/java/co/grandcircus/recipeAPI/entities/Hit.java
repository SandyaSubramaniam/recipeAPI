package co.grandcircus.recipeAPI.entities;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "recipe", "bookmarked", "bought" })
public class Hit {

	private Recipe recipe;

	private Boolean bookmarked;

	private Boolean bought;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Recipe getRecipe() {

		return recipe;
	}

	public void setRecipe(Recipe recipe) {

		this.recipe = recipe;
	}

	public Boolean getBookmarked() {

		return bookmarked;
	}

	public void setBookmarked(Boolean bookmarked) {

		this.bookmarked = bookmarked;
	}

	public Boolean getBought() {

		return bought;
	}

	public void setBought(Boolean bought) {

		this.bought = bought;
	}

	public Map<String, Object> getAdditionalProperties() {

		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {

		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {

		return "Hit [recipe=" + recipe + ", bookmarked=" + bookmarked + ", bought=" + bought + ", additionalProperties="
				+ additionalProperties + "]";
	}
}
