package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.States;



public interface StatesServive {

	States save(States brand);

	List<States> findAll();
	
	States findOne(Long id);
	
	void removeOne(Long id);
	
}
