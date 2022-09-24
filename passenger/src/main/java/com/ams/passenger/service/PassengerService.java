package com.ams.passenger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.passenger.model.FlightDTO;
import com.ams.passenger.model.Passenger;

@Service
public interface PassengerService {

	public Passenger getProfile(int profile_id);
	public Passenger createProfile(Passenger passenger);
	public Passenger updateProfile(Passenger passenger);
	public String deletePassenger(int passenger_id);
	public List<FlightDTO> getFlights(String to, String from);
}
