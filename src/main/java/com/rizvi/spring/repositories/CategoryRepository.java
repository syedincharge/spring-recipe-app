package com.rizvi.spring.repositories;

import com.rizvi.spring.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
