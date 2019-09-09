package com.mc.giftcards.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.giftcards.models.location;
import com.mc.giftcards.repository.LocationRepository;
import com.mc.giftcards.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationrepository;

	@Override
	public location save(location location) {
		// TODO Auto-generated method stub
		return locationrepository.save(location);
	}

	@Override
	public List<location> findAll() {
		// TODO Auto-generated method stub
		return (List<location>) locationrepository.findAll();
	}

	@Override
	public location findOne(Long id) {
		// TODO Auto-generated method stub
		return locationrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		locationrepository.delete(id);
	}

}
