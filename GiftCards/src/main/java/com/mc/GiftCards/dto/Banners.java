package com.mc.GiftCards.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cc_banners")
public class Banners {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_banner_id", nullable = false, updatable = false)
	private Long cc_banner_id;

	@Column(name = "cc_banner_name", nullable = false)
	private String cc_banner_name;

	@Column(name = "cc_banner_imgpath")
	private String cc_banner_imgpath;

	@Column(name = "cc_banner_type")
	private String cc_banner_type;

	@Column(name = "cc_createdby")
	private String cc_createdby;

	public Long getCc_banner_id() {
		return cc_banner_id;
	}

	public void setCc_banner_id(Long cc_banner_id) {
		this.cc_banner_id = cc_banner_id;
	}

	public String getCc_banner_name() {
		return cc_banner_name;
	}

	public void setCc_banner_name(String cc_banner_name) {
		this.cc_banner_name = cc_banner_name;
	}

	public String getCc_banner_imgpath() {
		return cc_banner_imgpath;
	}

	public void setCc_banner_imgpath(String cc_banner_imgpath) {
		this.cc_banner_imgpath = cc_banner_imgpath;
	}

	public String getCc_banner_type() {
		return cc_banner_type;
	}

	public void setCc_banner_type(String cc_banner_type) {
		this.cc_banner_type = cc_banner_type;
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

	public boolean isCc_isActive() {
		return cc_isActive;
	}

	public void setCc_isActive(boolean cc_isActive) {
		this.cc_isActive = cc_isActive;
	}

	public SubCategory getCc_subcategory() {
		return cc_subcategory;
	}

	public void setCc_subcategory(SubCategory cc_subcategory) {
		this.cc_subcategory = cc_subcategory;
	}

	public Locations getCc_locations() {
		return cc_locations;
	}

	public void setCc_locations(Locations cc_locations) {
		this.cc_locations = cc_locations;
	}

	public Stores getCc_stores() {
		return cc_stores;
	}

	public void setCc_stores(Stores cc_stores) {
		this.cc_stores = cc_stores;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_isActive", columnDefinition = "boolean default false")
	private boolean cc_isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_subcat_id")
	private SubCategory cc_subcategory;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_loc_id")
	private Locations cc_locations;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_store_id")
	private Stores cc_stores;

}
