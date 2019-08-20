package com.mc.GiftCards.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_countries")
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "cc_country_name", nullable = false)
	private String cc_country_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCc_country_name() {
		return cc_country_name;
	}

	public void setCc_country_name(String cc_country_name) {
		this.cc_country_name = cc_country_name;
	}

}
