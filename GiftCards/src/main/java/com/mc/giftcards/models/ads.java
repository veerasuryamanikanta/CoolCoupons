package com.mc.giftcards.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "cc_ads")
public class ads {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adid", nullable = false, updatable = false)
	private Long adid;

	@Column(name = "adtitle", nullable = false, unique=true)
	private String adtitle;

	@Column(name = "contact_name", nullable = false)
	private String contact_name;

	@Column(name = "contact_number", nullable = false)
	private String contact_number;

	@Column(name = "contact_email", nullable = false)
	private String contact_email;

	@Column(name = "contact_address", nullable = false)
	private String contact_address;

	@Column(name = "adoffer", nullable = false)
	private String adoffer;
	
	@Column(name = "desc_offer", nullable = false)
	private String desc_offer;

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

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cityid")
	private city cc_city;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "categoryid")
	private category cc_category;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "subcategoryid")
	private subcategory cc_subcategory;

	public String getDesc_offer() {
		return desc_offer;
	}

	public void setDesc_offer(String desc_offer) {
		this.desc_offer = desc_offer;
	}

	public Long getAdid() {
		return adid;
	}

	public void setAdid(Long adid) {
		this.adid = adid;
	}

	public String getAdtitle() {
		return adtitle;
	}

	public void setAdtitle(String adtitle) {
		this.adtitle = adtitle;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getContact_address() {
		return contact_address;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
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

	public subcategory getCc_subcategory() {
		return cc_subcategory;
	}

	public void setCc_subcategory(subcategory cc_subcategory) {
		this.cc_subcategory = cc_subcategory;
	}

	public String getAdoffer() {
		return adoffer;
	}

	public void setAdoffer(String adoffer) {
		this.adoffer = adoffer;
	}

	public String getContact_email() {
		return contact_email;
	}

	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}

}
