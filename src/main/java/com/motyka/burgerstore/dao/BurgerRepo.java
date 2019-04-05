package com.motyka.burgerstore.dao;

import com.motyka.burgerstore.dao.entity.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepo extends CrudRepository<Burger,Long> {

}
