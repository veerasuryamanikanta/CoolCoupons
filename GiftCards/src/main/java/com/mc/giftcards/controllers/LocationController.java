package com.mc.giftcards.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mc.giftcards.dto.locationDto;
import com.mc.giftcards.models.city;
import com.mc.giftcards.models.country;
import com.mc.giftcards.models.location;
import com.mc.giftcards.models.state;
import com.mc.giftcards.service.CityService;
import com.mc.giftcards.service.CountryService;
import com.mc.giftcards.service.LocationService;
import com.mc.giftcards.service.StateService;

@Controller
public class LocationController {

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@Autowired
	private CityService cityService;

	@Autowired
	private LocationService locationService;

	@RequestMapping(value = "/addlocation", method = RequestMethod.GET)
	public String getLocationNavigator(Model model) {
		List<country> countriesList = countryService.findAll();
		List<state> statesList = stateService.findAll();
		List<city> cityList = cityService.findAll();
		List<location> locationList = locationService.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("cityList", cityList);
		model.addAttribute("locationList", locationList);
		locationDto locationdto = new locationDto();
		model.addAttribute("locationdto", locationdto);
		return "location";

	}

	@RequestMapping(value = "/addlocation", method = RequestMethod.POST)
	public String saveLocation(Model model, @ModelAttribute("locationDTO") locationDto locationDTO) {
		location location = new location();
		BeanUtils.copyProperties(locationDTO, location);
		location.setCc_city(cityService.findOne(locationDTO.getCityid()));
		locationService.save(location);
		return "redirect:/addlocation";

	}

	@RequestMapping(value = "/deleteLocation/{locationid}", method = RequestMethod.GET)
	public String deleteLocation(Model model, @PathVariable("locationid") Long locationid) {
		locationService.removeOne(locationid);
		return "redirect:/addlocation";
	}

}
