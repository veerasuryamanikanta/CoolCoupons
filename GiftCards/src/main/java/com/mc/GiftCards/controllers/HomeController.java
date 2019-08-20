package com.mc.GiftCards.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getRootPage() {
		// System.out.println("root--------");
		return "homepage";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAdmin(Model model) {
		model.addAttribute("loginasAdmin", "loginasAdmin");
		return "admin";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public String checkAdmin(@ModelAttribute("username") String username, @ModelAttribute("password") String password,
			Model model) {

		if (username.equalsIgnoreCase("admin") || password.equalsIgnoreCase("admin")) {
			return "adminhome";
		} else {
			model.addAttribute("loginasAdmin", "loginasAdmin");
			model.addAttribute("error", "error");
			return "admin";
		}

	}

}
