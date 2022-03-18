package com.rizvi.spring.repositories;

import com.rizvi.spring.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
