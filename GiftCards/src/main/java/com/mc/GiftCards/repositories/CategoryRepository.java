package com.mc.GiftCards.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mc.GiftCards.dto.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	@Query(nativeQuery = true, value = "select * from cc_categories where cc_city_id =?1")
	List<Category> findByCc_categoriesCc_city_id(@Param("cc_catg_id") Long categoryId);
}
