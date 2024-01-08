package com.example.routes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.routes.model.Bus;

public interface BusDao extends JpaRepository<Bus, Long>{
	@Query("SELECT b FROM Bus b WHERE b.id = :id")
	Bus getById(Long id);
	
	@Query("SELECT b FROM Bus b WHERE b.registrationNumber = :registrationNumber")
	Bus findByRegistrationNumber(String registrationNumber);
}
