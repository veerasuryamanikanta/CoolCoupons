package com.mc.giftcards.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.giftcards.models.city;
import com.mc.giftcards.repository.CityRepository;
import com.mc.giftcards.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityrepository;

	@Override
	public city save(city city) {
		// TODO Auto-generated method stub
		return cityrepository.save(city);
	}

	@Override
	public List<city> findAll() {
		// TODO Auto-generated method stub
		return (List<city>) cityrepository.findAll();
	}

	@Override
	public city findOne(Long id) {
		// TODO Auto-generated method stub
		return cityrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		cityrepository.delete(id);
	}

}
