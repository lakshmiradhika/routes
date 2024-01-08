package com.example.routes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routes.dao.TripDao;
import com.example.routes.model.Route;
import com.example.routes.model.Trip;

@Service
public class TripServiceImpl implements TripService {
	
	@Autowired
	private TripDao tripDao;
	
	@Autowired
	private RouteService routeService;

	@Override
	public Trip create(Trip trip) {
		// TODO Auto-generated method stub
		List<Trip> trips = tripDao.findByBusId(trip.getBusId());
		for(Trip tripEach : trips) {
			if(tripEach.getEndTime().after(trip.getStartTime())) {
				return null;
			}
		}
		return tripDao.save(trip);
	}

	@Override
	public List<Trip> findByRoute(String startPoint, String endPoint) {
		// TODO Auto-generated method stub
		Route route = routeService.getRoute(startPoint, endPoint);
		return tripDao.findTripByRoute(route.getId());
	}
	
	

}
