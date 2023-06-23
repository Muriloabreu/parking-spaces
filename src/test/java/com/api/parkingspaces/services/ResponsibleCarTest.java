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

import com.api.parkingspaces.models.ResponsibleCarModel;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ResponsibleCarTest {
	
	@Autowired
	ResponsibleCarService rs;
	
	//@Test
	@Ignore
	public void saveTest() {
		
		ResponsibleCarModel rm1 = new ResponsibleCarModel();
		
		rm1.setFirstName("Renato");
		rm1.setLastName("Silva");
		rm1.setCpf("001.001.007-09");
		rm1.setBlock("G");
		rm1.setApartment("1703");
		rm1.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		
		rs.save(rm1);
		
		System.out.println(rm1);
		
		
		
		
	}

}
