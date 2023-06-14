package com.api.parkingspaces.dto;

import java.util.List;
import java.util.Objects;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.models.ResponsibleCarModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ParkingSpotDto {
	
	@NotBlank
	private String parkingSpotNumber;
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

	public ParkingSpotDto(@NotBlank String parkingSpotNumber, @NotNull List<CarModel> cars,
			@NotBlank ResponsibleCarModel responsibleCar, @NotBlank String apartment, @NotBlank String block) {
		super();
		this.parkingSpotNumber = parkingSpotNumber;
		this.cars = cars;
		this.responsibleCar = responsibleCar;
		this.apartment = apartment;
		this.block = block;
	}

	@Override
	public String toString() {
		return "ParkingSpotService [parkingSpotNumber=" + parkingSpotNumber + ", cars=" + cars + ", responsibleCar="
				+ responsibleCar + ", apartment=" + apartment + ", block=" + block + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apartment, block, cars, parkingSpotNumber, responsibleCar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkingSpotDto other = (ParkingSpotDto) obj;
		return Objects.equals(apartment, other.apartment) && Objects.equals(block, other.block)
				&& Objects.equals(cars, other.cars) && Objects.equals(parkingSpotNumber, other.parkingSpotNumber)
				&& Objects.equals(responsibleCar, other.responsibleCar);
	}
	
	
	
	

}
