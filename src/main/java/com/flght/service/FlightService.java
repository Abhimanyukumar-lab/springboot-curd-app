package com.flght.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flght.entity.Flight;
import com.flght.repository.FlightRepo;



@Service
public class FlightService {
	@Autowired
	private FlightRepo Repo;
	
	public Flight saveFlight(Flight flight) {
		return Repo.save(flight);
	}
	
	
	public java.util.List<Flight> getFlights(){
		return Repo.findAll();
	}
	
	public  Flight getFlightById(long id) {
		return Repo.findById(id).orElse(null);
		
	}
	
	public Flight getFlightByflightName(String name) {
		return Repo.findByflightName(name);
	}

	public String deleteFlight(long id) {
		Repo.deleteById(id);
		return "flight removed!!" +id;
	}
	
	public Flight updateFlight(Flight flight) {
		Flight existingFlight=Repo.findById(flight.getId()).orElse(null);
		existingFlight.setFlightName(flight.getFlightName());
		existingFlight.setSource(flight.getSource());
		existingFlight.setDestination(flight.getDestination());
		return Repo.save(existingFlight);
	}
	
	//updating reords
	public void update(Flight flight,long id) {
		Repo.save(flight);
	}


	public void saveOrUpdate(Flight flight) {
		// TODO Auto-generated method stub
		Repo.save(flight);
	}
	


}
