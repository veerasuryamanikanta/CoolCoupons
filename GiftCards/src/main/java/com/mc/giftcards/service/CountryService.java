package com.mc.giftcards.service;

import java.util.List;

import com.mc.giftcards.models.country;

public interface CountryService {

	country save(country country);

	List<country> findAll();

	country findOne(Long id);

	void removeOne(Long id);

}
