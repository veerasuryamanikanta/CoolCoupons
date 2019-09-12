package com.mc.giftcards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.giftcards.models.ads;
import com.mc.giftcards.models.category;
import com.mc.giftcards.models.city;
import com.mc.giftcards.models.subcategory;
import com.mc.giftcards.service.AdService;
import com.mc.giftcards.service.CityService;
import com.mc.giftcards.service.SubCategoryService;
import com.mc.giftcards.service.categoryService;

@Controller
public class MyHomeController {

	@Autowired
	private CityService cityService;

	@Autowired
	private categoryService categoryService;

	@Autowired
	private SubCategoryService subCategoryService;
	
	@Autowired
	private AdService adService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getMyHome(Model model) {
		List<city> cityList = cityService.findAll();
		List<category> categoryList = categoryService.findByCity(new Long(1));
		List<subcategory> subcategoryList = subCategoryService.findByCity(new Long(1));
		model.addAttribute("cityList", cityList);
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("subcategoryList", subcategoryList);
		return "myhome";
	}

	@RequestMapping(value = "/{cityid}", method = RequestMethod.GET)
	public String getCityWiseData(Model model, @PathVariable("cityid") Long cityid) {
		List<city> cityList = cityService.findAll();
		List<category> categoryList = categoryService.findByCity(cityid);
		List<subcategory> subcategoryList = subCategoryService.findByCity(cityid);
		model.addAttribute("cityList", cityList);
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("subcategoryList", subcategoryList);
		return "myhome";
	}

	@RequestMapping(value = "/categories/{cityid}/{categoryid}", method = RequestMethod.GET)
	public String getCityCategories(Model model,@PathVariable("categoryid") Long categoryid
			,@PathVariable("cityid") Long cityid) {	
	
		List<city> cityList = cityService.findAll();
		List<category> categoryList = categoryService.findByCity(new Long(1));
		List<subcategory> subcategoryList = subCategoryService.findByCategory(categoryid);
		
		model.addAttribute("cityList", cityList);
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("subcategoryList", subcategoryList);
		return "myhome";
	}
	
	
	@RequestMapping(value = "/ads/{subcategoryid}", method = RequestMethod.GET)
	public String getAds(Model model, @PathVariable("subcategoryid") Long subcategoryid) {
		List<city> cityList = cityService.findAll();
		List<ads> adsList = adService.findBySubCategory(subcategoryid);
		model.addAttribute("cityList", cityList);
		model.addAttribute("adsList", adsList);
		return "adshomepage";
	}
	
	@RequestMapping(value = "/addescription/{adid}", method = RequestMethod.GET)
	public String getAdDescription(Model model, @PathVariable("adid") Long adid) {
		List<city> cityList = cityService.findAll();
		ads ads = adService.findOne(adid);
		model.addAttribute("cityList", cityList);
		model.addAttribute("ads", ads);
		return "adsinnerpage";
	}
	
}
