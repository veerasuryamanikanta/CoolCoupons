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
import com.mc.GiftCards.dto.Locations;
import com.mc.GiftCards.dto.States;
import com.mc.GiftCards.services.CitiesService;
import com.mc.GiftCards.services.CountriesServive;
import com.mc.GiftCards.services.LocationServices;
import com.mc.GiftCards.services.StatesServive;

@Controller
public class LocationController {

	@Autowired
	private CountriesServive countriesService;

	@Autowired
	private StatesServive stateService;

	@Autowired
	private CitiesService citiesService;

	@Autowired
	private LocationServices locationServices;

	@RequestMapping(value = "/addLocation", method = RequestMethod.GET)
	public String addSubCategories(Model model) {
		Locations locations = new Locations();
		Cities cities = new Cities();
		List<Countries> countriesList = countriesService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = citiesService.findAll();
		List<Locations> locationList = locationServices.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("cities", cities);
		model.addAttribute("location", "location");
		model.addAttribute("locations", locations);
		model.addAttribute("locationslist", locationList);
		return "adminhome";
	}

	@RequestMapping(value = "/addLocation", method = RequestMethod.POST)
	public String saveSubCategories(Model model, @ModelAttribute("location") Locations location) {
	    locationServices.save(location);
		Locations locations = new Locations();
		Cities cities = new Cities();
		List<Countries> countriesList = countriesService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = citiesService.findAll();
		List<Locations> locationList = locationServices.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("cities", cities);
		model.addAttribute("location", "location");
		model.addAttribute("locations", locations);
		model.addAttribute("locationslist", locationList);
		return "adminhome";
	}

}
