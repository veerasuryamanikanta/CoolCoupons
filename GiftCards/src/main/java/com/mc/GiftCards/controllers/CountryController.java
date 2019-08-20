package com.mc.GiftCards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.GiftCards.dto.Countries;
import com.mc.GiftCards.services.CountriesServive;

@Controller
public class CountryController {

	@Autowired
	private CountriesServive countriesServive;

	@RequestMapping(value = "/addCountry", method = RequestMethod.GET)
	public String addCategories(Model model) {
		List<Countries> countriesList = countriesServive.findAll();
		Countries countries = new Countries();
		model.addAttribute("countries", countries);
		model.addAttribute("country", "country");
		model.addAttribute("countriesList", countriesList);
		return "adminhome";
	}

	@RequestMapping(value = "/addCountry", method = RequestMethod.POST)
	public String saveCategories(Model model, @ModelAttribute("country") Countries country) {
		countriesServive.save(country);
		List<Countries> countriesList = countriesServive.findAll();
		Countries countries = new Countries();
		model.addAttribute("countries", countries);
		model.addAttribute("country", "country");
		model.addAttribute("countriesList", countriesList);
		return "adminhome";
	}

}
