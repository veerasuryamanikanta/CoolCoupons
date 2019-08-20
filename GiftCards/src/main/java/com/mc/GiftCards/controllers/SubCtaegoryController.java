package com.mc.GiftCards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.GiftCards.dto.Categories;
import com.mc.GiftCards.dto.SubCategories;
import com.mc.GiftCards.services.CategoryServive;
import com.mc.GiftCards.services.SubCategoryservice;


@Controller
public class SubCtaegoryController {

	@Autowired
	private CategoryServive categoryService;

	@Autowired
	private SubCategoryservice subcategoryservice;

	@RequestMapping(value = "/addsubcategory", method = RequestMethod.GET)
	public String addSubCategories(Model model) {
		SubCategories subCategoriess = new SubCategories();
		List<Categories> categoriesList = categoryService.findAll();
		List<SubCategories> subcategoriesList = subcategoryservice.findAll();
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("subcategoriess", subCategoriess);
		model.addAttribute("subcategories", "subcategories");
		return "adminhome";
	}

	@RequestMapping(value = "/addsubcategory", method = RequestMethod.POST)
	public String saveSubCategories(Model model, @ModelAttribute("subcat") SubCategories subcat) {
		subcategoryservice.save(subcat);
		List<Categories> categoriesList = categoryService.findAll();
		List<SubCategories> subcategoriesList = subcategoryservice.findAll();
		SubCategories subCategoriess = new SubCategories();
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("subcategories", "subcategories");
		model.addAttribute("subcategoriess", subCategoriess);
		return "adminhome";
	}

}
