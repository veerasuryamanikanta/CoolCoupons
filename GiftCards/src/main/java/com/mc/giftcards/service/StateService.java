package com.mc.giftcards.service;

import java.util.List;

import com.mc.giftcards.models.state;

public interface StateService {

	state save(state state);

	List<state> findAll();

	state findOne(Long id);
	
	void removeOne(Long id);

}
