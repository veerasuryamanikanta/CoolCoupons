package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Locations;



public interface LocationServices {

	
	Locations save(Locations locations);

	List<Locations> findAll();
	
	Locations findOne(Long id);
	
	void removeOne(Long id);
	
}
