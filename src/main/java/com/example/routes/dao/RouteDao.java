package com.example.routes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.routes.model.Route;

public interface RouteDao  extends JpaRepository<Route, Long>{
	
	@Query("SELECT r FROM Route r WHERE r.startingPoint = :startPoint and r.endingPoint = :endPoint")
    public Route getRouteByPoints(@Param("startPoint") String startPoint, @Param("endPoint") String endPoint);
}
