package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.projections.ParkingSpotAndBlockMinJoinProjections;

public interface CarService {
	
	List<CarModel> findAll();
	List<ParkingSpotAndBlockMinJoinProjections> findByParkingSpotAndBlock(String block);
	Optional<CarModel> findById(Long id);
	CarModel save(CarModel car);
	void delete(CarModel car);
	boolean existsByLicensePlateCar(String licensePlateCar);

}
