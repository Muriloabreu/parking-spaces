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

import com.api.parkingspaces.dto.ResponsibleCarDto;
import com.api.parkingspaces.models.ResponsibleCarModel;
import com.api.parkingspaces.services.ResponsibleCarService;

import jakarta.validation.Valid;

@Controller
@CrossOrigin(originPatterns = "*", maxAge = 3600) /*Para permitir ser acessado de qualquer fonte*/
@RequestMapping("/parking-spaces/responsibles") /*Mapeamento a nível de classe*/
public class ResponsibleCarController {
	
	@Autowired
	ResponsibleCarService responsibleCarService;
	
	@PostMapping
	public ResponseEntity<Object> saveResponsibleCar(@RequestBody @Valid ResponsibleCarDto responsibleCarDto){
		
		if (responsibleCarService.existsByCpf(responsibleCarDto.getCpf())) {
			
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Responsible Car is already in use!");
		}
		
		ResponsibleCarModel resposibleCaModel = new ResponsibleCarModel();
		BeanUtils.copyProperties(responsibleCarDto, resposibleCaModel); /*Coverte Dtos para Model*/
		resposibleCaModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(responsibleCarService.save(resposibleCaModel));
	}
	
	@GetMapping
	public ResponseEntity<List<ResponsibleCarModel>>getAllResponsibles(){
		return ResponseEntity.status(HttpStatus.OK).body(responsibleCarService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getOneResponsible(@PathVariable(value = "id") Long id) {

		Optional<ResponsibleCarModel> responsibleOptional = responsibleCarService.findById(id);

		if (!responsibleOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Responsible Car not found. "); /* Mensagem se a School não for encontrado */
		}

		return ResponseEntity.status(HttpStatus.OK).body(responsibleOptional.get());

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteResponsible(@PathVariable(value = "id") Long id) {

		Optional<ResponsibleCarModel> responsibleOptional = responsibleCarService.findById(id);

		if (!responsibleOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Responsible Car not found. "); /* Mensagem se a School não for encontrado */
		}
		
		responsibleCarService.delete(responsibleOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Class Diary deleted successfully.");

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateResponsible(@PathVariable(value = "id") Long id,
			                                        @RequestBody @Valid ResponsibleCarDto responsibleCarDto) {

		Optional<ResponsibleCarModel> responsibleOptional = responsibleCarService.findById(id);

		if (!responsibleOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Responsible Car not found. "); /* Mensagem se a School não for encontrado */
		}
		
		var responsibleModel = responsibleOptional.get();
		responsibleModel.setFirstName(responsibleCarDto.getFirstName());
		responsibleModel.setLastName(responsibleCarDto.getLastName());
		responsibleModel.setCpf(responsibleCarDto.getCpf());
		responsibleModel.setApartment(responsibleCarDto.getApartment());	
		responsibleModel.setBlock(responsibleCarDto.getBlock());
		
		return ResponseEntity.status(HttpStatus.OK).body(responsibleCarService.save(responsibleModel));

	}

}
