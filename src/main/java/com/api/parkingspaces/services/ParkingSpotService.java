package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import com.api.parkingspaces.models.ParkingSpotModel;
import com.api.parkingspaces.projections.ParkingSpotAndBlockMinJoinProjections;

public interface ParkingSpotService {
	
	List<ParkingSpotModel> findAll();
	Optional<ParkingSpotModel> findById(Long id);
	ParkingSpotModel save(ParkingSpotModel parkingSpot);
	void delete(ParkingSpotModel parkingSpot);
	boolean existsByParkingSpotNumberA(String name);
	boolean existsByParkingSpotNumberB(String name);
	

}
