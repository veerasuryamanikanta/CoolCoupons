package com.mc.GiftCards.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.mc.GiftCards.bean.CategoryDto;
import com.mc.GiftCards.dto.Category;
import com.mc.GiftCards.services.CategoryServive;



@Controller
public class CategoryController {

	@Autowired
	private CategoryServive categoryService;

	@RequestMapping(value = "/addcategory", method = RequestMethod.GET)
	public String addCategories(Model model) {
		List<Category> categoriesList = categoryService.findAll();
		CategoryDto categoriesS = new CategoryDto();
		model.addAttribute("categoriesS", categoriesS);
		model.addAttribute("categories", "categories");
		model.addAttribute("categoriesList", categoriesList);
		return "adminhome";
	}
	
	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public String saveCategories(Model model, @ModelAttribute("cat") CategoryDto cat) {
		Category category = new Category();
		BeanUtils.copyProperties(cat, category);
		category.setCreatedDate(new Date());
		MultipartFile image_upload = cat.getImage();
		try {
			byte[] bytes = image_upload.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
					new File("src/main/resources/static/image/uploads/categories/" +
			image_upload.getOriginalFilename())));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		category.setImagePath(image_upload.getOriginalFilename());
		
		
		categoryService.save(category);
		List<Category> categoriesList = categoryService.findAll();
		CategoryDto categoriesS = new CategoryDto();
		model.addAttribute("categoriesS", categoriesS);
		model.addAttribute("categories", "categories");
		model.addAttribute("categoriesList", categoriesList);
		return "adminhome";
	}
	
}
