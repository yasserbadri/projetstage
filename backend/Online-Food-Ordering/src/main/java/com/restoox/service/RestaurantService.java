package com.restoox.service;

import com.restoox.dto.RestaurantDto;
import com.restoox.model.Restaurant;
import com.restoox.model.User;
import com.restoox.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {
    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);
    public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant)  throws Exception;
    public void deleteRestaurant(Long restaurantId) throws Exception;
    public List<Restaurant> getAllRestaurant();
    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long id) throws Exception;

    public Restaurant getRestaurantByUserId(Long userId) throws Exception;

    public RestaurantDto addToFavorites(Long restaurantId , User user)throws Exception;

    public Restaurant updateRestaurantStatus(Long id) throws Exception;

}
