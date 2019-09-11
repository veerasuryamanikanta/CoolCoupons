package com.mc.giftcards.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mc.giftcards.dto.adsDto;
import com.mc.giftcards.models.ads;
import com.mc.giftcards.models.category;
import com.mc.giftcards.models.city;
import com.mc.giftcards.models.subcategory;
import com.mc.giftcards.service.AdService;
import com.mc.giftcards.service.CityService;
import com.mc.giftcards.service.SubCategoryService;
import com.mc.giftcards.service.categoryService;

@Controller
public class AdsController {

	@Autowired
	private CityService cityService;

	@Autowired
	private categoryService categoryService;

	@Autowired
	private SubCategoryService subCategoryService;

	@Autowired
	private AdService adService;

	@RequestMapping(value = "/newad", method = RequestMethod.GET)
	public String getAdNavigator(Model model) {
		List<city> cityList = cityService.findAll();
		List<category> categoryList = categoryService.findAll();
		List<subcategory> subcategoryList = subCategoryService.findAll();
		List<ads> adsList = adService.findAll();
		model.addAttribute("cityList", cityList);
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("subcategoryList", subcategoryList);
		model.addAttribute("adsList", adsList);
		adsDto adsdto = new adsDto();
		model.addAttribute("adsdto", adsdto);
		return "ads";
	}

	@RequestMapping(value = "/newad", method = RequestMethod.POST)
	public String saveAd(Model model, @ModelAttribute("adsDTO") adsDto adsDTO) throws IOException {
		ads ads = new ads();
		BeanUtils.copyProperties(adsDTO, ads);
		MultipartFile image_upload = adsDTO.getImage();
		try {
			byte[] bytes = image_upload.getBytes();
			ads.setPhoto(bytes.toString());
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
					new File("src/main/resources/static/myads/" + image_upload.getOriginalFilename())));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ads.setImagepath(image_upload.getOriginalFilename());
		ads.setPhoto(image_upload.getBytes().toString());
		ads.setCc_category(categoryService.findOne(adsDTO.getCategoryid()));
		ads.setCc_subcategory(subCategoryService.findOne(adsDTO.getSubcategoryid()));
		ads.setCc_city(cityService.findOne(adsDTO.getCityid()));
		adService.save(ads);
		return "redirect:/newad";
	}

}
