package com.mc.GiftCards.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mc.GiftCards.dto.Category;
import com.mc.GiftCards.dto.Cities;
import com.mc.GiftCards.dto.Countries;
import com.mc.GiftCards.dto.Coupons;
import com.mc.GiftCards.dto.Locations;
import com.mc.GiftCards.dto.States;
import com.mc.GiftCards.dto.Stores;
import com.mc.GiftCards.dto.SubCategory;
import com.mc.GiftCards.services.CategoryServive;
import com.mc.GiftCards.services.CitiesService;
import com.mc.GiftCards.services.CountriesServive;
import com.mc.GiftCards.services.CouponsService;
import com.mc.GiftCards.services.LocationServices;
import com.mc.GiftCards.services.StatesServive;
import com.mc.GiftCards.services.StoreService;
import com.mc.GiftCards.services.SubCategoryservice;

@Controller
public class CouponsController {

	@Autowired
	private CountriesServive counryService;

	@Autowired
	private StatesServive stateService;

	@Autowired
	private CitiesService cityService;

	@Autowired
	private LocationServices locationServices;

	@Autowired
	private CategoryServive categoryService;

	@Autowired
	private SubCategoryservice subcategoryservice;

	@Autowired
	private StoreService storeservice;

	@Autowired
	private CouponsService couponsService;

	@RequestMapping(value = "/addcoupon", method = RequestMethod.GET)
	public String addSubCategories(Model model) {
		Coupons coupons = new Coupons();
		List<Category> categoriesList = categoryService.findAll();
		List<Stores> storesList = storeservice.findAll();
		List<Countries> countriesList = counryService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = cityService.findAll();
		List<Locations> locationsList = locationServices.findAll();
		List<SubCategory> subcategoriesList = subcategoryservice.findAll();
		List<Coupons> couponsList = couponsService.findAll();
		model.addAttribute("coupons", coupons);
		model.addAttribute("storesList", storesList);
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("locationsList", locationsList);
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("couponsList", couponsList);
		model.addAttribute("coupon", "coupon");
		return "adminhome";
	}

	@RequestMapping(value = "/addcoupon", method = RequestMethod.POST)
	public String saveSubCategories(Model model, @ModelAttribute("cpns") Coupons cpns) {
		MultipartFile image_upload = cpns.getCc_coupon_image();
		try {
			byte[] bytes = image_upload.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
					new File("src/main/resources/static/image/uploads/coupons/" + image_upload.getOriginalFilename())));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		cpns.setCc_coupon_imagepath(image_upload.getOriginalFilename());
		couponsService.save(cpns);
		Coupons coupons = new Coupons();
		List<Category> categoriesList = categoryService.findAll();
		List<Stores> storesList = storeservice.findAll();
		List<Countries> countriesList = counryService.findAll();
		List<States> statesList = stateService.findAll();
		List<Cities> citiesList = cityService.findAll();
		List<Locations> locationsList = locationServices.findAll();
		List<SubCategory> subcategoriesList = subcategoryservice.findAll();
		List<Coupons> couponsList = couponsService.findAll();
		model.addAttribute("coupons", coupons);
		model.addAttribute("storesList", storesList);
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("statesList", statesList);
		model.addAttribute("citiesList", citiesList);
		model.addAttribute("locationsList", locationsList);
		model.addAttribute("categoriesList", categoriesList);
		model.addAttribute("subcategoriesList", subcategoriesList);
		model.addAttribute("couponsList", couponsList);
		model.addAttribute("coupon", "coupon");
		return "adminhome";
	}

}
