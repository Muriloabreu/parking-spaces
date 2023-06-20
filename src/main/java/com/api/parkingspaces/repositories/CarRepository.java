package com.api.parkingspaces.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.projections.ParkingSpotAndBlockMinJoinProjections;

public interface CarRepository extends JpaRepository<CarModel, Long>{
	
	boolean existsByLicensePlateCar(String licensePlateCar);
	
	@Query(nativeQuery = true, value = "SELECT par.parking_spot_numbera AS parkingSpotNumberA, "
			+ "par.parking_spot_numberb AS parkingSpotNumberB, "
			+ "res.block AS nameBlock, res.apartment AS nameApartment , car.model_car AS ModelCar, "
			+ "car.license_plate_car AS licenseCar, res.first_name AS firstName, res.last_name AS lastName "
			+ "FROM tb_car car "
			+ "INNER JOIN tb_responsible_car res ON res.id = car.responsible_car_id "
			+ "INNER JOIN tb_parkings_pot par ON par.id = car.parkingspot_id "
			+ "WHERE res.block LIKE %?1% " )
	List<ParkingSpotAndBlockMinJoinProjections> findByJoinCarsAndBlock(String Block);

}
