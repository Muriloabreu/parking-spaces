package com.api.parkingspaces.dto;

import java.util.List;


import com.api.parkingspaces.models.CarModel;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ParkingSpotDto {
	
	@NotBlank
	private String parkingSpotNumberA;
	@NotBlank
	private String parkingSpotNumberB;
	@NotNull
	private List<CarModel> cars;
	
	
	public ParkingSpotDto() {
		
	}
	
	public ParkingSpotDto(@NotBlank String parkingSpotNumberA, @NotBlank String parkingSpotNumberB,
			@NotNull List<CarModel> cars) {
		
		this.parkingSpotNumberA = parkingSpotNumberA;
		this.parkingSpotNumberB = parkingSpotNumberB;
		this.cars = cars;
		
		
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
	

	
	
	
	
	

}
