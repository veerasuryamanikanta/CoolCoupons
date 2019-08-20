package com.mc.GiftCards.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mc.GiftCards.dto.Countries;


public interface CountriesRepository extends CrudRepository<Countries, Long> {
	
	
}
