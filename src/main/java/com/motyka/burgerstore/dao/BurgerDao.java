package com.motyka.burgerstore.dao;

import com.motyka.burgerstore.entity.Burger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BurgerDao extends JpaRepository<Burger, Long> {

}
