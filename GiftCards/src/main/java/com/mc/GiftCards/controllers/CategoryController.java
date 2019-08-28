package com.mc.GiftCards.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

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
		
		MultipartFile image_upload = cat.getCc_cat_image();
		try {
			byte[] bytes = image_upload.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
					new File("src/main/resources/static/image/uploads/categories/" + image_upload.getOriginalFilename())));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		cat.setCc_cat_imagepath(image_upload.getOriginalFilename());
		
		
		categoryService.save(cat);
		List<Categories> categoriesList = categoryService.findAll();
		Categories categoriesS = new Categories();
		model.addAttribute("categoriesS", categoriesS);
		model.addAttribute("categories", "categories");
		model.addAttribute("categoriesList", categoriesList);
		return "adminhome";
	}
	
}
