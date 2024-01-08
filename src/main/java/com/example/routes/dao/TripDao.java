package com.example.routes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.routes.model.Trip;

public interface TripDao  extends JpaRepository<Trip, Long>{
	@Query("SELECT t FROM Trip t WHERE t.busId = :busId")
	List<Trip> findByBusId(Long busId);
	
	@Query("SELECT t FROM Trip t WHERE t.routeId = :routeId")
	List<Trip> findTripByRoute(@Param("routeId") Long routeId);
}
