package com.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.practice.busrouteservice.BusRouteServiceApplication;

@SpringBootTest(classes = BusRouteServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BusRouteServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
