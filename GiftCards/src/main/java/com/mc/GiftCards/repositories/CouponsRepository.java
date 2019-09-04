package com.mc.GiftCards.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mc.GiftCards.dto.Coupons;


public interface CouponsRepository extends CrudRepository<Coupons, Long>{

	@Query(nativeQuery = true, value = "select * from cc_coupons where cc_coupon_id =?1")
	List<Coupons> findByCouponsCategory(@Param("cc_coupon_id") Long couponId);
	
}
