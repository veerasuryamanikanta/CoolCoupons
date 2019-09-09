package com.mc.giftcards.controllers;

import java.io.IOException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mc.giftcards.dto.countryDto;
import com.mc.giftcards.models.country;
import com.mc.giftcards.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;

	@RequestMapping(value = "/addcountry", method = RequestMethod.GET)
	public String navigateCountry(Model model) {
		countryDto countrydto = new countryDto();
		model.addAttribute("countrydto", countrydto);
		return "country";
	}

	@RequestMapping(value = "/addcountry", method = RequestMethod.POST)
	public String saveCountry(Model model, @ModelAttribute("cntryDto") countryDto cntryDto) throws IOException {
		country country = new country();
		MultipartFile image_upload = cntryDto.getImage();
		country.setImagepath(image_upload.getOriginalFilename());
		country.setPhoto(image_upload.getBytes().toString());
		BeanUtils.copyProperties(cntryDto, country);
		countryService.save(country);
		countryDto countrydto = new countryDto();
		model.addAttribute("countrydto", countrydto);
		return "country";

	}

}
