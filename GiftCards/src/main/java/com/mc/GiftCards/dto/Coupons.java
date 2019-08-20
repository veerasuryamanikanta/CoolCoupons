package com.mc.GiftCards.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc_coupons")
public class Coupons {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "cc_coupon_name", nullable = false)
	private String cc_coupon_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCc_coupon_name() {
		return cc_coupon_name;
	}

	public void setCc_coupon_name(String cc_coupon_name) {
		this.cc_coupon_name = cc_coupon_name;
	}

}
