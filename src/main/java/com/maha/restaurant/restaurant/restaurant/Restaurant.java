package com.maha.restaurant.restaurant.restaurant;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String menu;
    private Long price;

    public Restaurant(String name, String location, String menu, Long price) {
        this.name = name;
        this.location = location;
        this.menu = menu;
        this.price = price;
    }
}
