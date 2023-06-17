package com.api.parkingspaces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingspaces.models.ResponsibleCarModel;

public interface ResponsibleCarRepository extends JpaRepository<ResponsibleCarModel, Long>{
	
	boolean existsByCpf(String cpf);
	
	
}
