package com.api.parkingspaces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingspaces.models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, Long> {
	
	boolean existsByParkingSpotNumber(String name);
}
