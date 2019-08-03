package com.motyka.burgerstore.service;


import com.motyka.burgerstore.dao.BurgerDao;
import com.motyka.burgerstore.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BurgerService {

	private final BurgerDao burgerDao;

	@Autowired
	public BurgerService(BurgerDao burgerDao) {
		this.burgerDao = burgerDao;
	}

	public Optional<Burger> findById(Long id) {
		return burgerDao.findById(id);
	}

	public Iterable<Burger> findAll() {
		return burgerDao.findAll();
	}

	public Burger save(Burger burger) {
		return burgerDao.save(burger);
	}

	public void deleteById(Long id) {
		burgerDao.deleteById(id);
	}



}


