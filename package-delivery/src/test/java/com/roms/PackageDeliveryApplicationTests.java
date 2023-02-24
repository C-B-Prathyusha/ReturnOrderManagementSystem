package com.roms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.roms.packagingdelivery.service.PackingDeliveryService;

@SpringBootTest
class PackageDeliveryApplicationTests {

	
	   @Autowired
	   private PackingDeliveryService service;

	   @Test
	   void whenComponentTypeIsProvidedThenRetrievedPackageAndDeliveryIsCorrect() {
	     assertEquals(700.0,service.getCostForPackageAndDelivery("Integral",2));
	     assertEquals(0.0,service.getCostForPackageAndDelivery("Integral",0));	
	     assertEquals(400.0,service.getCostForPackageAndDelivery("Accessory",2));	
	     assertEquals(0.0,service.getCostForPackageAndDelivery("Accessory",0));	
	   }
	   
	   @Test
	   void whenInvalidQuantityisProvidedThenRetrievedPackageAndDeliveryIsCorrectlyComputed() {
	     assertEquals(0.0,service.getCostForPackageAndDelivery("Integral",-2));		
	     assertEquals(0.0,service.getCostForPackageAndDelivery("Accessory",-5));	
	     
	   }

}
