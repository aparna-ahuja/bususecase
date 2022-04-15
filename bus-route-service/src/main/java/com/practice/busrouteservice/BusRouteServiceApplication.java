package com.practice.busrouteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusRouteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusRouteServiceApplication.class, args);
	}

}
