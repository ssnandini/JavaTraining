package com.nan.firstspringboot.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nan.firstspringboot.entity.Traveller;


@Repository
public interface TravellerRepository extends JpaRepository<Traveller, Long>{

	public void deleteById(Long travellerid);
}
