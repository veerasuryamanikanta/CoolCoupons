package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Stores;
import com.mc.GiftCards.repositories.StoreRepository;
import com.mc.GiftCards.services.StoreService;


@Service
public class StoreServiceimpl implements StoreService {

	@Autowired
	StoreRepository storeRepository;

	@Override
	public Stores save(Stores stores) {
		// TODO Auto-generated method stub
		return storeRepository.save(stores);
	}

	@Override
	public List<Stores> findAll() {
		// TODO Auto-generated method stub
		return (List<Stores>) storeRepository.findAll();
	}

	@Override
	public Stores findOne(Long id) {
		// TODO Auto-generated method stub
		return storeRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		storeRepository.delete(id);
	}

}
