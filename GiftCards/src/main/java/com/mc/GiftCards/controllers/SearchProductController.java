package com.mc.GiftCards.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchProductController {

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String addSubCategories(Model model) {
		return "searchproduct";
	}

}
