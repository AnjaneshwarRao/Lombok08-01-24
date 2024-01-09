package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
public class Address {
	private int Flat_num;
	private String name;
	private int zipcode;
	
	
	

}
