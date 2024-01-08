package com.example.routes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.routes.dao.RouteDao;
import com.example.routes.model.Route;

@Service
public class RouteServiceImpl implements RouteService {
	
	@Autowired
	private RouteDao routeDao;

	@Override
	public Route getRoute(String startPoint, String endPoint) {
		// TODO Auto-generated method stub
		return routeDao.getRouteByPoints(startPoint, endPoint);
	}
	
//	public void addRoutes() {
//		routeDao.save(new Route("HYD", "BZA"));
//		routeDao.save(new Route("GNT", "HYD"));
//		routeDao.save(new Route("BOM", "PUNE"));
//		
//	}
	
}
