package com.example.routes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.routes.model.Bus;
import com.example.routes.model.Trip;
import com.example.routes.service.BusService;
import com.example.routes.service.TripService;

@Controller
public class AdminController {
	
	@Autowired
	private TripService tripService;
	
	@Autowired
	private BusService busService;
	
	@PostMapping("/trip/create")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public Trip mapTrip(Trip trip) {
		return tripService.create(trip);
    }
	
	@PostMapping("/bus/create")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public Bus addBus(Bus bus) {
		return busService.create(bus);
    }
	
	@PutMapping("/bus/edit")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public Bus editBus(Bus bus) {
		return busService.edit(bus);
    }
	
	@PutMapping("/bus/delete")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void delete(Bus bus) {
		 busService.delete(bus);
    }

}
