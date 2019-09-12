package com.mc.giftcards.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cc_location")
public class location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "locationid", nullable = false, updatable = false)
	private Long locationid;

	@Column(name = "locationname", nullable = false, unique=true)
	private String locationname;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cityid")
	private city cc_city;

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

	public Long getLocationid() {
		return locationid;
	}

	public void setLocationid(Long locationid) {
		this.locationid = locationid;
	}

	public String getLocationname() {
		return locationname;
	}

	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}

	public city getCc_city() {
		return cc_city;
	}

	public void setCc_city(city cc_city) {
		this.cc_city = cc_city;
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
