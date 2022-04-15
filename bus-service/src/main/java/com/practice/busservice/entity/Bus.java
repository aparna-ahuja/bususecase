package com.practice.busservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor  
@AllArgsConstructor  
@ToString  
public class Bus {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int busId;
	private String type;
	private int capacity;
	private String driver;
	private String speed;
	private int routeId;
	

}

