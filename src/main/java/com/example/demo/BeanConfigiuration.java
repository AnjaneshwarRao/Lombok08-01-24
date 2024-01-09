package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigiuration {
	
	@Bean("AddressBean")
	public Address addres() {
		Address address = new Address();
        address.setFlat_num(101);
        address.setName("Sample Street");
        address.setZipcode(12345);
        return address;
	}
	
	@Bean("EmployeeBean")
	public Employee employees() {

	
		return new Employee();
	}

}
