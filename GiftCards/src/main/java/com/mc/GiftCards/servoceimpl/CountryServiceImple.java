package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Countries;
import com.mc.GiftCards.repositories.CountriesRepository;
import com.mc.GiftCards.services.CountriesServive;


@Service
public class CountryServiceImple implements CountriesServive {
	
	
	@Autowired
	private CountriesRepository categoryRepository;

	@Override
	public Countries save(Countries categories) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categories);
	}

	@Override
	public List<Countries> findAll() {
		// TODO Auto-generated method stub
		return (List<Countries>) categoryRepository.findAll();
	}

	@Override
	public Countries findOne(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.delete(id);
	}



	

	

}
