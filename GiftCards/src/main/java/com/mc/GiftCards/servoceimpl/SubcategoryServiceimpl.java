package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.SubCategory;
import com.mc.GiftCards.repositories.SubCategoryrepository;
import com.mc.GiftCards.services.SubCategoryservice;


@Service
public class SubcategoryServiceimpl implements SubCategoryservice {

	@Autowired
	SubCategoryrepository subcategoryrepository;

	@Override
	public SubCategory save(SubCategory subcategories) {
		// TODO Auto-generated method stub
		return subcategoryrepository.save(subcategories);
	}

	@Override
	public List<SubCategory> findAll() {
		// TODO Auto-generated method stub
		return (List<SubCategory>) subcategoryrepository.findAll();
	}

	@Override
	public SubCategory findOne(Long id) {
		// TODO Auto-generated method stub
		return subcategoryrepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		subcategoryrepository.delete(id);
	}

	@Override
	public List<SubCategory> findByCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return subcategoryrepository.findByCc_categoriesCc_catg_id(categoryId);
	}

}
