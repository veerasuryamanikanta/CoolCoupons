package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.SubCategories;

public interface SubCategoryservice {

	
	SubCategories save(SubCategories subcategories);

	List<SubCategories> findAll();
	
	SubCategories findOne(Long id);
	
	void removeOne(Long id);
	
}
