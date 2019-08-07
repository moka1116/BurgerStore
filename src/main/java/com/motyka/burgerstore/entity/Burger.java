package com.motyka.burgerstore.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@NoArgsConstructor
public class Burger {

	@GeneratedValue(strategy = IDENTITY)
	@Id
	private Long id;

	private String name;

	@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(name = "burger_ingredient",
			joinColumns = @JoinColumn(name = "burger_id"),
			inverseJoinColumns = @JoinColumn(name = "ingredient_id")
	)
	private Set<Ingredient> ingredients = new HashSet<>();


}
