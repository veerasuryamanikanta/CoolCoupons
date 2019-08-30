package com.mc.GiftCards.bean;

import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

public class CategoryDto {

	private Long id;
	private Long city_id;
	private byte[] photo;

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Long getCity_id() {
		return city_id;
	}

	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}

	private String name;

	private String imagePath;

	private MultipartFile image;

	private Long createdBy;

	private String createdDate;

	private boolean active;

	private Set<Long> subCategoryIdList;

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

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Long> getSubCategoryIdList() {
		return subCategoryIdList;
	}

	public void setSubCategoryIdList(Set<Long> subCategoryIdList) {
		this.subCategoryIdList = subCategoryIdList;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

}
