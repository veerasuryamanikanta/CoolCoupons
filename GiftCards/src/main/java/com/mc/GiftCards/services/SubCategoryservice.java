package com.mc.GiftCards.services;

import java.util.List;

import com.mc.GiftCards.dto.SubCategory;

public interface SubCategoryservice {

	
	SubCategory save(SubCategory subcategories);

	List<SubCategory> findAll();
	
	List<SubCategory> findByCategory(Long categoryId);
	
	SubCategory findOne(Long id);
	
	void removeOne(Long id);
	
}
