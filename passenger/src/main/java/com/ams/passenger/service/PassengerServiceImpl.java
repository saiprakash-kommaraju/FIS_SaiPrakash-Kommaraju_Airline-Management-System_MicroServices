package com.ams.passenger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.passenger.model.Passenger;
import com.ams.passenger.repo.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerRepository repo;

	@Override
	public Passenger getProfile(int profile_id) {
		return repo.getById(profile_id);
	}

	@Override
	public Passenger createProfile(Passenger passenger) {
		return repo.save(passenger);
	}

	@Override
	public Passenger updateProfile(Passenger passenger) {
		if(repo.existsById(passenger.getProfile_id())) {
			return repo.save(passenger);
		}
		return null;
	}
	
	@Override
	public String deletePassenger(int passenger_id) {
		repo.deleteById(passenger_id);
		return "Flight cancelled!";
	}

}
