package com.example.routes.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

public class Trip {
	@Id
    @Column(name = "trip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Long busId;
    private Long routeId;
    private Date startTime;
    private Date endTime;
   
    
	public Long getBusId() {
		return busId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public Long getRouteId() {
		return routeId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}
