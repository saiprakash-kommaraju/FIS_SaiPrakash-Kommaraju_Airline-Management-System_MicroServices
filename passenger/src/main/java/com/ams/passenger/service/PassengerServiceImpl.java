package com.ams.passenger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.passenger.model.FlightDTO;
import com.ams.passenger.model.Passenger;
import com.ams.passenger.repo.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerRepository repo;
	
	@Autowired
	FeignProxy proxy;

	@Override
	public Passenger getProfile(int profile_id) {
		Optional<Passenger> passenger=repo.findById(profile_id);
		return passenger.get();
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
		return "User deleted!";
	}
	
	@Override
	public List<FlightDTO> getFlights(String to,String from){
		return proxy.getFlights(to, from);
	}

}
