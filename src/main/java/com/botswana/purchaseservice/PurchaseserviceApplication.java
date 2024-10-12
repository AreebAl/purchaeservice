package com.botswana.purchaseservice;

import com.botswana.purchaseservice.dto.AddressDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PurchaseserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseserviceApplication.class, args);
		// Create a new AddressDto instance
		AddressDto dto = new AddressDto();

		// Print the default state of AddressDto
		System.out.println("Initial AddressDto: " + dto);

		// Check optional fields (not setting them)
		// Print the object to see the default (null) values
		System.out.println("Address Line 1: " + dto.getAddressLine1()); // Should be null
		System.out.println("Address Line 2: " + dto.getAddressLine2()); // Should be null
		System.out.println("Address Line 3: " + dto.getAddressLine3()); // Should be null
		System.out.println("City: " + dto.getCity()); // Should be null or empty based on your validation

		// Now set some fields to see how it works
		dto.setCity("Gaborone");

		// Print the object again to see the updated state
		System.out.println("Updated AddressDto: " + dto);
	}

}
