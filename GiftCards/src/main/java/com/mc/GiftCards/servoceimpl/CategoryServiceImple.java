package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Category;
import com.mc.GiftCards.repositories.CategoryRepository;
import com.mc.GiftCards.services.CategoryServive;


@Service
public class CategoryServiceImple implements CategoryServive {
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category save(Category categories) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categories);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category findOne(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.delete(id);
	}

	@Override
	public List<Category> findByCategory(Long cityId) {
		// TODO Auto-generated method stub
		return categoryRepository.findByCc_categoriesCc_city_id(cityId);
	}



	

	

}
