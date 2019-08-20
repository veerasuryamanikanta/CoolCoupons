package com.mc.GiftCards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.GiftCards.dto.Categories;
import com.mc.GiftCards.services.CategoryServive;



@Controller
public class CategoryController {

	@Autowired
	private CategoryServive categoryService;

	@RequestMapping(value = "/addcategory", method = RequestMethod.GET)
	public String addCategories(Model model) {
		List<Categories> categoriesList = categoryService.findAll();
		Categories categoriesS = new Categories();
		model.addAttribute("categoriesS", categoriesS);
		model.addAttribute("categories", "categories");
		model.addAttribute("categoriesList", categoriesList);
		return "adminhome";
	}
	
	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public String saveCategories(Model model, @ModelAttribute("cat") Categories cat) {
		categoryService.save(cat);
		List<Categories> categoriesList = categoryService.findAll();
		Categories categoriesS = new Categories();
		model.addAttribute("categoriesS", categoriesS);
		model.addAttribute("categories", "categories");
		model.addAttribute("categoriesList", categoriesList);
		return "adminhome";
	}
	
}
