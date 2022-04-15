package com.practice.busservice.buswithrouteresponse;

import com.practice.busservice.entity.Bus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusRouteResponse {
	
	private Bus bus;
	private BusRoute busRoute;

}
