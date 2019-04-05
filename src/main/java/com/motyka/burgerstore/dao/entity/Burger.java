package com.motyka.burgerstore.dao.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Burger {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String ingredient;

    public Burger(Long id, String name, String ingridient) {
        this.id = id;
        this.name = name;
        this.ingredient = ingridient;
    }

    public Burger() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
