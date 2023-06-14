package com.api.parkingspaces.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PARKINGS_POT")
public class ParkingSpotModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true, length = 10)
	private String parkingSpotNumber;
	@OneToMany
	@JoinColumn(name = "parkingspot_id")
	List<CarModel> cars = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "responsiblecar_id")
	private ResponsibleCarModel responsibleCar;
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	@Column(nullable = false, length = 30)
	private String apartment;
	@Column(nullable = false, length = 30)
	private String block;
	
	public ParkingSpotModel() {		
	}

	public ParkingSpotModel(Long id, String parkingSpotNumber, List<CarModel> cars, ResponsibleCarModel responsibleCar,
			LocalDateTime registrationDate, String apartment, String block) {
		super();
		this.id = id;
		this.parkingSpotNumber = parkingSpotNumber;
		this.cars = cars;
		this.responsibleCar = responsibleCar;
		this.registrationDate = registrationDate;
		this.apartment = apartment;
		this.block = block;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(String parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
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

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
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

	@Override
	public String toString() {
		return "ParkingSpotModel [id=" + id + ", parkingSpotNumber=" + parkingSpotNumber + ", cars=" + cars
				+ ", responsibleCar=" + responsibleCar + ", registrationDate=" + registrationDate + ", apartment="
				+ apartment + ", block=" + block + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apartment, block, cars, id, parkingSpotNumber, registrationDate, responsibleCar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkingSpotModel other = (ParkingSpotModel) obj;
		return Objects.equals(apartment, other.apartment) && Objects.equals(block, other.block)
				&& Objects.equals(cars, other.cars) && Objects.equals(id, other.id)
				&& Objects.equals(parkingSpotNumber, other.parkingSpotNumber)
				&& Objects.equals(registrationDate, other.registrationDate)
				&& Objects.equals(responsibleCar, other.responsibleCar);
	}
	
	
	
	

}