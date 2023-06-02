package com.api.parkingspaces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingspaces.models.CarModel;

public interface CarRepository extends JpaRepository<CarModel, Long>{
	
	boolean existsByLicensePlateCar(String licensePlateCar);

}
