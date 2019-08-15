package com.motyka.burgerstore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Ingredient {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@NotNull
	private String name;

	@OneToMany(mappedBy = "ingredient")
	private Set<BurgerIngredient> BurgerIngredient;


}
