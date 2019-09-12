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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cc_city")
public class city {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cityid", nullable = false, updatable = false)
	private Long cityid;

	@Column(name = "cityname", nullable = false, unique=true)
	private String cityname;

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
	@JoinColumn(name = "stateid")
	private state cc_state;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_city", cascade = CascadeType.MERGE)
	private Set<location> cc_location;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_city", cascade = CascadeType.MERGE)
	private Set<subcategory> cc_subcategory;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_city", cascade = CascadeType.MERGE)
	private Set<ads> cc_ads;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_city", cascade = CascadeType.MERGE)
	private Set<category> cc_category;

	public Set<category> getCc_category() {
		return cc_category;
	}

	public void setCc_category(Set<category> cc_category) {
		this.cc_category = cc_category;
	}

	public Long getCityid() {
		return cityid;
	}

	public void setCityid(Long cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
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

	public state getCc_state() {
		return cc_state;
	}

	public void setCc_state(state cc_state) {
		this.cc_state = cc_state;
	}

	public Set<location> getCc_location() {
		return cc_location;
	}

	public void setCc_location(Set<location> cc_location) {
		this.cc_location = cc_location;
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
