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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cc_states")
public class States {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "state_id", nullable = false, updatable = false)
	private Long state_id;

	@Column(name = "cc_state_code", nullable = false)
	private String cc_state_code;

	@Column(name = "cc_state_name", nullable = false)
	private String cc_state_name;

	@Column(name = "cc_state_createdby")
	private String cc_state_createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_state_isActive", columnDefinition = "boolean default false")
	private boolean cc_state_isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "country_id")
	private Countries cc_countries;
	
	public Long getState_id() {
		return state_id;
	}

	public void setState_id(Long state_id) {
		this.state_id = state_id;
	}

	public String getCc_state_code() {
		return cc_state_code;
	}

	public void setCc_state_code(String cc_state_code) {
		this.cc_state_code = cc_state_code;
	}

	public String getCc_state_name() {
		return cc_state_name;
	}

	public void setCc_state_name(String cc_state_name) {
		this.cc_state_name = cc_state_name;
	}

	public String getCc_state_createdby() {
		return cc_state_createdby;
	}

	public void setCc_state_createdby(String cc_state_createdby) {
		this.cc_state_createdby = cc_state_createdby;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public boolean isCc_state_isActive() {
		return cc_state_isActive;
	}

	public void setCc_state_isActive(boolean cc_state_isActive) {
		this.cc_state_isActive = cc_state_isActive;
	}

	public Countries getCc_countries() {
		return cc_countries;
	}

	public void setCc_countries(Countries cc_countries) {
		this.cc_countries = cc_countries;
	}

	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_states", cascade = CascadeType.ALL)
	private Set<Cities> cc_cities;

	public Set<Cities> getCc_cities() {
		return cc_cities;
	}

	public void setCc_cities(Set<Cities> cc_cities) {
		this.cc_cities = cc_cities;
	}
	
}
