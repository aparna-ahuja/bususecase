package com.practice.busrouteservice.controller;

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

import com.practice.busrouteservice.Service.BusRouteService;
import com.practice.busrouteservice.entity.BusRoute;

@RestController
@RequestMapping("/busroutes")
public class BusRouteController {

	@Autowired
	BusRouteService busRouteService;

	@GetMapping("/")
	public List<BusRoute> findAllBusRoutes() {
		return busRouteService.findAllBusRoute();
	}

	@GetMapping("/{routeId}")
	public BusRoute findBusRouteById(@PathVariable int routeId) {
		return busRouteService.findBusRouteById(routeId);
	}

	@PostMapping("/")
	public BusRoute addBusRoute(@RequestBody BusRoute busRoute) {
		return busRouteService.addBusRoute(busRoute);
	}

	@DeleteMapping("/{routeId}")
	public void deleteBusRoute(@PathVariable int routeId) {
		busRouteService.deleteBusRoute(routeId);
	}

	@PutMapping("/")
	public BusRoute updateBusRoute(@RequestBody BusRoute busRoute) {
		return busRouteService.updateBusRoute(busRoute);
	}

}
