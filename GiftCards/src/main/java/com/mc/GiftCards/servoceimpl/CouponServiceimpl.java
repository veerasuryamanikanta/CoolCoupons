package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Coupons;
import com.mc.GiftCards.repositories.CouponsRepository;
import com.mc.GiftCards.services.CouponsService;


@Service
public class CouponServiceimpl implements CouponsService {

	@Autowired
	CouponsRepository couponsRepository;

	@Override
	public Coupons save(Coupons coupons) {
		// TODO Auto-generated method stub
		return couponsRepository.save(coupons);
	}

	@Override
	public List<Coupons> findAll() {
		// TODO Auto-generated method stub
		return (List<Coupons>) couponsRepository.findAll();
	}

	@Override
	public Coupons findOne(Long id) {
		// TODO Auto-generated method stub
		return couponsRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		couponsRepository.delete(id);
	}

}
