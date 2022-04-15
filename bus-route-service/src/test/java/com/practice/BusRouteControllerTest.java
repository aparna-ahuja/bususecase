package com.practice;

import org.springframework.boot.test.context.SpringBootTest;

import com.practice.busrouteservice.BusRouteServiceApplication;
import com.practice.busrouteservice.Service.BusRouteService;
import com.practice.busrouteservice.entity.BusRoute;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(classes = BusRouteServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BusRouteControllerTest {
	
	@MockBean
	private BusRouteService busRouteSrvice;
	
	@LocalServerPort
	private int port;
	
	private BusRoute br1,br2;
	
	@BeforeEach
	public void setUpMockData() {
		br1=new BusRoute(7,"Pune","Goa",1700.00,"800km");
		br2=new BusRoute(7,"Mumbai","Surat",1250.00,"200km");
		
	}

}
