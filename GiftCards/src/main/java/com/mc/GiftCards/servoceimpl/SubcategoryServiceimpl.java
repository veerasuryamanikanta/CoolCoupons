package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.SubCategories;
import com.mc.GiftCards.repositories.SubCategoryrepository;
import com.mc.GiftCards.services.SubCategoryservice;


@Service
public class SubcategoryServiceimpl implements SubCategoryservice {

	@Autowired
	SubCategoryrepository subcategoryrepository;

	@Override
	public SubCategories save(SubCategories subcategories) {
		// TODO Auto-generated method stub
		return subcategoryrepository.save(subcategories);
	}

	@Override
	public List<SubCategories> findAll() {
		// TODO Auto-generated method stub
		return (List<SubCategories>) subcategoryrepository.findAll();
	}

	@Override
	public SubCategories findOne(Long id) {
		// TODO Auto-generated method stub
		return subcategoryrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		subcategoryrepository.delete(id);
	}

}
