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
@Table(name = "cc_subcategory")
public class SubCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_subcat_id", nullable = false, updatable = false)
	private Long cc_subcat_id;

	@Column(name = "cc_subcat_name", nullable = false)
	private String cc_subcat_name;

	@Column(name = "cc_createdby")
	private String cc_createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_catg_isActive", columnDefinition = "boolean default false")
	private boolean cc_catg_isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_catg_id")
	private Categories cc_categories;

	public Long getCc_subcat_id() {
		return cc_subcat_id;
	}

	public void setCc_subcat_id(Long cc_subcat_id) {
		this.cc_subcat_id = cc_subcat_id;
	}

	public String getCc_subcat_name() {
		return cc_subcat_name;
	}

	public void setCc_subcat_name(String cc_subcat_name) {
		this.cc_subcat_name = cc_subcat_name;
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

	public boolean isCc_catg_isActive() {
		return cc_catg_isActive;
	}

	public void setCc_catg_isActive(boolean cc_catg_isActive) {
		this.cc_catg_isActive = cc_catg_isActive;
	}

	public Categories getCc_categories() {
		return cc_categories;
	}

	public void setCc_categories(Categories cc_categories) {
		this.cc_categories = cc_categories;
	}
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_subcategory", cascade = CascadeType.ALL)
	private Set<Coupons> cc_coupons;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_subcategory", cascade = CascadeType.ALL)
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
