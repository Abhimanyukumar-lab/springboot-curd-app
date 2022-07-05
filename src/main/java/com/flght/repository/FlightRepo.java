package com.flght.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flght.entity.Flight;
@Repository
public interface FlightRepo extends JpaRepository<Flight,Long>{

	

	Flight findByflightName(String name);

}
