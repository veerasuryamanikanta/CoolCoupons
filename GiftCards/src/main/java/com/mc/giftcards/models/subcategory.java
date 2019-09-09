package com.mc.giftcards.models;

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
@Table(name = "cc_subcategory")
public class subcategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subcategoryid", nullable = false, updatable = false)
	private Long subcategoryid;

	@Column(name = "subcategoryname", nullable = false)
	private String subcategoryname;

	@Column(name = "imagepath")
	private String imagepath;

	@Transient
	private MultipartFile image;

	@Lob
	@Column(name = "photo")
	private String photo;

	@Column(name = "createdby")
	private String createdby;

	@Column(name = "modifiedby")
	private String modifiedby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedate", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date modifiedate;

	@Column(name = "isactive", columnDefinition = "boolean default false")
	private boolean isactive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cityid")
	private city cc_city;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryid")
	private category cc_category;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_subcategory", cascade = CascadeType.ALL)
	private Set<ads> cc_ads;

	public Long getSubcategoryid() {
		return subcategoryid;
	}

	public void setSubcategoryid(Long subcategoryid) {
		this.subcategoryid = subcategoryid;
	}

	public String getSubcategoryname() {
		return subcategoryname;
	}

	public void setSubcategoryname(String subcategoryname) {
		this.subcategoryname = subcategoryname;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getModifiedate() {
		return modifiedate;
	}

	public void setModifiedate(Date modifiedate) {
		this.modifiedate = modifiedate;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public city getCc_city() {
		return cc_city;
	}

	public void setCc_city(city cc_city) {
		this.cc_city = cc_city;
	}

	public category getCc_category() {
		return cc_category;
	}

	public void setCc_category(category cc_category) {
		this.cc_category = cc_category;
	}

	public Set<ads> getCc_ads() {
		return cc_ads;
	}

	public void setCc_ads(Set<ads> cc_ads) {
		this.cc_ads = cc_ads;
	}

}
