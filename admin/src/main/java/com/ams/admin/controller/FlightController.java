package com.ams.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.admin.model.Flight;
import com.ams.admin.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	FlightService service;
	
	@GetMapping("/getAllFlights")
	public List<Flight> getAllFlights(){
		return service.getAllFlights();
	}

	@GetMapping("/getFlight/{flight_id}")
	public Flight getFlightById(@PathVariable("flight_id")int flight_id){
		return service.getFlightById(flight_id);
	}
	
	@GetMapping("/getFlights/{to}/{from}")
	public List<Flight> getFlights(@PathVariable("to") String to,@PathVariable("from") String from){
		return service.getFlights(to, from);
	}
	

	@PostMapping("/addFlight")
	public Flight addNewFlight(@RequestBody Flight flight) {
		return service.addNewFlight(flight);
	}

	@PutMapping("/updateFlight")
	public Flight updateFlight(@RequestBody Flight flight){
		return service.updateFlight(flight);
	}
	
	@DeleteMapping("/deleteFlight/{flight_id}")
	public String deleteFlight(@PathVariable("flight_id")int flight_id) {
		return service.deleteFlight(flight_id);
	}
	
	@DeleteMapping("/deletePassenger/{passenger_id}")
	public String deletePassenger(@PathVariable("passenger_id")int passenger_id){
		return service.deletePassenger(passenger_id);
	}
	
	@GetMapping("/getFlightServicePort")
	public String getFlightServicePort() {
		return "Flight Service is connected to flight service running on  "+service.getFlightServicePort()+" port ";
	}
}