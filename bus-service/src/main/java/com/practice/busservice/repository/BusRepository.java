package com.practice.busservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.busservice.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {

	Bus findByBusId(int id);
	
	

}

