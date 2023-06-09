package com.api.parkingspaces.dto;

import jakarta.validation.constraints.NotBlank;

public class ResponsibleCarDto {
	
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private String cpf;
	@NotBlank	
	private String apartment;
	@NotBlank
	private String block;
	
	
	public ResponsibleCarDto() {
	}


	public ResponsibleCarDto(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String cpf,
			@NotBlank String apartment, @NotBlank String block) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.apartment = apartment;
		this.block = block;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
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
