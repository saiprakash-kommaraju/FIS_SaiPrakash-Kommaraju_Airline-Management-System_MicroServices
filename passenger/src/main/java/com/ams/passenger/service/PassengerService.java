package com.ams.passenger.service;

import org.springframework.stereotype.Service;

import com.ams.passenger.model.Passenger;

@Service
public interface PassengerService {

	public Passenger getProfile(int profile_id);
	public Passenger createProfile(Passenger passenger);
	public Passenger updateProfile(Passenger passenger);
	public String deletePassenger(int passenger_id);
}
