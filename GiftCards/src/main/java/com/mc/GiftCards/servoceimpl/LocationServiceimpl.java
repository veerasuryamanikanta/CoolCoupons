package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Locations;
import com.mc.GiftCards.repositories.LocationRpository;
import com.mc.GiftCards.services.LocationServices;

@Service
public class LocationServiceimpl implements LocationServices {

	@Autowired
	LocationRpository locationRpository;

	@Override
	public Locations save(Locations locations) {
		// TODO Auto-generated method stub
		return locationRpository.save(locations);
	}

	@Override
	public List<Locations> findAll() {
		// TODO Auto-generated method stub
		return (List<Locations>) locationRpository.findAll();
	}

	@Override
	public Locations findOne(Long id) {
		// TODO Auto-generated method stub
		return locationRpository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		locationRpository.delete(id);
	}

}
