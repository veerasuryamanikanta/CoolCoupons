package com.mc.giftcards.controllers;

import java.io.IOException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mc.giftcards.dto.categoryDto;
import com.mc.giftcards.models.category;
import com.mc.giftcards.service.categoryService;

@Controller
public class CategoryController {

	@Autowired
	private categoryService categoryService;

	@RequestMapping(value = "/addcategory", method = RequestMethod.GET)
	public String getCategoryNavigator(Model model) {
		categoryDto categorydto = new categoryDto();
		model.addAttribute("categorydto", categorydto);
		return "category";

	}

	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public String saveCategory(Model model, @ModelAttribute("categoryDTO") categoryDto categoryDTO) throws IOException {
		category category = new category();
		BeanUtils.copyProperties(categoryDTO, category);
		MultipartFile image_upload = categoryDTO.getImage();
		category.setImagepath(image_upload.getOriginalFilename());
		category.setPhoto(image_upload.getBytes().toString());
		categoryService.save(category);
		categoryDto categorydto = new categoryDto();
		model.addAttribute("categorydto", categorydto);
		return "category";

	}

}
