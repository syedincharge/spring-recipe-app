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
        Long ioValue = 4L;
        category.setId(4L);
        assertEquals(ioValue, category.getId());
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