package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Stores;

public interface StoreService {

	
	Stores save(Stores stores);

	List<Stores> findAll();
	
	Stores findOne(Long id);
	
	void removeOne(Long id);
	
}
