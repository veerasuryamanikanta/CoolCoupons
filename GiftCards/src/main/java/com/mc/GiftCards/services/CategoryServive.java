package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.Categories;


public interface CategoryServive {

	Categories save(Categories categories);

	List<Categories> findAll();
	
	Categories findOne(Long id);
	
	void removeOne(Long id);
	
}
