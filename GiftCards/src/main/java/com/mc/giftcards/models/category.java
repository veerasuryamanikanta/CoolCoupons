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
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name = "cc_category")
public class category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categoryid", nullable = false, updatable = false)
	private Long categoryid;

	@Column(name = "categoryname", nullable = false)
	private String categoryname;

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
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_category", cascade = CascadeType.ALL)
	private Set<subcategory> cc_subcategory;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_category", cascade = CascadeType.ALL)
	private Set<ads> cc_ads;

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
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

	public Set<subcategory> getCc_subcategory() {
		return cc_subcategory;
	}

	public void setCc_subcategory(Set<subcategory> cc_subcategory) {
		this.cc_subcategory = cc_subcategory;
	}

	public Set<ads> getCc_ads() {
		return cc_ads;
	}

	public void setCc_ads(Set<ads> cc_ads) {
		this.cc_ads = cc_ads;
	}
}
