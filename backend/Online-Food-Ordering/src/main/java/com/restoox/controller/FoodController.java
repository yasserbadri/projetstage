package com.restoox.controller;

import com.restoox.model.Food;
import com.restoox.model.Restaurant;
import com.restoox.model.User;
import com.restoox.request.CreateFoodRequest;
import com.restoox.service.FoodService;
import com.restoox.service.RestaurantService;
import com.restoox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @Autowired
    private UserService userService;
    @Autowired
    private RestaurantService restaurantService;
    @GetMapping("/search")
    public ResponseEntity <List<Food>> searchFood(@RequestParam String name,
                                           @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        List<Food> foods=foodService.searchFood(name);

        return new ResponseEntity<>(foods, HttpStatus.CREATED);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity <List<Food>> getRestaurantFood(@RequestParam boolean vegetarian,@RequestParam boolean seasonal,@RequestParam boolean nonveg,
                                                         @RequestParam(required = false)String food_category
            ,@PathVariable Long restaurantId, @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        List<Food> foods=foodService.getRestaurantFood(restaurantId,vegetarian,nonveg,seasonal,food_category);
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }
}
