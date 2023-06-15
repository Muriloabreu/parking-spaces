package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingspaces.models.ParkingSpotModel;
import com.api.parkingspaces.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService{
	
	@Autowired
	ParkingSpotRepository rarkingSpotRepository;

	@Override
	public List<ParkingSpotModel> findAll() {
		
		return rarkingSpotRepository.findAll();
	}

	@Override
	public Optional<ParkingSpotModel> findById(Long id) {
		
		return rarkingSpotRepository.findById(id);
	}

	@Override
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpot) {
		
		return rarkingSpotRepository.save(parkingSpot);
	}

	@Override
	@Transactional
	public void delete(ParkingSpotModel parkingSpot) {
		rarkingSpotRepository.delete(parkingSpot);
		
	}

	@Override
	public boolean existsByParkingSpotNumberA(String name) {
		
		return rarkingSpotRepository.existsByParkingSpotNumberA(name);
	}

	@Override
	public boolean existsByParkingSpotNumberB(String name) {
		
		return rarkingSpotRepository.existsByParkingSpotNumberB(name);
	}

	@Override
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		
		return rarkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}

	@Override
	public boolean existsByApartmentAndBlock(String apartment, String block) {
		
		return rarkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}

}
