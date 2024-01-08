package com.example.routes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Route {
	@Id
    @Column(name = "route_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String startingPoint;
    private String endingPoint;
	public Route(String startingPoint, String endingPoint) {
		// TODO Auto-generated constructor stub
		this.startingPoint = startingPoint;
		this.setEndingPoint(endingPoint);
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getEndingPoint() {
		return endingPoint;
	}
	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}
}
