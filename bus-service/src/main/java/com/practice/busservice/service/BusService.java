package com.practice.busservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.busservice.buswithrouteresponse.BusRoute;
import com.practice.busservice.buswithrouteresponse.BusRouteResponse;
import com.practice.busservice.entity.Bus;
import com.practice.busservice.repository.BusRepository;

@Service
public class BusService {
	
	@Autowired
	BusRepository busRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public BusRouteResponse findBusById(int id) {
		
		BusRouteResponse bro=new BusRouteResponse();
		Bus bus=busRepository.findByBusId(id);
		BusRoute busRoute=restTemplate.getForObject("http://BUS-ROUTE-SERVICE/busroutes/"+bus.getRouteId(), BusRoute.class);
		
		bro.setBus(bus);
		bro.setBusRoute(busRoute);
		
		return bro;
	}
	
	public List<Bus> findAllBus(){
		
		List<Bus> bus=busRepository.findAll();
		return bus;
	}
	
	public Bus addBus(Bus bus) {
		return busRepository.save(bus);
	}
	
	public void deleteById(int id) {
		busRepository.deleteById(id);
	}
	
	public Bus updateBus(Bus bus) {
		
			return busRepository.save(bus); //ID needs to be pass in case of update operation
		
		
	}

}
