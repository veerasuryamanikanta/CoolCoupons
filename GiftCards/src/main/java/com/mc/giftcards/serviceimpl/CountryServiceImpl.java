package com.mc.giftcards.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.giftcards.models.country;
import com.mc.giftcards.repository.CountryRepository;
import com.mc.giftcards.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public country save(country country) {
		// TODO Auto-generated method stub
		return countryRepository.save(country);
	}

	@Override
	public List<country> findAll() {
		// TODO Auto-generated method stub
		return (List<country>) countryRepository.findAll();
	}

	@Override
	public country findOne(Long id) {
		// TODO Auto-generated method stub
		return countryRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		countryRepository.delete(id);
	}

}
