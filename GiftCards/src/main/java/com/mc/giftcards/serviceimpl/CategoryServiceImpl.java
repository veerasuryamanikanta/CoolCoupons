package com.mc.giftcards.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.giftcards.models.category;
import com.mc.giftcards.repository.CategoryRepository;
import com.mc.giftcards.service.categoryService;

@Service
public class CategoryServiceImpl implements categoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public category save(category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public List<category> findAll() {
		// TODO Auto-generated method stub
		return (List<category>) categoryRepository.findAll();
	}

	@Override
	public category findOne(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.delete(id);
	}

}
