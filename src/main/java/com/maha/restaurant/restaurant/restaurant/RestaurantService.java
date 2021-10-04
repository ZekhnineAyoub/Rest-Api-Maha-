package com.maha.restaurant.restaurant.restaurant;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void AddRestaurant(Restaurant restaurant) {

        restaurantRepository.save(restaurant);

    }

    public List<Restaurant> GetAllRestaurant() {

        return restaurantRepository.findAll();

    }

}
