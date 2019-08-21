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

@Entity
@Table(name = "cc_countries")
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id", nullable = false, updatable = false)
	private Long country_id;

	@Column(name = "cc_country_code", nullable = false)
	private String cc_country_code;

	@Column(name = "cc_country_name", nullable = false)
	private String cc_country_name;

	@Column(name = "cc_country_imgpath")
	private String cc_country_imgpath;

	@Column(name = "cc_createdby")
	private String cc_createdby;

	public String getCc_country_code() {
		return cc_country_code;
	}

	public void setCc_country_code(String cc_country_code) {
		this.cc_country_code = cc_country_code;
	}

	public String getCc_country_imgpath() {
		return cc_country_imgpath;
	}

	public void setCc_country_imgpath(String cc_country_imgpath) {
		this.cc_country_imgpath = cc_country_imgpath;
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

	public boolean isCc_isActive() {
		return cc_isActive;
	}

	public void setCc_isActive(boolean cc_isActive) {
		this.cc_isActive = cc_isActive;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_isActive", columnDefinition = "boolean default false")
	private boolean cc_isActive;

	public Long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	public String getCc_country_name() {
		return cc_country_name;
	}

	public void setCc_country_name(String cc_country_name) {
		this.cc_country_name = cc_country_name;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_countries", cascade = CascadeType.ALL)
	private Set<States> cc_states;

	public Set<States> getCc_states() {
		return cc_states;
	}

	public void setCc_states(Set<States> cc_states) {
		this.cc_states = cc_states;
	}

}
