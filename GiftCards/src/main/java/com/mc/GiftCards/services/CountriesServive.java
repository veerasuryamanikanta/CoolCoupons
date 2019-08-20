package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Countries;


public interface CountriesServive {

	Countries save(Countries categories);

	List<Countries> findAll();
	
	Countries findOne(Long id);
	
	void removeOne(Long id);
	
}
