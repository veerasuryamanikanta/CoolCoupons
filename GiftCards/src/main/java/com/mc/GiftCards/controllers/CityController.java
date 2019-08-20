package com.mc.GiftCards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.GiftCards.dto.Cities;
import com.mc.GiftCards.dto.Countries;
import com.mc.GiftCards.dto.States;
import com.mc.GiftCards.services.CitiesService;
import com.mc.GiftCards.services.CountriesServive;
import com.mc.GiftCards.services.StatesServive;

@Controller
public class CityController {

	@Autowired
	private CountriesServive countriesService;

	@Autowired
	private StatesServive stateService;

	@Autowired
	private CitiesService citiesService;

	@RequestMapping(value = "/addCity", method = RequestMethod.GET)
	public String addSubCategories(Model model) {
		Cities cities = new Cities();
		List<Countries> countriesList = countriesService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = citiesService.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("cities", cities);
		model.addAttribute("city", "city");
		return "adminhome";
	}

	@RequestMapping(value = "/addCity", method = RequestMethod.POST)
	public String saveSubCategories(Model model, @ModelAttribute("city") Cities city) {
		citiesService.save(city);
		Cities cities = new Cities();
		List<Countries> countriesList = countriesService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = citiesService.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("cities", cities);
		model.addAttribute("city", "city");
		return "adminhome";
	}

}
