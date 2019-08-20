package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Cities;



public interface CitiesService {

	
	Cities save(Cities subcategories);

	List<Cities> findAll();
	
	Cities findOne(Long id);
	
	void removeOne(Long id);
	
}
