package com.api.parkingspaces.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.parkingspaces.dto.ParkingSpotDto;
import com.api.parkingspaces.models.ParkingSpotModel;
import com.api.parkingspaces.services.ParkingSpotService;

import jakarta.validation.Valid;

@Controller
@CrossOrigin(originPatterns = "*", maxAge = 3600) /*Para permitir ser acessado de qualquer fonte*/
@RequestMapping("/parking-spaces/parkingspots") /*Mapeamento a nível de classe*/
public class ParkingSpotController {
	
	@Autowired
	ParkingSpotService parkingSpotService;
	
	@PostMapping
	public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto){
//		if (parkingSpotService.existsByLicensePlateCar(parkingSpotDto.getCars()); {
//			return ResponseEntity.status(HttpStatus.CONFLICT)
//					.body("Conflict: License Plate Car is already in use!"); /* Check se placa já está cadastrada */
//		}
		if (parkingSpotService.existsByParkingSpotNumberA(parkingSpotDto.getParkingSpotNumberA())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Parking Spot A is already in use!");
		}
		if (parkingSpotService.existsByParkingSpotNumberB(parkingSpotDto.getParkingSpotNumberB())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Parking Spot B is already in use!");
		}
		if (parkingSpotService.existsByApartmentAndBlock(parkingSpotDto.getApartment(), parkingSpotDto.getBlock())) {
			return ResponseEntity.status(HttpStatus.CONFLICT)
					.body("Conflict: Parking Spot is already registered for this apartment/block!");
		}
		
		ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
		BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel); /*Coverte Dtos para Model*/
		parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC"))); /* è um set de Data */
		return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
	}
	
	@GetMapping
	public ResponseEntity<List<ParkingSpotModel>>getAllParkingSpot(){
		return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getOneParkingSpot(@PathVariable(value = "id") Long id) {

		Optional<ParkingSpotModel> parkingSpotOptional = parkingSpotService.findById(id);

		if (!parkingSpotOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found. "); /* Mensagem se a School não for encontrado */
		}

		return ResponseEntity.status(HttpStatus.OK).body(parkingSpotOptional.get());

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") Long id) {

		Optional<ParkingSpotModel> parkingSpotOptional = parkingSpotService.findById(id);

		if (!parkingSpotOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found. "); /* Mensagem se a School não for encontrado */
		}
		
		parkingSpotService.delete(parkingSpotOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Parking Spot deleted successfully.");

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateParkingSpot(@PathVariable(value = "id") Long id,
			                                        @RequestBody @Valid ParkingSpotDto parkingSpotDto) {

		Optional<ParkingSpotModel> parkingSpotOptional = parkingSpotService.findById(id);

		if (!parkingSpotOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Parking Spot not found. "); /* Mensagem se a School não for encontrado */
		}
		
		var parkingSpotModel = parkingSpotOptional.get();
		parkingSpotModel.setParkingSpotNumberA(parkingSpotDto.getParkingSpotNumberA());
		parkingSpotModel.setParkingSpotNumberB(parkingSpotDto.getParkingSpotNumberB());
		parkingSpotModel.setCars(parkingSpotDto.getCars());
		parkingSpotModel.setResponsibleCar(parkingSpotDto.getResponsibleCar());
		parkingSpotModel.setApartment(parkingSpotDto.getApartment());	
		parkingSpotModel.setBlock(parkingSpotDto.getBlock());
		
		return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.save(parkingSpotModel));

	}

}
