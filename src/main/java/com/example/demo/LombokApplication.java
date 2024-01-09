package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(LombokApplication.class, args);
		Employee emplo = (Employee)context.getBean("EmployeeBean");
	Address addo = (Address)context.getBean("AddressBean");
	System.out.println("The employee bean " + emplo);
	System.out.println("The address bean " + addo);

	}

}
