package com.motyka.burgerstore.api;


import com.motyka.burgerstore.dao.entity.Burger;
import com.motyka.burgerstore.manager.BurgerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/burgers")
@CrossOrigin
public class BurgerApi {

    private BurgerManager burgerManager;

    @Autowired
    public BurgerApi(BurgerManager burgerManager) {
        this.burgerManager = burgerManager;
    }

    @GetMapping("/all")
    public Iterable<Burger> getAll() {
        return burgerManager.findAll();
    }

    @GetMapping
    public Optional<Burger> getById(@RequestParam Long index) {
        return burgerManager.findById(index);
    }

    @PostMapping
    public Burger addVideo(@RequestBody Burger burger) {
        return burgerManager.save(burger);
    }

    @PutMapping
    public Burger updateVideo(@RequestBody Burger burger) {
        return burgerManager.save(burger);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long index) {
        burgerManager.deleteById(index);
    }
}


