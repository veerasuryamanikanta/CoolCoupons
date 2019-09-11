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

import com.mc.giftcards.dto.stateDto;
import com.mc.giftcards.models.country;
import com.mc.giftcards.models.state;
import com.mc.giftcards.service.CountryService;
import com.mc.giftcards.service.StateService;

@Controller
public class StateController {
	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@RequestMapping(value = "/addstate", method = RequestMethod.GET)
	public String getStateNavigator(Model model) {
		stateDto statedto = new stateDto();
		List<country> countriesList = countryService.findAll();
		List<state> statesList = stateService.findAll();
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("statedto", statedto);
		return "state";

	}

	@RequestMapping(value = "/addstate", method = RequestMethod.POST)
	public String saveState(Model model, @ModelAttribute("stateDTO") stateDto stateDTO) {
		state state = new state();
		BeanUtils.copyProperties(stateDTO, state);
		state.setCc_country(countryService.findOne(stateDTO.getCountryid()));
		stateService.save(state);
		return "redirect:/addstate";

	}

	@RequestMapping(value = "/deleteState/{stateid}", method = RequestMethod.GET)
	public String deleteState(Model model, @PathVariable("stateid") Long stateid) {
		stateService.removeOne(stateid);
		return "redirect:/addstate";
	}

}
