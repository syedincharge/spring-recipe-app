package com.rizvi.spring.services;


import com.rizvi.spring.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndId(long recipeId, long id);

    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand);

    void deleteById(Long recipeId, Long id);

    void deleteByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
