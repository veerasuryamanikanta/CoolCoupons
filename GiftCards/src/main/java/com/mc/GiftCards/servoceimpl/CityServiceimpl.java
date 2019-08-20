package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Cities;
import com.mc.GiftCards.repositories.Citiesrepository;
import com.mc.GiftCards.services.CitiesService;

@Service
public class CityServiceimpl implements CitiesService {

	@Autowired
	Citiesrepository subcategoryrepository;

	@Override
	public Cities save(Cities subcategories) {
		// TODO Auto-generated method stub
		return subcategoryrepository.save(subcategories);
	}

	@Override
	public List<Cities> findAll() {
		// TODO Auto-generated method stub
		return (List<Cities>) subcategoryrepository.findAll();
	}

	@Override
	public Cities findOne(Long id) {
		// TODO Auto-generated method stub
		return subcategoryrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		subcategoryrepository.delete(id);
	}

}
