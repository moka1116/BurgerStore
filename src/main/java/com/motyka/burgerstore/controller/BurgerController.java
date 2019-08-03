package com.motyka.burgerstore.controller;


import com.motyka.burgerstore.entity.Burger;
import com.motyka.burgerstore.service.BurgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/burgers")
@CrossOrigin
public class BurgerController {

	private BurgerService burgerManager;

	@Autowired
	public BurgerController(BurgerService burgerManager) {
		this.burgerManager = burgerManager;
	}

	@GetMapping
	public Iterable<Burger> getAll() {
		return burgerManager.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Burger> getById(@RequestParam Long id) {
		return burgerManager.findById(id);
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


