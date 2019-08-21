package com.mc.GiftCards.dto;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cc_locations")
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_loc_id", nullable = false, updatable = false)
	private Long cc_loc_id;

	@Column(name = "cc_loc_name", nullable = false)
	private String cc_loc_name;
	
	@Column(name = "cc_city_createdby")
	private String cc_city_createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_city_isActive", columnDefinition = "boolean default false")
	private boolean cc_city_isActive;

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_city_id")
	private States cc_cities;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_locations", cascade = CascadeType.ALL)
	private Set<Stores> cc_stores;

	public Long getCc_loc_id() {
		return cc_loc_id;
	}

	public void setCc_loc_id(Long cc_loc_id) {
		this.cc_loc_id = cc_loc_id;
	}

	public String getCc_loc_name() {
		return cc_loc_name;
	}

	public void setCc_loc_name(String cc_loc_name) {
		this.cc_loc_name = cc_loc_name;
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

	public States getCc_cities() {
		return cc_cities;
	}

	public void setCc_cities(States cc_cities) {
		this.cc_cities = cc_cities;
	}

	public Set<Stores> getCc_stores() {
		return cc_stores;
	}

	public void setCc_stores(Set<Stores> cc_stores) {
		this.cc_stores = cc_stores;
	}
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_locations", cascade = CascadeType.ALL)
	private Set<Coupons> cc_coupons;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_locations", cascade = CascadeType.ALL)
	private Set<Banners> cc_banners;

	public Set<Coupons> getCc_coupons() {
		return cc_coupons;
	}

	public void setCc_coupons(Set<Coupons> cc_coupons) {
		this.cc_coupons = cc_coupons;
	}

	public Set<Banners> getCc_banners() {
		return cc_banners;
	}

	public void setCc_banners(Set<Banners> cc_banners) {
		this.cc_banners = cc_banners;
	}
	
	


}
