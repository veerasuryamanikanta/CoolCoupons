package com.mc.GiftCards.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.GiftCards.dto.Countries;
import com.mc.GiftCards.dto.States;
import com.mc.GiftCards.services.CountriesServive;
import com.mc.GiftCards.services.StatesServive;

@Controller
public class StateController {

	@Autowired
	private CountriesServive countryservice;

	@Autowired
	private StatesServive statesService;

	@RequestMapping(value = "/addState", method = RequestMethod.GET)
	public String addBrand(Model model) {
		List<Countries> countriesList = countryservice.findAll();
		List<States> statesList = statesService.findAll();
		States states = new States();
		model.addAttribute("states", states);
		model.addAttribute("state", "state");
		model.addAttribute("stateslist", statesList);
		model.addAttribute("countriesList", countriesList);
		return "adminhome";
	}

	@RequestMapping(value = "/addState", method = RequestMethod.POST)
	public String saveBrand(Model model, @ModelAttribute("states") States states) {

		statesService.save(states);
		/*
		 * MultipartFile bookImage = brand.getBrandimage(); try { byte[] bytes =
		 * bookImage.getBytes(); String name = brand.getId() + "_" +
		 * bookImage.getOriginalFilename(); BufferedOutputStream stream = new
		 * BufferedOutputStream( new FileOutputStream(new
		 * File("src/main/resources/static/image/brands/" + name)));
		 * stream.write(bytes); stream.close(); model.addAttribute("brand", "brand"); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		return "redirect:stateList";
	}

	@RequestMapping(value = "/stateList", method = RequestMethod.GET)
	public String getBrands(Model model) {
		List<Countries> countriesList = countryservice.findAll();
		List<States> statesList = statesService.findAll();
		States states = new States();
		model.addAttribute("states", states);
		model.addAttribute("state", "state");
		model.addAttribute("stateslist", statesList);
		model.addAttribute("countriesList", countriesList);
		return "adminhome";
	}

}
