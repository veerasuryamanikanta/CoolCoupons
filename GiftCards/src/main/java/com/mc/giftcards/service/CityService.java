package com.mc.giftcards.service;

import java.util.List;

import com.mc.giftcards.models.city;

public interface CityService {

	city save(city city);

	List<city> findAll();

	city findOne(Long id);

	void removeOne(Long id);

}
