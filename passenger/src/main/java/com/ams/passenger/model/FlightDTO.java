package com.ams.passenger.model;

import java.time.LocalTime;

public class FlightDTO {

	public int flight_Id;
	public int airline_Id;
	public String airline_name;
	public String from_location;
	public String to_location;
	public LocalTime depature_time;
	public LocalTime arrival_time;
	public LocalTime duration;
	public int total_seats;
	public int getFlight_Id() {
		return flight_Id;
	}
	public void setFlight_Id(int flight_Id) {
		this.flight_Id = flight_Id;
	}
	public int getAirline_Id() {
		return airline_Id;
	}
	public void setAirline_Id(int airline_Id) {
		this.airline_Id = airline_Id;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	public LocalTime getDepature_time() {
		return depature_time;
	}
	public void setDepature_time(LocalTime depature_time) {
		this.depature_time = depature_time;
	}
	public LocalTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(LocalTime arrival_time) {
		this.arrival_time = arrival_time;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}
	
	public FlightDTO() {
		// TODO Auto-generated constructor stub
	}
	public FlightDTO(int flight_Id, int airline_Id, String airline_name, String from_location, String to_location,
			LocalTime depature_time, LocalTime arrival_time, LocalTime duration, int total_seats) {
		super();
		this.flight_Id = flight_Id;
		this.airline_Id = airline_Id;
		this.airline_name = airline_name;
		this.from_location = from_location;
		this.to_location = to_location;
		this.depature_time = depature_time;
		this.arrival_time = arrival_time;
		this.duration = duration;
		this.total_seats = total_seats;
	}
	
}
