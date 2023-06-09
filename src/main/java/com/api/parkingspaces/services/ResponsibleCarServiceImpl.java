package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingspaces.models.ResponsibleCarModel;
import com.api.parkingspaces.repositories.ResponsibleCarRepository;

import jakarta.transaction.Transactional;

@Service
public class ResponsibleCarServiceImpl implements ResponsibleCarService{
	
	@Autowired
	ResponsibleCarRepository responsibleCarRepository;

	@Override
	public List<ResponsibleCarModel> findAll() {
		
		return responsibleCarRepository.findAll();
	}

	@Override
	public Optional<ResponsibleCarModel> findById(Long id) {
		
		return responsibleCarRepository.findById(id);
	}

	@Override
	@Transactional
	public ResponsibleCarModel save(ResponsibleCarModel name) {
		
		return responsibleCarRepository.save(name);
	}

	@Override
	@Transactional
	public void delete(ResponsibleCarModel name) {
		
		responsibleCarRepository.delete(name);
		
	}

	@Override
	public boolean existsByCpf(String cpf) {
		
		return responsibleCarRepository.existsByCpf(cpf);
	}

}
