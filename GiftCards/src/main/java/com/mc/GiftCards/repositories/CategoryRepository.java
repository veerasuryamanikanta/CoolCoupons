package com.mc.GiftCards.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mc.GiftCards.dto.Category;



public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	
}
