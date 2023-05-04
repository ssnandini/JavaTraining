package com.nan.firstspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nan.firstspringboot.entity.ForeignTour;
import com.nan.firstspringboot.entity.LocalTour;
import com.nan.firstspringboot.entity.Traveller;
import com.nan.firstspringboot.repo.ForeignTourRepository;
import com.nan.firstspringboot.repo.LocalTourRepository;
import com.nan.firstspringboot.repo.TravellerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TravellerServiceImp implements TravellerService {

	@Autowired
	private TravellerRepository travellerRepository;

	@Autowired
	private LocalTourRepository localTourRepository;

	@Autowired
	private ForeignTourRepository foreignTourRepository;

	@Override
	public Traveller addTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		return travellerRepository.save(traveller);
	}

	@Override
	public LocalTour saveLocalTourRequest(LocalTour localTour) {

		Traveller traveller = localTour.getTrtourist();
		localTour.setTrtourist(traveller);
		return localTourRepository.save(localTour);
	}

	@Override
	public List<Traveller> listAllTravellers() {
		return (List<Traveller>) travellerRepository.findAll();
	}

	@Override
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour) {
		System.out.println("-----------foreign Tour -------" + foreignTour);
		Traveller traveller = foreignTour.getTrtourist();
		foreignTour.setTrtourist(traveller);
		return foreignTourRepository.save(foreignTour);
	}

	@Override
	public void deleteTravellerById(long id) {
		travellerRepository.deleteById(id);
	}

	}
