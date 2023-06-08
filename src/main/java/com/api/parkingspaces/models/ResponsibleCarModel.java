package com.api.parkingspaces.models;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_RESPONSIBLE_CAR")
public class ResponsibleCarModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false, unique = true, length = 15)
	private String cpf;
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	@Column(nullable = false, length = 30)
	private String apartment;
	@Column(nullable = false, length = 30)
	private String block;
	
	/* Constructor */
	
	public ResponsibleCarModel() {
	}


	public ResponsibleCarModel(Long id, String firstName, String lastName, String cpf, LocalDateTime registrationDate,
			String apartment, String block) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.registrationDate = registrationDate;
		this.apartment = apartment;
		this.block = block;
	}

	/* Accessor Methods */
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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
		return "ResponsibleCarModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cpf=" + cpf
				+ ", registrationDate=" + registrationDate + ", apartment=" + apartment + ", block=" + block + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apartment, block, cpf, firstName, id, lastName, registrationDate);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponsibleCarModel other = (ResponsibleCarModel) obj;
		return Objects.equals(apartment, other.apartment) && Objects.equals(block, other.block)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(registrationDate, other.registrationDate);
	}
	
	
	
	
	
	

}
