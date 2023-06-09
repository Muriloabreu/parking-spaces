package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.projections.ParkingSpotAndBlockMinJoinProjections;
import com.api.parkingspaces.repositories.CarRepository;

import jakarta.transaction.Transactional;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	CarRepository carRepository;

	@Override
	public List<CarModel> findAll() {
		
		return carRepository.findAll();
	}

	@Override
	public Optional<CarModel> findById(Long id) {
		
		return carRepository.findById(id);
	}

	@Override
	@Transactional
	public CarModel save(CarModel car) {
		
		return carRepository.save(car);
	}

	@Override
	@Transactional
	public void delete(CarModel car) {
		
		carRepository.delete(car);
		
	}

	@Override
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		
		return carRepository.existsByLicensePlateCar(licensePlateCar);
	}

	@Override
	public List<ParkingSpotAndBlockMinJoinProjections> findByParkingSpotAndBlock(String block) {
		
		return carRepository.findByJoinCarsAndBlock(block);
	}

}
