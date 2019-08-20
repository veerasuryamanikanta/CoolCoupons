package com.mc.GiftCards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.GiftCards.dto.Categories;
import com.mc.GiftCards.dto.Cities;
import com.mc.GiftCards.dto.Countries;
import com.mc.GiftCards.dto.Locations;
import com.mc.GiftCards.dto.States;
import com.mc.GiftCards.dto.Stores;
import com.mc.GiftCards.dto.SubCategories;
import com.mc.GiftCards.services.CategoryServive;
import com.mc.GiftCards.services.CitiesService;
import com.mc.GiftCards.services.CountriesServive;
import com.mc.GiftCards.services.LocationServices;
import com.mc.GiftCards.services.StatesServive;
import com.mc.GiftCards.services.StoreService;
import com.mc.GiftCards.services.SubCategoryservice;

@Controller
public class StoreController {

	@Autowired
	private CountriesServive counryService;

	@Autowired
	private StatesServive stateService;

	@Autowired
	private CitiesService cityService;

	@Autowired
	private LocationServices locationServices;

	@Autowired
	private CategoryServive categoryService;

	@Autowired
	private SubCategoryservice subcategoryservice;

	@Autowired
	private StoreService storeservice;

	@RequestMapping(value = "/addstore", method = RequestMethod.GET)
	public String addSubCategories(Model model) {
		Stores stores = new Stores();
		List<Categories> categoriesList = categoryService.findAll();
		List<Stores> storesList = storeservice.findAll();
		List<Countries> countriesList = counryService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = cityService.findAll();
		List<Locations> locationsList = locationServices.findAll();
		List<SubCategories> subcategoriesList = subcategoryservice.findAll();
		model.addAttribute("stores", stores);
		model.addAttribute("storesList", storesList);
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("locationsList", locationsList);
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("store", "store");
		return "adminhome";
	}

	@RequestMapping(value = "/addstore", method = RequestMethod.POST)
	public String saveSubCategories(Model model, @ModelAttribute("strs") Stores strs) {
		storeservice.save(strs);
		Stores stores = new Stores();
		List<Categories> categoriesList = categoryService.findAll();
		List<Stores> storesList = storeservice.findAll();
		List<Countries> countriesList = counryService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = cityService.findAll();
		List<Locations> locationsList = locationServices.findAll();
		List<SubCategories> subcategoriesList = subcategoryservice.findAll();
		model.addAttribute("stores", stores);
		model.addAttribute("storesList", storesList);
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("locationsList", locationsList);
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("store", "store");
		return "adminhome";
	}

}
