package com.motyka.burgerstore.manager;


import com.motyka.burgerstore.dao.BurgerRepo;
import com.motyka.burgerstore.dao.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BurgerManager {
    private BurgerRepo burgerRepo;

    @Autowired
    public BurgerManager(BurgerRepo burgerRepo) {
        this.burgerRepo = burgerRepo;
    }

    public Optional<Burger> findById(Long id) {
        return burgerRepo.findById(id);
    }

    public Iterable<Burger> findAll() {
        return burgerRepo.findAll();
    }

    public Burger save(Burger burger) {
        return burgerRepo.save(burger);
    }

    public void deleteById(Long id) {
        burgerRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Burger(1L, "Common", "Meat"));
        save(new Burger(2L, "Hot", "Chili"));
        save(new Burger(3L, "Italian", "Tomato"));


    }

}


