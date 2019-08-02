package com.motyka.burgerstore.dao;

import com.motyka.burgerstore.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientsDao extends JpaRepository<Ingredient, Long> {
}
