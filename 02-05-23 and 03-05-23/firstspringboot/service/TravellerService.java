package com.nan.firstspringboot.service;

import java.util.List;
import java.util.Optional;

import com.nan.firstspringboot.entity.ForeignTour;
import com.nan.firstspringboot.entity.LocalTour;
import com.nan.firstspringboot.entity.Traveller;



public interface TravellerService {
	public Traveller addTraveller(Traveller traveller);
	public LocalTour saveLocalTourRequest(LocalTour localTour);
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour);
	public List<Traveller> listAllTravellers();
	public void deleteTravellerById(long id);
	
}
