package com.mc.giftcards.dto;

import org.springframework.web.multipart.MultipartFile;

public class adsDto {

	private Long adid;
	private Long categoryid;
	private Long subcategoryid;
	private Long cityid;
	private String adtitle;
	private String contact_address;
	private String contact_name;
	private String contact_number;
	private String imagePath;
	private MultipartFile image;
	private byte[] photo;
	private Long createdBy;
	private String createdDate;
	private Long modifiedBy;
	private String modifiedDate;
	private String adoffer;
	
	public String getAdoffer() {
		return adoffer;
	}
	public void setAdoffer(String adoffer) {
		this.adoffer = adoffer;
	}
	private boolean active;
	public Long getAdid() {
		return adid;
	}
	public void setAdid(Long adid) {
		this.adid = adid;
	}
	public Long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	public Long getSubcategoryid() {
		return subcategoryid;
	}
	public void setSubcategoryid(Long subcategoryid) {
		this.subcategoryid = subcategoryid;
	}
	public Long getCityid() {
		return cityid;
	}
	public void setCityid(Long cityid) {
		this.cityid = cityid;
	}
	public String getAdtitle() {
		return adtitle;
	}
	public void setAdtitle(String adtitle) {
		this.adtitle = adtitle;
	}
	public String getContact_address() {
		return contact_address;
	}
	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
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
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
