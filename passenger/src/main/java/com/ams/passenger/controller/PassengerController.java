package com.ams.passenger.controller;

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

import com.ams.passenger.model.FlightDTO;
import com.ams.passenger.model.Passenger;
import com.ams.passenger.service.PassengerService;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
	
	@Autowired
	PassengerService service;
	
	@GetMapping("/getProfile/{profile_id}")
	public Passenger getProfile(@PathVariable("profile_id")int profile_id) {
		return service.getProfile(profile_id);
	}
	
	@PostMapping("/createProfile")
	public Passenger createProfile(@RequestBody Passenger passenger) {
		return service.createProfile(passenger);
	}
	
	@PutMapping("/updateProfile")
	public Passenger updateProfile(@RequestBody Passenger passenger) {
		return service.updateProfile(passenger);
	}
	
	@DeleteMapping("/deletePassenger/{passenger_id}")
	public String deletePassenger(@PathVariable("passenger_id")int passenger_id){
		return service.deletePassenger(passenger_id);
	}

	@GetMapping("/getFlights/{to}/{from}")
	public List<FlightDTO> getFlights(@PathVariable("to") String to,@PathVariable("from") String from){
		return service.getFlights(to, from);
	}
}
