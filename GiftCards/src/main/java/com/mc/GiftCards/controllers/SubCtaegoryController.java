package com.mc.GiftCards.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mc.GiftCards.bean.SubCategoryDto;
import com.mc.GiftCards.dto.Category;
import com.mc.GiftCards.dto.SubCategory;
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
		SubCategory subCategoriess = new SubCategory();
		List<Category> categoriesList = categoryService.findAll();
		List<SubCategory> subcategoriesList = subcategoryservice.findAll();
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("subcategoriess", subCategoriess);
		model.addAttribute("subcategories", "subcategories");
		return "adminhome";
	}

	@RequestMapping(value = "/addsubcategory", method = RequestMethod.POST)
	public String saveSubCategories(Model model, @ModelAttribute("subcat") SubCategoryDto subcat) {

		SubCategory subcategory = new SubCategory();
		BeanUtils.copyProperties(subcat, subcategory);
		subcategory.setCategory(categoryService.findOne(subcat.getCategoryId()));

		MultipartFile image_upload = subcat.getImage();
		try {
			byte[] bytes = image_upload.getBytes();
			subcategory.setPhoto(bytes.toString());
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(
					"src/main/resources/static/products/subcategories/" + image_upload.getOriginalFilename())));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		subcategory.setImagePath(image_upload.getOriginalFilename());
		subcategoryservice.save(subcategory);
		List<Category> categoriesList = categoryService.findAll();
		List<SubCategory> subcategoriesList = subcategoryservice.findAll();
		SubCategory subCategoriess = new SubCategory();
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("subcategories", "subcategories");
		model.addAttribute("subcategoriess", subCategoriess);
		return "adminhome";
	}

}
