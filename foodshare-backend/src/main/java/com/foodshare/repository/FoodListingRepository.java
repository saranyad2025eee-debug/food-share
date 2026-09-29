package com.foodshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.foodshare.entity.FoodListing;
import java.util.List;

public interface FoodListingRepository
        extends JpaRepository<FoodListing, Long> {

    List<FoodListing> findByStatus(String status);
}
