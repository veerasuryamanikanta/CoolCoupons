package com.mc.GiftCards.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mc.GiftCards.dto.SubCategory;


public interface SubCategoryrepository extends CrudRepository<SubCategory, Long>{
	
	@Query(nativeQuery =  true, value = "select * from cc_subcategory where cc_catg_id =?1")
	List<SubCategory> findByCc_categoriesCc_catg_id(@Param("cc_catg_id") Long categoryId);

}
