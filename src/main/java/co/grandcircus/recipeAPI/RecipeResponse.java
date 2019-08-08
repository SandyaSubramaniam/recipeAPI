package co.grandcircus.recipeAPI;

import java.util.List;

public class RecipeResponse {

	private List<Recipe> recipes;

	private List<Recipe> getRecipes() {

		return recipes;
	}

	private void setRecipes(List<Recipe> recipes) {

		this.recipes = recipes;
	}
}
