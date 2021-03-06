package com.practice.busservice.controller;

	
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.practice.busservice.buswithrouteresponse.BusRouteResponse;
import com.practice.busservice.entity.Bus;
import com.practice.busservice.service.BusService;

	

	@RestController
	@RequestMapping("/buses")
	public class BusController {
		
		@Autowired
		BusService busService;
		
		@PostMapping("/")
		public Bus saveBus(@RequestBody Bus bus) {

			return  busService.addBus(bus);
		}
		
		@GetMapping("/allBuses")
		public List<Bus> findAllBus(){
			return  busService.findAllBus();
			
		}
		
		@GetMapping("/{busId}")
		public BusRouteResponse getBusById(@PathVariable int busId){
			return  busService.findBusById(busId);
			
		}
		
		@DeleteMapping("/{busId}")
		public void deleteBus(@PathVariable int busId) {
			busService.deleteById(busId);
		}
		
		
			@PutMapping("/{busId}")
			public Bus updateBus(@RequestBody Bus bus) {
				return busService.updateBus(bus);
			}
		

	}


