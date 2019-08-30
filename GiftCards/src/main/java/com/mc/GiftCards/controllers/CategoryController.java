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

import com.mc.GiftCards.bean.CategoryDto;
import com.mc.GiftCards.dto.Category;
import com.mc.GiftCards.dto.Cities;
import com.mc.GiftCards.services.CategoryServive;
import com.mc.GiftCards.services.CitiesService;



@Controller
public class CategoryController {

	@Autowired
	private CategoryServive categoryService;
	
	@Autowired
	private CitiesService citiesService;
	

	@RequestMapping(value = "/addcategory", method = RequestMethod.GET)
	public String addCategories(Model model) {
		List<Category> categoriesList = categoryService.findAll();
		List<Cities> citiesList = citiesService.findAll();
		CategoryDto categoriesS = new CategoryDto();
		model.addAttribute("categoriesS", categoriesS);
		model.addAttribute("categories", "categories");
		model.addAttribute("citiesList", citiesList);
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
			category.setPhoto(bytes.toString());
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
					new File("src/main/resources/static/image/uploads/categories/" +
			image_upload.getOriginalFilename())));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		category.setImagePath(image_upload.getOriginalFilename());
		category.setCc_city_id(citiesService.findOne(cat.getCity_id()));
		//category.setCc_city_id(citiesService.findOne(category.getCategoryId());
		
		categoryService.save(category);
		List<Category> categoriesList = categoryService.findAll();
		List<Cities> citiesList = citiesService.findAll();
		CategoryDto categoriesS = new CategoryDto();
		model.addAttribute("categoriesS", categoriesS);
		model.addAttribute("categories", "categories");
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("categoriesList", categoriesList);
		return "adminhome";
	}
	
}
