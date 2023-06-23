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
	@Column(nullable = true, unique = true, length = 10)
	private String parkingSpotNumberA;
	@Column(nullable = true, unique = true, length = 10)
	private String parkingSpotNumberB;
	@Column(nullable = false)
	private boolean statusParkingSpotA = true;
	@Column(nullable = false)
	private boolean statusParkingSpotB = true;
	@OneToMany
	@JoinColumn(name = "parkingspot_id")
	List<CarModel> cars = new ArrayList<>();
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	
	
	
	public ParkingSpotModel() {		
	}

	public ParkingSpotModel(Long id, String parkingSpotNumberA, String parkingSpotNumberB, boolean statusParkingSpotA,
			boolean statusParkingSpotB, List<CarModel> cars, LocalDateTime registrationDate) {
		
		this.id = id;
		this.parkingSpotNumberA = parkingSpotNumberA;
		this.parkingSpotNumberB = parkingSpotNumberB;
		this.statusParkingSpotA = statusParkingSpotA;
		this.statusParkingSpotB = statusParkingSpotB;
		this.cars = cars;
		this.registrationDate = registrationDate;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public boolean isStatusParkingSpotA() {
		return statusParkingSpotA;
	}

	public void setStatusParkingSpotA(boolean statusParkingSpotA) {
		this.statusParkingSpotA = statusParkingSpotA;
	}

	public boolean isStatusParkingSpotB() {
		return statusParkingSpotB;
	}

	public void setStatusParkingSpotB(boolean statusParkingSpotB) {
		this.statusParkingSpotB = statusParkingSpotB;
	}

	public List<CarModel> getCars() {
		return cars;
	}

	public void setCars(List<CarModel> cars) {
		this.cars = cars;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	

	

	

	

	
	
	
	
	

}
