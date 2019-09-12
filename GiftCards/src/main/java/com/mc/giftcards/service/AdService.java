package com.mc.giftcards.service;

import java.util.List;

import com.mc.giftcards.models.ads;

public interface AdService {

	ads save(ads ads);

	List<ads> findAll();

	ads findOne(Long id);

	void removeOne(Long id);

	List<ads> findBySubCategory(Long subacategoryid);

}
