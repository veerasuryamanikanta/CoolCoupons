package com.mc.GiftCards.servoceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.GiftCards.dto.Banners;
import com.mc.GiftCards.repositories.BannerRepository;
import com.mc.GiftCards.services.BannerService;

@Service
public class BannerServiceimpl implements BannerService {

	@Autowired
	BannerRepository bannerRepository;

	@Override
	public Banners save(Banners banners) {
		// TODO Auto-generated method stub
		return bannerRepository.save(banners);
	}

	@Override
	public List<Banners> findAll() {
		// TODO Auto-generated method stub
		return (List<Banners>) bannerRepository.findAll();
	}

	@Override
	public Banners findOne(Long id) {
		// TODO Auto-generated method stub
		return bannerRepository.findOne(id);
	}

	@Override
	public void removeOne(Long id) {
		// TODO Auto-generated method stub
		bannerRepository.delete(id);
	}

}
