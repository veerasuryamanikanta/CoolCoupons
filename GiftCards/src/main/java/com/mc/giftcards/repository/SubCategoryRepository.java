package com.mc.giftcards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mc.giftcards.models.subcategory;

public interface SubCategoryRepository extends CrudRepository<subcategory, Long> {
	@Query(nativeQuery = true, value = "select * from cc_subcategory where cityid =?1")
	List<subcategory> findByCityId(@Param("cityid") Long cityid);

	@Query(nativeQuery = true, value = "select * from cc_subcategory where categoryid =?")
	List<subcategory> findByCategoryId(@Param("categoryid") Long categoryid);

}
