package com.mc.giftcards.service;

import java.util.List;

import com.mc.giftcards.models.category;

public interface categoryService {

	category save(category category);

	List<category> findAll();

	category findOne(Long id);

	void removeOne(Long id);

}
