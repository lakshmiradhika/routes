package com.example.routes.service;

import java.util.List;

import com.example.routes.model.Trip;

public interface TripService {

	Trip create(Trip trip);

	List<Trip> findByRoute(String startPoint, String endPoint);

}
