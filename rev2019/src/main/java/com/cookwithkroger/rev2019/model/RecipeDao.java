package com.cookwithkroger.rev2019.model;

import java.util.List;

public interface RecipeDao {
	Recipe getById(int recipeId);
	List<Recipe> getRecipeInPriceRange(double price);
	List<Recipe> getRecipeInPriceRange(double price, int customer_ID);
}
