package com.practice.busrouteservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class BusRoute {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busRouteId;
	private String source;
	private String destination;
	private double price;
	private String distance;
	
	

}
