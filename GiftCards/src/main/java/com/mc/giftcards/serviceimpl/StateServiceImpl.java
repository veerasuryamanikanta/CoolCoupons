package com.mc.giftcards.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.giftcards.models.state;
import com.mc.giftcards.repository.StateRepository;
import com.mc.giftcards.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository staterepository;

	@Override
	public state save(state state) {
		// TODO Auto-generated method stub
		return staterepository.save(state);
	}

	@Override
	public List<state> findAll() {
		// TODO Auto-generated method stub
		return (List<state>) staterepository.findAll();
	}

	@Override
	public state findOne(Long id) {
		// TODO Auto-generated method stub
		return staterepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		staterepository.delete(id);
	}

	

}
