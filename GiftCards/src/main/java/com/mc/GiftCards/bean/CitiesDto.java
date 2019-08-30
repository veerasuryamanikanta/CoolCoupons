package com.mc.GiftCards.bean;

import java.util.Date;
import java.util.Set;

public class CitiesDto {

	private Long cc_city_id;

	private String cc_city_name;

	private String cc_city_createdby;

	private Date created_date;

	private boolean cc_city_isActive;

	public Long getCc_city_id() {
		return cc_city_id;
	}

	public void setCc_city_id(Long cc_city_id) {
		this.cc_city_id = cc_city_id;
	}

	public String getCc_city_name() {
		return cc_city_name;
	}

	public void setCc_city_name(String cc_city_name) {
		this.cc_city_name = cc_city_name;
	}

	public String getCc_city_createdby() {
		return cc_city_createdby;
	}

	public void setCc_city_createdby(String cc_city_createdby) {
		this.cc_city_createdby = cc_city_createdby;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public boolean isCc_city_isActive() {
		return cc_city_isActive;
	}

	public void setCc_city_isActive(boolean cc_city_isActive) {
		this.cc_city_isActive = cc_city_isActive;
	}

	public Set<Long> getCategoryIdList() {
		return categoryIdList;
	}

	public void setCategoryIdList(Set<Long> categoryIdList) {
		this.categoryIdList = categoryIdList;
	}

	private Set<Long> categoryIdList;

}
