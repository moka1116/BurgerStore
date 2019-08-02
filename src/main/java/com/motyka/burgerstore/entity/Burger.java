package com.motyka.burgerstore.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@NoArgsConstructor
public class Burger {

    @GeneratedValue(strategy = IDENTITY)
    @Id
    private Long id;
    private String name;
    private String ingredient;

    public Burger(Long id, String name, String ingredient) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
    }

}
