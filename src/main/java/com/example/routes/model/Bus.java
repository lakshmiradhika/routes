package com.example.routes.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

public class Bus {
	@Id
    @Column(name = "bus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private String registrationNumber;
    private Integer noOfSeats;
   
    
    private String busType;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "trip",
            joinColumns = @JoinColumn(name = "bus_id"),
            inverseJoinColumns = @JoinColumn(name = "route_id")
            )
    private Route route ;
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
    
    
}
