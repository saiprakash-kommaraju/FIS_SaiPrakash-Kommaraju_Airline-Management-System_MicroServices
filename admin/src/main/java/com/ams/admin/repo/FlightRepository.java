package com.ams.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.admin.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer>{
	
	
}