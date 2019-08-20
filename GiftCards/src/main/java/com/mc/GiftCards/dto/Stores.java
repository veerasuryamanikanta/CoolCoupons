package com.mc.GiftCards.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_stores")
public class Stores {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;



	@Column(name = "cc_store_name", nullable = false)
	private String cc_store_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCc_store_name() {
		return cc_store_name;
	}

	public void setCc_store_name(String cc_store_name) {
		this.cc_store_name = cc_store_name;
	}

	

	
}
