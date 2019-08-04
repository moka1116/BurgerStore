package com.motyka.burgerstore.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@NoArgsConstructor
public class Burger {

	@GeneratedValue(strategy = IDENTITY)
	@Id
	private Long id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "ingredient_id")
	@NotNull
	@JsonIgnore
	private Ingredient ingredients;


}
