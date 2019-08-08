package co.grandcircus.recipeAPI;

import java.util.List;

public class Recipe {

	private String label;

	private List<String> ingredientLines;

	private double calories;

	private String getLabel() {

		return label;
	}

	private void setLabel(String label) {

		this.label = label;
	}

	private List<String> getIngredientLines() {

		return ingredientLines;
	}

	private void setIngredientLines(List<String> ingredientLines) {

		this.ingredientLines = ingredientLines;
	}

	private double getCalories() {

		return calories;
	}

	private void setCalories(double calories) {

		this.calories = calories;
	}
}
