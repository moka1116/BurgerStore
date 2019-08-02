package com.motyka.burgerstore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
}
