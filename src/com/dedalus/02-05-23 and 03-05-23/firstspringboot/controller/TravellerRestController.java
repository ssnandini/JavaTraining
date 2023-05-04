package com.nan.firstspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nan.firstspringboot.entity.ForeignTour;
import com.nan.firstspringboot.entity.LocalTour;
import com.nan.firstspringboot.entity.Traveller;
import com.nan.firstspringboot.repo.TravellerRepository;

import java.util.List;

import com.nan.firstspringboot.service.TravellerService;

@RestController
public class TravellerRestController {

	@Autowired
	TravellerService travellerService;

	@GetMapping("/welcome")
	public String helloAppln() {
		return "Hi Traveller-SSN";
	}

	@GetMapping("/listtravellers")
	public List<Traveller> listAllTravellers() {
		return travellerService.listAllTravellers();
	}

	@PostMapping("/addtraveller")
	public Traveller addTraveller(@RequestBody Traveller traveller) {
		return travellerService.addTraveller(traveller);
	}

	@PostMapping("/requestlocaltour")
	public LocalTour saveLocalTourRequest(@RequestBody LocalTour localTour) {
		return travellerService.saveLocalTourRequest(localTour);
	}

	@PostMapping("/requestforeigntour")
	public ForeignTour saveForeignTourRequest(@RequestBody ForeignTour foreignTour) {
		System.out.println("****** From Controller Foreign ******" + foreignTour);
		return travellerService.saveForeignTourRequest(foreignTour);
	}

	@DeleteMapping("/deletetravellers/{id}")
	public void deleteTravellerById(@PathVariable Long id) {
		travellerService.deleteTravellerById(id);
	}

}
