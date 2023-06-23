package com.api.parkingspaces.services;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.api.parkingspaces.models.CarModel;
import com.api.parkingspaces.models.ParkingSpotModel;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ParkingSpotTest {
	
	@Autowired
	ParkingSpotService ps;
	
	@Test
	public void saveTest() {
		
		List<CarModel> cars = new ArrayList<>();
		
		CarModel c1 = new CarModel();
		c1.setId(306L);
		CarModel c2 = new CarModel();
		c2.setId(303L);
		
		cars.add(c1);
		//cars.add(c2);
		
		
		
	ParkingSpotModel ps1 = new ParkingSpotModel();
	ps1.setParkingSpotNumberA("AA0005");
	ps1.setParkingSpotNumberB("AA0006");
	ps1.setCars(cars);
	
	long count = cars.size();
	
	
		
		if(count < 2) {
			
			ps1.setStatusParkingSpotA(true);
			ps1.setStatusParkingSpotB(false);
			
		}else {
			ps1.setStatusParkingSpotA(true);
			ps1.setStatusParkingSpotB(true);
		}
		
	
		
		
	ps1.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
	
	ps.save(ps1);	
	
	}
	
	
}
