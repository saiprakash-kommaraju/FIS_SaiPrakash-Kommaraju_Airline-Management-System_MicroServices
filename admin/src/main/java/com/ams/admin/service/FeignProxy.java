package com.ams.admin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="passengerService")
public interface FeignProxy {

	@DeleteMapping("passengers/deletePassenger/{id}")
	public String deletePassenger(@PathVariable("id") int id);
	
	@GetMapping("passengers/getPassengerServicePort")
	public String getPort();
}