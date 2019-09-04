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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "cc_categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_catg_id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "cc_catg_name", nullable = false)
	private String name;

	@Column(name = "cc_cat_imagepath")
	private String imagePath;
	
	@Column(name = "cc_addType")
	private String adType;
	

	public String getAdType() {
		return adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	@Transient
	private MultipartFile image;

	@Column(name = "cc_createdby")
	private Long createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdDate;

	@Column(name = "is_active", columnDefinition = "boolean default false")
	private boolean active;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "category", cascade = CascadeType.ALL)
	private Set<SubCategory> subcategoryList;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cc_city_id")
	private Cities cc_city_id;

	@Lob
	private String photo;

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Cities getCc_city_id() {
		return cc_city_id;
	}

	public void setCc_city_id(Cities cc_city_id) {
		this.cc_city_id = cc_city_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<SubCategory> getSubcategoryList() {
		return subcategoryList;
	}

	public void setSubcategoryList(Set<SubCategory> subcategoryList) {
		this.subcategoryList = subcategoryList;
	}

}
