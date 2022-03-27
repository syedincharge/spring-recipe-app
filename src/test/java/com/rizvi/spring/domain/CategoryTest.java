package com.rizvi.spring.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class CategoryTest {

      Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {

        category.getDescription();
    }

    @Test
    public void getRecipes() {

        category.getRecipes();
    }
}