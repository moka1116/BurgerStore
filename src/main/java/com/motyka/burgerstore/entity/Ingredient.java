package com.motyka.burgerstore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

	@ManyToOne
	@JoinColumn(name = "burger_id")
	private Burger burger;

}
