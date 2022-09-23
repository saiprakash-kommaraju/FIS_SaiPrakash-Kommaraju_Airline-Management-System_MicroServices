package com.ams.admin.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {
	
	@Id
	public int flight_Id;
	@Column
	public int airline_Id;
	@Column
	public String airline_name;
	@Column
	public String from_location;
	@Column
	public String to_location;
	@Column
	public LocalTime depature_time;
	@Column
	public LocalTime arrival_time;
	@Column
	public LocalTime duration;
	@Column
	public int total_seats;
	public Flight(int flight_Id, int airlinr_Id, String airline_name, String from_location, String to_location,
			LocalTime depature_time, LocalTime arrival_time, LocalTime duration, int total_seats) {
		super();
		this.flight_Id = flight_Id;
		this.airline_Id = airlinr_Id;
		this.airline_name = airline_name;
		this.from_location = from_location;
		this.to_location = to_location;
		this.depature_time = depature_time;
		this.arrival_time = arrival_time;
		this.duration = duration;
		this.total_seats = total_seats;
	}
	public int getFlight_Id() {
		return flight_Id;
	}
	public void setFlight_Id(int flight_Id) {
		this.flight_Id = flight_Id;
	}
	public int getAirlinr_Id() {
		return airline_Id;
	}
	public void setAirlinr_Id(int airlinr_Id) {
		this.airline_Id = airlinr_Id;
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
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	

}