package com.mc.GiftCards.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_banners")
public class Banners {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "cc_banner_name", nullable = false)
	private String cc_banner_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCc_banner_name() {
		return cc_banner_name;
	}

	public void setCc_banner_name(String cc_banner_name) {
		this.cc_banner_name = cc_banner_name;
	}

}
