package com.api.parkingspaces.services;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.models.ResponsibleCarModel;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class CarsTest {
	
	@Autowired
	CarService cs;
	
	//@Test
	@Ignore
	public void saveTest() {
		
		
		CarModel cm1 = new CarModel();
		CarModel cm2 = new CarModel();
		
		CarModel cm3 = new CarModel();
		CarModel cm4 = new CarModel();
		
		CarModel cm5 = new CarModel();
		CarModel cm6 = new CarModel();
		
		CarModel cm7 = new CarModel();
		
		ResponsibleCarModel rm1 = new ResponsibleCarModel();
		rm1.setId(1l);		
		ResponsibleCarModel rm2 = new ResponsibleCarModel();
		rm2.setId(2L);	
		ResponsibleCarModel rm3 = new ResponsibleCarModel();
		rm3.setId(202L);	
		ResponsibleCarModel rm4 = new ResponsibleCarModel();
		rm4.setId(252L);	
		ResponsibleCarModel rm5 = new ResponsibleCarModel();
		rm5.setId(352L);	
		
		
		
		cm1.setBrandCar("FIAT");
		cm1.setModelCar("PULSE");
		cm1.setColorCar("VERMELHA");
		cm1.setLicensePlateCar("ABC1A13");
		cm1.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		cm1.setResponsibleCarModel(rm1);
		
		cm2.setBrandCar("HONDA");
		cm2.setModelCar("CIVIC");
		cm2.setColorCar("BRANCA");
		cm2.setLicensePlateCar("ABC1A14");
		cm2.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		cm2.setResponsibleCarModel(rm1);
		
		cm3.setBrandCar("TOYOTA");
		cm3.setModelCar("COROLA");
		cm3.setColorCar("PRETA");
		cm3.setLicensePlateCar("ABC1A15");
		cm3.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		cm3.setResponsibleCarModel(rm2);
		
		cm4.setBrandCar("NISSAN");
		cm4.setModelCar("KIKS");
		cm4.setColorCar("BRANCA");
		cm4.setLicensePlateCar("ABC1A16");
		cm4.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		cm4.setResponsibleCarModel(rm3);
		
		cm5.setBrandCar("FIAT");
		cm5.setModelCar("TORO");
		cm5.setColorCar("PRATA");
		cm5.setLicensePlateCar("ABC1A17");
		cm5.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		cm5.setResponsibleCarModel(rm4);
		
		cm6.setBrandCar("WOLKS");
		cm6.setModelCar("NIVUS");
		cm6.setColorCar("AZUL");
		cm6.setLicensePlateCar("ABC1A18");
		cm6.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		cm6.setResponsibleCarModel(rm5);
		
		cm7.setBrandCar("WOLKS");
		cm7.setModelCar("POLO");
		cm7.setColorCar("BRANCA");
		cm7.setLicensePlateCar("ABC1A19");
		cm7.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		cm7.setResponsibleCarModel(rm5);
		
		cs.save(cm1);
		cs.save(cm2);
		cs.save(cm3);
		cs.save(cm4);
		cs.save(cm5);
		cs.save(cm6);
		cs.save(cm7);
		
		
	}
	
	
	
	

}
