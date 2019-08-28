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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "cc_categories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_catg_id", nullable = false, updatable = false)
	private Long cc_catg_id;

	@Column(name = "cc_catg_name", nullable = false)
	private String cc_catg_name;
	
	@Column(name = "cc_cat_imagepath")
	private String cc_cat_imagepath;
	
	@Transient
	private MultipartFile cc_cat_image;

	public String getCc_cat_imagepath() {
		return cc_cat_imagepath;
	}

	public void setCc_cat_imagepath(String cc_cat_imagepath) {
		this.cc_cat_imagepath = cc_cat_imagepath;
	}

	public MultipartFile getCc_cat_image() {
		return cc_cat_image;
	}

	public void setCc_cat_image(MultipartFile cc_cat_image) {
		this.cc_cat_image = cc_cat_image;
	}

	@Column(name = "cc_createdby")
	private String cc_createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_catg_isActive", columnDefinition = "boolean default false")
	private boolean cc_catg_isActive;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_categories", cascade = CascadeType.ALL)
	private Set<SubCategories> cc_subcategory;

	public Long getCc_catg_id() {
		return cc_catg_id;
	}

	public void setCc_catg_id(Long cc_catg_id) {
		this.cc_catg_id = cc_catg_id;
	}

	public String getCc_catg_name() {
		return cc_catg_name;
	}

	public void setCc_catg_name(String cc_catg_name) {
		this.cc_catg_name = cc_catg_name;
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

	public Set<SubCategories> getCc_subcategory() {
		return cc_subcategory;
	}

	public void setCc_subcategory(Set<SubCategories> cc_subcategory) {
		this.cc_subcategory = cc_subcategory;
	}

}
