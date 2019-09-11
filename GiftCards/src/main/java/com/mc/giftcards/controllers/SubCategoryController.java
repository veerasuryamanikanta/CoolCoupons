package com.mc.giftcards.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mc.giftcards.dto.subCategoryDto;
import com.mc.giftcards.models.category;
import com.mc.giftcards.models.city;
import com.mc.giftcards.models.subcategory;
import com.mc.giftcards.service.CityService;
import com.mc.giftcards.service.SubCategoryService;
import com.mc.giftcards.service.categoryService;

@Controller
public class SubCategoryController {

	@Autowired
	private CityService cityService;

	@Autowired
	private categoryService categoryService;

	@Autowired
	private SubCategoryService subCategoryService;

	@RequestMapping(value = "/addsubcategory", method = RequestMethod.GET)
	public String getSubCategoryNavigator(Model model) {
		List<category> categoryList = categoryService.findAll();
		List<city> cityList = cityService.findAll();
		List<subcategory> subcategoryList = subCategoryService.findAll();
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("subcategoryList", subcategoryList);
		subCategoryDto subcategorydto = new subCategoryDto();
		model.addAttribute("subcategorydto", subcategorydto);
		return "subcategory";

	}

	@RequestMapping(value = "/addsubcategory", method = RequestMethod.POST)
	public String saveSubCategory(Model model, @ModelAttribute("subCategoryDTO") subCategoryDto subCategoryDTO)
			throws IOException {

		subcategory subcategory = new subcategory();
		BeanUtils.copyProperties(subCategoryDTO, subcategory);
		MultipartFile image_upload = subCategoryDTO.getImage();
		try {
			byte[] bytes = image_upload.getBytes();
			subcategory.setPhoto(bytes.toString());
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
					new File("src/main/resources/static/subcategories/" + image_upload.getOriginalFilename())));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		subcategory.setImagepath(image_upload.getOriginalFilename());
		subcategory.setPhoto(image_upload.getBytes().toString());
		subcategory.setCc_category(categoryService.findOne(subCategoryDTO.getCategoryid()));
		subcategory.setCc_city(cityService.findOne(subCategoryDTO.getCityid()));
		subCategoryService.save(subcategory);
		return "redirect:/addsubcategory";

	}
	
	@RequestMapping(value = "/deleteSubcategory/{subcategoryid}", method = RequestMethod.GET)
	public String deleteCountry(Model model, @PathVariable("subcategoryid") Long subcategoryid) {
		subCategoryService.removeOne(subcategoryid);
		return "redirect:/addsubcategory";
	}
	

}
