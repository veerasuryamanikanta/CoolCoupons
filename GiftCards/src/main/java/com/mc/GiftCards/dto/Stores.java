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
@Table(name = "cc_stores")
public class Stores {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_store_id", nullable = false, updatable = false)
	private Long cc_store_id;

	@Column(name = "cc_store_name", nullable = false)
	private String cc_store_name;

	@Column(name = "cc_store_imgpath")
	private String cc_store_imgpath;

	public Long getCc_store_id() {
		return cc_store_id;
	}

	public void setCc_store_id(Long cc_store_id) {
		this.cc_store_id = cc_store_id;
	}

	public String getCc_store_name() {
		return cc_store_name;
	}

	public void setCc_store_name(String cc_store_name) {
		this.cc_store_name = cc_store_name;
	}

	public String getCc_store_imgpath() {
		return cc_store_imgpath;
	}

	public void setCc_store_imgpath(String cc_store_imgpath) {
		this.cc_store_imgpath = cc_store_imgpath;
	}

	public String getCc_createdby() {
		return cc_createdby;
	}

	public void setCc_createdby(String cc_createdby) {
		this.cc_createdby = cc_createdby;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public boolean isCc_store_isActive() {
		return cc_store_isActive;
	}

	public void setCc_store_isActive(boolean cc_store_isActive) {
		this.cc_store_isActive = cc_store_isActive;
	}

	public Locations getCc_locations() {
		return cc_locations;
	}

	public void setCc_locations(Locations cc_locations) {
		this.cc_locations = cc_locations;
	}

	@Column(name = "cc_createdby")
	private String cc_createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_store_isActive", columnDefinition = "boolean default false")
	private boolean cc_store_isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_loc_id")
	private Locations cc_locations;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_stores", cascade = CascadeType.ALL)
	private Set<Coupons> cc_coupons;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_stores", cascade = CascadeType.ALL)
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
