package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Category;


public interface CategoryServive {

	Category save(Category categories);

	List<Category> findAll();
	
	Category findOne(Long id);
	
	void removeOne(Long id);
	
}
