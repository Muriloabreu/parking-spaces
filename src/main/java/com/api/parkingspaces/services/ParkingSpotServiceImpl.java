package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.parkingspaces.models.ParkingSpotModel;
import com.api.parkingspaces.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

public class ParkingSpotServiceImpl implements ParkingSpotService{
	
	@Autowired
	ParkingSpotRepository rarkingSpotRepository;

	@Override
	public List<ParkingSpotModel> findByAll() {
		
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
	@Autowired
	public void delete(ParkingSpotModel parkingSpot) {
		rarkingSpotRepository.delete(parkingSpot);
		
	}

	@Override
	public boolean existsByParkingSpotNumber(String name) {
	
		return rarkingSpotRepository.existsByParkingSpotNumber(name);
	}

}
