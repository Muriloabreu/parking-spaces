package com.api.parkingspaces.services;

import java.util.List;
import java.util.Optional;

import com.api.parkingspaces.models.ResponsibleCarModel;

public interface ResponsibleCarService {
	
	List<ResponsibleCarModel> findAll();
	Optional<ResponsibleCarModel> findById(Long id);
	ResponsibleCarModel save(ResponsibleCarModel name);
	void delete(ResponsibleCarModel name);
	boolean existsByCpf(String cpf);
}
