package com.practice.busrouteservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.busrouteservice.entity.BusRoute;

@Repository
public interface BusRouteRepository extends JpaRepository<BusRoute, Integer> {

	BusRoute findByBusRouteId(int id);

}
