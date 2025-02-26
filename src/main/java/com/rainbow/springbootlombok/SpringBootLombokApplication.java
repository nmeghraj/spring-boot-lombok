package com.rainbow.springbootlombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLombokApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootLombokApplication.class, args);

		Customer customer = new Customer(1001, "Aryan");
		System.out.println("CIF:" + customer.getCif());
		System.out.println("Customer Name:" + customer.getName());
	}
}
