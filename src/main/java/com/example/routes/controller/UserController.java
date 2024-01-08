package com.example.routes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.routes.model.Trip;
import com.example.routes.service.TripService;

@Controller
public class UserController {
	
	@Autowired
	private TripService tripService;

    @GetMapping("/welcome")
    public String greeting() {
        return "welcome";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/trips")
    public List<Trip> getTrips(String startPoint, String endPoint) {
		return tripService.findByRoute(startPoint,endPoint);
    	
    }
}
