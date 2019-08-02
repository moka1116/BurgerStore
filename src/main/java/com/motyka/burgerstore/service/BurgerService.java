package com.motyka.burgerstore.service;


import com.motyka.burgerstore.dao.BurgerDao;
import com.motyka.burgerstore.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
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

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Burger(1L, "Common", "Meat"));
        save(new Burger(2L, "Hot", "Chili"));
        save(new Burger(3L, "Italian", "Tomato"));


    }

}


