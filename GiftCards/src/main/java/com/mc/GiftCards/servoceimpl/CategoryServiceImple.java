package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Categories;
import com.mc.GiftCards.repositories.CategoryRepository;
import com.mc.GiftCards.services.CategoryServive;


@Service
public class CategoryServiceImple implements CategoryServive {
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Categories save(Categories categories) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categories);
	}

	@Override
	public List<Categories> findAll() {
		// TODO Auto-generated method stub
		return (List<Categories>) categoryRepository.findAll();
	}

	@Override
	public Categories findOne(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.delete(id);
	}



	

	

}
