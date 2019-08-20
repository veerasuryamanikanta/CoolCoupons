package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Banners;

public interface BannerService {

	
	Banners save(Banners banners);

	List<Banners> findAll();
	
	Banners findOne(Long id);
	
	void removeOne(Long id);
	
}
