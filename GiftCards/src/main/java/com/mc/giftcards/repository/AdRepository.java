package com.mc.giftcards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mc.giftcards.models.ads;

public interface AdRepository extends CrudRepository<ads, Long> {

	@Query(nativeQuery = true, value = "select * from cc_ads where subcategoryid =?1")
	List<ads> findBySubCategoryId(@Param("subcategoryid") Long subcategoryid);

}
