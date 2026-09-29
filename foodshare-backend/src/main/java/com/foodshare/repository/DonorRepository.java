package com.foodshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.foodshare.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {

}
