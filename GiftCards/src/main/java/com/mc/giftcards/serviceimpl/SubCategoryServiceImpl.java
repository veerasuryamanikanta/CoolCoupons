package com.mc.giftcards.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.giftcards.models.subcategory;
import com.mc.giftcards.repository.SubCategoryRepository;
import com.mc.giftcards.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	private SubCategoryRepository subcategoryrepository;

	@Override
	public subcategory save(subcategory subcategory) {
		// TODO Auto-generated method stub
		return subcategoryrepository.save(subcategory);
	}

	@Override
	public List<subcategory> findAll() {
		// TODO Auto-generated method stub
		return (List<subcategory>) subcategoryrepository.findAll();
	}

	@Override
	public subcategory findOne(Long id) {
		// TODO Auto-generated method stub
		return subcategoryrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		subcategoryrepository.delete(id);
	}

	@Override
	public List<subcategory> findByCity(Long cityid) {
		// TODO Auto-generated method stub
		return subcategoryrepository.findByCityId(cityid);
	}

}
