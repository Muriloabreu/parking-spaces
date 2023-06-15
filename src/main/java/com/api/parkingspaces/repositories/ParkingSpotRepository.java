package com.api.parkingspaces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingspaces.models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, Long> {
	
	boolean existsByParkingSpotNumberA(String name);
	boolean existsByParkingSpotNumberB(String name);
	boolean existsByLicensePlateCar(String licensePlateCar);
	boolean existsByApartmentAndBlock(String apartment, String block);
}
