package com.foodshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.foodshare.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

    boolean existsByFoodListingIdAndStatus(
            Long foodListingId, String status);

}
