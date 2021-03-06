package com.practice.busservicecloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallBackMethodController {
	

	@GetMapping("/busServiceFallBack")
	public String busServiceFallBackMethod() {
		return "Bus Service is taking longer than expected..Please try again Later";
	}
	
	@GetMapping("/busRouteServiceFallBack")
	public String busRouteServiceFallBackMethod() {
		return "BusRoute Service is taking longer than expected..Please try again Later";
	}

}
