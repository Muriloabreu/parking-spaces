package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import com.api.parkingspaces.models.ParkingSpotModel;

public interface ParkingSpotService {
	
	List<ParkingSpotModel> findByAll();
	Optional<ParkingSpotModel> findById(Long id);
	ParkingSpotModel save(ParkingSpotModel parkingSpot);
	void delete(ParkingSpotModel parkingSpot);
	boolean existsByParkingSpotNumber(String name);

}
