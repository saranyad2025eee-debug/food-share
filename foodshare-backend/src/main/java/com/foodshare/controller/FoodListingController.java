package com.foodshare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.foodshare.entity.FoodListing;
import com.foodshare.service.FoodListingService;

@RestController
@RequestMapping("/api/food")
@CrossOrigin(origins = "*")
public class FoodListingController {

    private final FoodListingService foodListingService;

    public FoodListingController(
            FoodListingService foodListingService) {
        this.foodListingService = foodListingService;
    }

    @PostMapping
    public FoodListing saveFood(
            @RequestBody FoodListing foodListing) {
        return foodListingService.saveFood(foodListing);
    }

    @GetMapping
    public List<FoodListing> getAllFood() {
        return foodListingService.getAllFood();
    }

    @GetMapping("/{id}")
    public Optional<FoodListing> getFoodById(
            @PathVariable Long id) {
        return foodListingService.getFoodById(id);
    }

    @GetMapping("/status/{status}")
    public List<FoodListing> getFoodByStatus(
            @PathVariable String status) {
        return foodListingService.getFoodByStatus(status);
    }

    @DeleteMapping("/{id}")
    public String deleteFood(@PathVariable Long id) {
        foodListingService.deleteFood(id);
        return "Food deleted successfully";
    }
}
