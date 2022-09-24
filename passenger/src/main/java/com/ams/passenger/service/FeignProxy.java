package com.ams.passenger.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ams.passenger.model.FlightDTO;


@FeignClient(name="adminService")
public interface FeignProxy {

	@GetMapping("flights/getFlights/{to}/{from}")
	public List<FlightDTO> getFlights(@PathVariable("to") String to,@PathVariable("from") String from);
	
	@GetMapping("flights/getFlightServicePort")
	public String getFlightServicePort();
}
