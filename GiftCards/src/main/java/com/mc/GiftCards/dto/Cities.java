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
@Table(name = "cc_cities")
public class Cities {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cc_city_id", nullable = false, updatable = false)
	private Long cc_city_id;

	@Column(name = "cc_city_name", nullable = false)
	private String cc_city_name;
	
	@Column(name = "cc_city_createdby")
	private String cc_city_createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Date created_date;

	@Column(name = "cc_city_isActive", columnDefinition = "boolean default false")
	private boolean cc_city_isActive;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "state_id")
	private States cc_states;
	
	
	
	public Long getCc_city_id() {
		return cc_city_id;
	}

	public void setCc_city_id(Long cc_city_id) {
		this.cc_city_id = cc_city_id;
	}

	public String getCc_city_name() {
		return cc_city_name;
	}

	public void setCc_city_name(String cc_city_name) {
		this.cc_city_name = cc_city_name;
	}

	public String getCc_city_createdby() {
		return cc_city_createdby;
	}

	public void setCc_city_createdby(String cc_city_createdby) {
		this.cc_city_createdby = cc_city_createdby;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public boolean isCc_city_isActive() {
		return cc_city_isActive;
	}

	public void setCc_city_isActive(boolean cc_city_isActive) {
		this.cc_city_isActive = cc_city_isActive;
	}

	public States getCc_states() {
		return cc_states;
	}

	public void setCc_states(States cc_states) {
		this.cc_states = cc_states;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_cities", cascade = CascadeType.ALL)
	private Set<Locations> cc_locations;

	public Set<Locations> getCc_locations() {
		return cc_locations;
	}

	public void setCc_locations(Set<Locations> cc_locations) {
		this.cc_locations = cc_locations;
	}

}
