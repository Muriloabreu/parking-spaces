package com.api.parkingspaces.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.parkingspaces.models.ResponsibleCarModel;

public interface ResponsibleCarRepository extends JpaRepository<ResponsibleCarModel, Long>{
	
	boolean existsByCpf(String cpf);
	
	@Query(value = "select r from ResponsibleCarModel r where r.ResponsibleCar like %?1%")
	List<ResponsibleCarModel> findByResponsibles(String name);
	
}
