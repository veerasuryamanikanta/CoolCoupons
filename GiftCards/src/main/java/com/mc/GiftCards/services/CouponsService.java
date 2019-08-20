package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Coupons;

public interface CouponsService {

	
	Coupons save(Coupons coupons);

	List<Coupons> findAll();
	
	Coupons findOne(Long id);
	
	void removeOne(Long id);
	
}
