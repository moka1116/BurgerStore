package com.motyka.burgerstore.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@JsonIgnore
	@OneToMany(mappedBy = "burger")
	private Set<Ingredient> ingredients;


}
