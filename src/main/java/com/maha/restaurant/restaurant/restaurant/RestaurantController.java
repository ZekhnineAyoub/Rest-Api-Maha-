package com.maha.restaurant.restaurant.restaurant;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @PostMapping
    public void AddRestaurant(@RequestBody Restaurant restaurant){

        restaurantService.AddRestaurant(restaurant);
    }

    @GetMapping
    public List<Restaurant> GetAllRestaurant(){

        return restaurantService.GetAllRestaurant();

    }




}
