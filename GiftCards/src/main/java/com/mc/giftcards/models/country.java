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
@Table(name = "cc_country")
public class country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "countryid", nullable = false, updatable = false)
	private Long countryid;

	@Column(name = "countryname", nullable = false,unique=true)
	private String countryname;

	@Column(name = "imagepath")
	private String imagepath;

	@Transient
	private MultipartFile image;

	@Lob
	@Column(name = "photo")
	private String photo;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_country", cascade = CascadeType.MERGE)
	private Set<state> cc_state;

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

	public Long getCountryid() {
		return countryid;
	}

	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
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

	public Set<state> getCc_state() {
		return cc_state;
	}

	public void setCc_state(Set<state> cc_state) {
		this.cc_state = cc_state;
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

	
}
