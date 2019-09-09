package com.mc.giftcards.service;

import java.util.List;

import com.mc.giftcards.models.location;

public interface LocationService {

	location save(location location);

	List<location> findAll();

	location findOne(Long id);

	void removeOne(Long id);

}
