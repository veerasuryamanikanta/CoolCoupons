package com.mc.giftcards.service;

import java.util.List;

import com.mc.giftcards.models.subcategory;

public interface SubCategoryService {

	subcategory save(subcategory subcategory);

	List<subcategory> findAll();

	subcategory findOne(Long id);

	void removeOne(Long id);

	List<subcategory> findByCity(Long cityid);

}
