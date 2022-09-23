package com.ams.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.admin.model.Flight;

@Service
public interface FlightService {
	
	public Flight getFlightById(int flight_id);
	public List<Flight> getAllFlights();
	public Flight addNewFlight(Flight flight);
	public Flight updateFlight(Flight flight);
	public String deleteFlight(int flight_id);
	public String deletePassenger(int passenger_id);
	public String getFlightServicePort();
	public List<Flight> getFlights(String to, String from);
	
	

}