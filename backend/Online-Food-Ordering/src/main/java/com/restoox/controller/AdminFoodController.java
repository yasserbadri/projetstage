package com.restoox.controller;

import com.restoox.model.Food;
import com.restoox.model.Restaurant;
import com.restoox.model.User;
import com.restoox.request.CreateFoodRequest;
import com.restoox.response.MessageResponse;
import com.restoox.service.FoodService;
import com.restoox.service.RestaurantService;
import com.restoox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/food")
public class AdminFoodController {
     @Autowired
    private FoodService foodService;
     @Autowired
     private UserService userService;
     @Autowired
     private RestaurantService restaurantService;
    @PostMapping
     public ResponseEntity<Food> createFood(@RequestBody CreateFoodRequest req,
                                           @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        Restaurant restaurant=restaurantService.findRestaurantById(req.getRestaurantId());
        Food food=foodService.createFood(req,req.getCategory(),restaurant);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<MessageResponse> deleteFood(@PathVariable Long id,
                                                      @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        foodService.deleteFood(id);
        MessageResponse res =new MessageResponse();
        res.setMessage("Food deleted successfully");

        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFoodAvailabilityStatus(@PathVariable Long id,
                                                      @RequestHeader("Authorization") String jwt) throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        Food food =foodService.updateAvailabilityStatus(id);
        MessageResponse res =new MessageResponse();
        res.setMessage("Food deleted successfully");

        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

}

