package com.flght.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flght.entity.Flight;
import com.flght.service.FlightService;



@RestController
public class FlightController {
	@Autowired
	private FlightService service;
	@PostMapping("/flight")
	public Flight addFlight(@RequestBody Flight flight) {
		return service.saveFlight(flight);
		
	}
	@GetMapping("/flights")
	public java.util.List<Flight> findAllFlights(){
		return service.getFlights();
	}
	
	@GetMapping("/flightById/{id}")
	public Flight findFlightById(@PathVariable long id) {
		return service.getFlightById(id);
	}
	
	@GetMapping("/flightByName/{name}")
	public Flight findByflightName(@PathVariable String name) {
		return service.getFlightByflightName(name);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteFlight(@PathVariable long id) {
		return service.deleteFlight(id);
	}
	
	@PutMapping("/update")
	public Flight updateFlight(@RequestBody Flight flight,@PathVariable  long id) {
		return service.updateFlight(flight);
	}
	
	//creating put mapping
	@PutMapping("/updates")
	public Flight update(@RequestBody Flight flight) {
		service.saveOrUpdate(flight);
		return flight;
	}

}