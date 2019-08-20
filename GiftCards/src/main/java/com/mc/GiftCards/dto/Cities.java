package com.mc.GiftCards.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_cities")
public class Cities {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;



	@Column(name = "cc_city_name", nullable = false)
	private String cc_city_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCc_city_name() {
		return cc_city_name;
	}

	public void setCc_city_name(String cc_city_name) {
		this.cc_city_name = cc_city_name;
	}

	
	
}
