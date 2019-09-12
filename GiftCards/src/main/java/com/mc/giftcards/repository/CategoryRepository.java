package com.mc.giftcards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mc.giftcards.models.category;


public interface CategoryRepository extends CrudRepository<category, Long>{

	@Query(nativeQuery = true, value = "select * from cc_category where cityid =?1")
	List<category> findByCityId(@Param("cityid") Long cityid);
	
}
