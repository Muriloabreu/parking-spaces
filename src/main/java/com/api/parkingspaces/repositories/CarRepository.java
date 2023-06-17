package com.api.parkingspaces.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.projections.ParkingSpotMinJoinProjections;

public interface CarRepository extends JpaRepository<CarModel, Long>{
	
	boolean existsByLicensePlateCar(String licensePlateCar);
	
	@Query(nativeQuery = true, value = "SELECT car.license_plate_car, car.model_car, res.first_name, res.last_name, res.cpf, par.parking_spot_numbera, par.parking_spot_numberb FROM tb_car car"
			+ "INNER JOIN tb_responsible_car res ON res.id = car.responsible_car_id "
			+ "INNER JOIN tb_parkings_pot par ON par.id = car.parkingspot_id "
			+ "WHERE res.block LIKE '%B%'")
	List<ParkingSpotMinJoinProjections> findByJoinCarsAndBlock(String Block);

}
