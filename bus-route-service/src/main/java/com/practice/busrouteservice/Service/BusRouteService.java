package com.practice.busrouteservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.busrouteservice.entity.BusRoute;
import com.practice.busrouteservice.repository.BusRouteRepository;

@Service
public class BusRouteService {

	@Autowired
	BusRouteRepository busRouteRepository;

	public List<BusRoute> findAllBusRoute() {
		return busRouteRepository.findAll();
	}

	public BusRoute findBusRouteById(int routeId) {
		return busRouteRepository.findByBusRouteId(routeId);
	}

	public BusRoute addBusRoute(BusRoute busRoute) {
		return busRouteRepository.save(busRoute);
	}

	public void deleteBusRoute(int routeId) {
		busRouteRepository.deleteById(routeId);
	}

	public BusRoute updateBusRoute(BusRoute busRoute) {
		return busRouteRepository.save(busRoute);
	}

}
