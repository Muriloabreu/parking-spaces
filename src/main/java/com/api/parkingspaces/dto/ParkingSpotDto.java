package com.api.parkingspaces.dto;

import java.util.List;
import java.util.Objects;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.models.ResponsibleCarModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ParkingSpotDto {
	
	@NotBlank
	private String parkingSpotNumberparkingSpotNumberA;
	@NotBlank
	private String parkingSpotNumberparkingSpotNumberB;
	@NotNull
	List<CarModel> cars;
	@NotBlank
	private ResponsibleCarModel responsibleCar;
	@NotBlank
	private String apartment;
	@NotBlank
	private String block;
	
	public ParkingSpotDto() {
		
	}
	public ParkingSpotDto(@NotBlank String parkingSpotNumberparkingSpotNumberA,
			@NotBlank String parkingSpotNumberparkingSpotNumberB, @NotNull List<CarModel> cars,
			@NotBlank ResponsibleCarModel responsibleCar, @NotBlank String apartment, @NotBlank String block) {
		super();
		this.parkingSpotNumberparkingSpotNumberA = parkingSpotNumberparkingSpotNumberA;
		this.parkingSpotNumberparkingSpotNumberB = parkingSpotNumberparkingSpotNumberB;
		this.cars = cars;
		this.responsibleCar = responsibleCar;
		this.apartment = apartment;
		this.block = block;
	}
	public String getParkingSpotNumberparkingSpotNumberA() {
		return parkingSpotNumberparkingSpotNumberA;
	}
	public void setParkingSpotNumberparkingSpotNumberA(String parkingSpotNumberparkingSpotNumberA) {
		this.parkingSpotNumberparkingSpotNumberA = parkingSpotNumberparkingSpotNumberA;
	}
	public String getParkingSpotNumberparkingSpotNumberB() {
		return parkingSpotNumberparkingSpotNumberB;
	}
	public void setParkingSpotNumberparkingSpotNumberB(String parkingSpotNumberparkingSpotNumberB) {
		this.parkingSpotNumberparkingSpotNumberB = parkingSpotNumberparkingSpotNumberB;
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
