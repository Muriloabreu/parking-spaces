package com.api.parkingspaces.dto;

import com.api.parkingspaces.models.ResponsibleCarModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CarDto {
	
	@NotBlank
	private String licensePlateCar;
	@NotBlank
	private String brandCar;
	@NotBlank
	private String modelCar;
	@NotBlank
	private String colorCar;
	@NotNull
	private ResponsibleCarModel responsibleCarModel;
	
	/* Constructor */
	
	public CarDto() {
	}

	public CarDto(@NotBlank String licensePlateCar, @NotBlank String brandCar, @NotBlank String modelCar,
			@NotBlank String colorCar, @NotNull ResponsibleCarModel responsibleCarModel) {
		super();
		this.licensePlateCar = licensePlateCar;
		this.brandCar = brandCar;
		this.modelCar = modelCar;
		this.colorCar = colorCar;
		this.responsibleCarModel = responsibleCarModel;
	}



	/* Accessor Methods */
	
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
	
	public ResponsibleCarModel getResponsibleCarModel() {
		return responsibleCarModel;
	}
	
	public void setResponsibleCarModel(ResponsibleCarModel responsibleCarModel) {
		this.responsibleCarModel = responsibleCarModel;
	}
	

}
