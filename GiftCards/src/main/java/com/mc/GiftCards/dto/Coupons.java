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
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "cc_coupons")
public class Coupons {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_coupon_id", nullable = false, updatable = false)
	private Long cc_coupon_id;

	@Column(name = "cc_coupon_name", nullable = false)
	private String coupon;


	@Column(name = "cc_coupon_type")
	private String cc_coupon_type;
	
	@Column(name = "cc_coupon_imagepath")
	private String cc_coupon_imagepath;

	

	public String getCc_coupon_imagepath() {
		return cc_coupon_imagepath;
	}

	public void setCc_coupon_imagepath(String cc_coupon_imagepath) {
		this.cc_coupon_imagepath = cc_coupon_imagepath;
	}

	@Column(name = "cc_createdby")
	private String cc_createdby;

	public Long getCc_coupon_id() {
		return cc_coupon_id;
	}

	public void setCc_coupon_id(Long cc_coupon_id) {
		this.cc_coupon_id = cc_coupon_id;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	@Transient
	private MultipartFile cc_coupon_image;

	public MultipartFile getCc_coupon_image() {
		return cc_coupon_image;
	}

	public void setCc_coupon_image(MultipartFile cc_coupon_image) {
		this.cc_coupon_image = cc_coupon_image;
	}

	public String getCc_coupon_type() {
		return cc_coupon_type;
	}

	public void setCc_coupon_type(String cc_coupon_type) {
		this.cc_coupon_type = cc_coupon_type;
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

	public boolean isCc_coupon_isActive() {
		return cc_coupon_isActive;
	}

	public void setCc_coupon_isActive(boolean cc_coupon_isActive) {
		this.cc_coupon_isActive = cc_coupon_isActive;
	}

	public SubCategories getCc_subcategory() {
		return cc_subcategory;
	}

	public void setCc_subcategory(SubCategories cc_subcategory) {
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

	@Column(name = "cc_coupon_isActive", columnDefinition = "boolean default false")
	private boolean cc_coupon_isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_subcat_id")
	private SubCategories cc_subcategory;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_loc_id")
	private Locations cc_locations;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_store_id")
	private Stores cc_stores;

}
