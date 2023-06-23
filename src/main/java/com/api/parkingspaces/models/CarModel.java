package com.api.parkingspaces.models;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CAR")
public class CarModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true, length = 7)
	private String licensePlateCar;
	@Column(nullable = false, length = 70)
	private String brandCar;
	@Column(nullable = false, length = 70)
	private String modelCar;
	@Column(nullable = false, length = 70)
	private String colorCar;
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	@ManyToOne
	@JoinColumn(name = "responsibleCar_id" )
	private ResponsibleCarModel responsibleCarModel;
	
	/* Constructor */
	
	public CarModel() {
	}

	public CarModel(Long id, String licensePlateCar, String brandCar, String modelCar, String colorCar,
			LocalDateTime registrationDate, ResponsibleCarModel responsibleCarModel) {
		
		this.id = id;
		this.licensePlateCar = licensePlateCar;
		this.brandCar = brandCar;
		this.modelCar = modelCar;
		this.colorCar = colorCar;
		this.registrationDate = registrationDate;
		this.responsibleCarModel = responsibleCarModel;
	}



	/* Accessor Methods */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicensePlateCar() {
		return licensePlateCar;
	}

	public void setLicensePlateCar(String licensePlateCar) {
		this.licensePlateCar = licensePlateCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public ResponsibleCarModel getResponsibleCarModel() {
		return responsibleCarModel;
	}

	public void setResponsibleCarModel(ResponsibleCarModel responsibleCarModel) {
		this.responsibleCarModel = responsibleCarModel;
	}

	@Override
	public String toString() {
		return "CarModel [id=" + id + ", licensePlateCar=" + licensePlateCar + ", brandCar=" + brandCar + ", modelCar="
				+ modelCar + ", colorCar=" + colorCar + ", registrationDate=" + registrationDate
				+ ", responsibleCarModel=" + responsibleCarModel + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandCar, colorCar, id, licensePlateCar, modelCar, registrationDate, responsibleCarModel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarModel other = (CarModel) obj;
		return Objects.equals(brandCar, other.brandCar) && Objects.equals(colorCar, other.colorCar)
				&& Objects.equals(id, other.id) && Objects.equals(licensePlateCar, other.licensePlateCar)
				&& Objects.equals(modelCar, other.modelCar) && Objects.equals(registrationDate, other.registrationDate)
				&& Objects.equals(responsibleCarModel, other.responsibleCarModel);
	}
	
	
	

}
