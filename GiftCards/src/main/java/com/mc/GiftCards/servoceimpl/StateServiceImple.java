package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.States;
import com.mc.GiftCards.repositories.StatesRepository;
import com.mc.GiftCards.services.StatesServive;


@Service
public class StateServiceImple implements StatesServive {
	
	
	@Autowired
	private StatesRepository brandrepository;

	@Override
	public States save(States brand) {
		// TODO Auto-generated method stub
		return brandrepository.save(brand);
	}

	@Override
	public List<States> findAll() {
		// TODO Auto-generated method stub
		return (List<States>) brandrepository.findAll();
	}

	@Override
	public States findOne(Long id) {
		// TODO Auto-generated method stub
		return brandrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		brandrepository.delete(id);
	}

	

	

}
