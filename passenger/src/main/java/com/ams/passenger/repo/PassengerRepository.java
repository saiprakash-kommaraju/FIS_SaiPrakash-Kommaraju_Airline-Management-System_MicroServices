package com.ams.passenger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.passenger.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer>{

}
