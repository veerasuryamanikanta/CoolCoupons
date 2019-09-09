package com.mc.giftcards.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginControlloer {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getRootController(Model model) {

		return "login";

	}

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String postLogin(@ModelAttribute("username") String username, @ModelAttribute("pass") String password,
			Model model) {
		if (username.equalsIgnoreCase("9133291177") || password.equalsIgnoreCase("9133291177")) {
			return "redirect:admin";
		} else {
			return "login";
		}

	}

}
