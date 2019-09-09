package com.mc.giftcards.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.giftcards.dto.cityDto;
import com.mc.giftcards.models.city;
import com.mc.giftcards.models.country;
import com.mc.giftcards.models.state;
import com.mc.giftcards.service.CityService;
import com.mc.giftcards.service.CountryService;
import com.mc.giftcards.service.StateService;

@Controller
public class CityController {

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/addcity", method = RequestMethod.GET)
	public String getCityNavigator(Model model) {
		List<country> countriesList = countryService.findAll();
		List<state> statesList = stateService.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		cityDto cityDto = new cityDto();
		model.addAttribute("cityDto", cityDto);
		return "city";
	}

	@RequestMapping(value = "/addcity", method = RequestMethod.POST)
	public String saveCity(Model model, @ModelAttribute("cityDTO") cityDto cityDTO) {
		city city = new city();
		BeanUtils.copyProperties(cityDTO, city);
		city.setCc_state(stateService.findOne(cityDTO.getStateid()));
		cityService.save(city);
		List<country> countriesList = countryService.findAll();
		List<state> statesList = stateService.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		cityDto cityDto = new cityDto();
		model.addAttribute("cityDto", cityDto);
		return "city";

	}

}
