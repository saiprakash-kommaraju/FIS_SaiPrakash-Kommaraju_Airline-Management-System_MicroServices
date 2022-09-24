package com.ams.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.admin.model.Flight;
import com.ams.admin.repo.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {


	
	@Autowired
	FeignProxy proxy;
	
	@Autowired
	FlightRepository repo;
	
	@Override
	public Flight getFlightById(int flight_id) {
		Optional<Flight> flight=repo.findById(flight_id);
		return flight.get();
	}

	@Override
	public List<Flight> getAllFlights() {
		return repo.findAll();
	}

	@Override
	public Flight addNewFlight(Flight flight) {
		return repo.save(flight);
	}

	@Override
	public Flight updateFlight(Flight flight) {
		if(repo.existsById(flight.getFlight_Id())){
			return repo.save(flight);
		}
	return null;
	}

	@Override
	public String deleteFlight(int flight_id) {
		repo.deleteById(flight_id);
		return "Flight cancelled!";
	}

	@Override
	public String deletePassenger(int passenger_id) {
		return proxy.deletePassenger(passenger_id);
	}
	
	@Override
	public String getFlightServicePort() {
		return proxy.getPort();
	}

	@Override
	public List<Flight> getFlights(String to, String from) {
		List<Flight> l=new ArrayList<Flight>();
		for(Flight f:repo.findAll()) {
			if(f.getFrom_location().equals(from) && f.getTo_location().equals(to)) {
				l.add(f);
			}
		}
		return l;
	}
}