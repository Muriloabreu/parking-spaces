package com.api.parkingspaces.dto;

import java.util.List;
import java.util.Objects;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.models.ResponsibleCarModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ParkingSpotDto {
	
	@NotBlank
	private String parkingSpotNumberA;
	@NotBlank
	private String parkingSpotNumberB;
	@NotNull
	private List<CarModel> cars;
	@NotBlank
	private ResponsibleCarModel responsibleCar;
	@NotBlank
	private String apartment;
	@NotBlank
	private String block;
	
	public ParkingSpotDto() {
		
	}
	
	public ParkingSpotDto(@NotBlank String parkingSpotNumberA, @NotBlank String parkingSpotNumberB,
			@NotNull List<CarModel> cars, @NotBlank ResponsibleCarModel responsibleCar, @NotBlank String apartment,
			@NotBlank String block) {
		super();
		this.parkingSpotNumberA = parkingSpotNumberA;
		this.parkingSpotNumberB = parkingSpotNumberB;
		this.cars = cars;
		this.responsibleCar = responsibleCar;
		this.apartment = apartment;
		this.block = block;
	}
	
	public String getParkingSpotNumberA() {
		return parkingSpotNumberA;
	}

	public void setParkingSpotNumberA(String parkingSpotNumberA) {
		this.parkingSpotNumberA = parkingSpotNumberA;
	}

	public String getParkingSpotNumberB() {
		return parkingSpotNumberB;
	}

	public void setParkingSpotNumberB(String parkingSpotNumberB) {
		this.parkingSpotNumberB = parkingSpotNumberB;
	}

	public List<CarModel> getCars() {
		return cars;
	}
	public void setCars(List<CarModel> cars) {
		this.cars = cars;
	}
	public ResponsibleCarModel getResponsibleCar() {
		return responsibleCar;
	}
	public void setResponsibleCar(ResponsibleCarModel responsibleCar) {
		this.responsibleCar = responsibleCar;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}


	
	
	
	
	

}
