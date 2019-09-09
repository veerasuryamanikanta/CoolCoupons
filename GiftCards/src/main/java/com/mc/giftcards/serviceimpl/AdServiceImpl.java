package com.mc.giftcards.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.giftcards.models.ads;
import com.mc.giftcards.repository.AdRepository;
import com.mc.giftcards.service.AdService;

@Service
public class AdServiceImpl implements AdService {

	@Autowired
	private AdRepository adrepository;

	@Override
	public ads save(ads ads) {
		// TODO Auto-generated method stub
		return adrepository.save(ads);
	}

	@Override
	public List<ads> findAll() {
		// TODO Auto-generated method stub
		return (List<ads>) adrepository.findAll();
	}

	@Override
	public ads findOne(Long id) {
		// TODO Auto-generated method stub
		return adrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		adrepository.delete(id);
	}

	@Override
	public List<ads> findByCity(Long subacategoryid) {
		// TODO Auto-generated method stub
		return adrepository.findBySubCategoryId(subacategoryid);
	}

}
