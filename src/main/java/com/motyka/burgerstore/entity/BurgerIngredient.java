package com.motyka.burgerstore.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class BurgerIngredient {


	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "burger_id")
	@NotNull
	private Burger burger;

	@ManyToOne
	@JoinColumn(name = "ingredient_id")
	@NotNull
	private Ingredient ingredient;

}
