package com.mc.GiftCards.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mc.GiftCards.dto.Categories;



public interface CategoryRepository extends CrudRepository<Categories, Long> {
	
	
}
