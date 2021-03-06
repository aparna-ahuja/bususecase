package com.practice.busservice.buswithrouteresponse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name="Bus_Routes")
public class BusRoute {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busRouteId;
	private String source;
	private String destination;
	private double price;
	private String distance;

}
