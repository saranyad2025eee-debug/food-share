package com.foodshare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.foodshare.entity.FoodListing;
import com.foodshare.repository.FoodListingRepository;

@Service
public class FoodListingService {

    private final FoodListingRepository foodListingRepository;

    public FoodListingService(
            FoodListingRepository foodListingRepository) {
        this.foodListingRepository = foodListingRepository;
    }

    public FoodListing saveFood(FoodListing foodListing) {
        return foodListingRepository.save(foodListing);
    }

    public List<FoodListing> getAllFood() {
        return foodListingRepository.findAll();
    }

    public Optional<FoodListing> getFoodById(Long id) {
        return foodListingRepository.findById(id);
    }

    public List<FoodListing> getFoodByStatus(String status) {
        return foodListingRepository.findByStatus(status);
    }

    public void deleteFood(Long id) {
        foodListingRepository.deleteById(id);
    }
}
