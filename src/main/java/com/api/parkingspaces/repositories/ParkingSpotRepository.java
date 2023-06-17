package com.api.parkingspaces.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.parkingspaces.models.ParkingSpotModel;
import com.api.parkingspaces.projections.ParkingSpotMinJoinProjections;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, Long> {
	
	boolean existsByParkingSpotNumberA(String name);
	boolean existsByParkingSpotNumberB(String name);
	boolean existsByApartmentAndBlock(String apartment, String block);
	
	@Query(nativeQuery = true, value = "")
	List<ParkingSpotMinJoinProjections> findByJoinParkingSpot(String block);
}
