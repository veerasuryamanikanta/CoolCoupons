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
@Table(name = "cc_state")
public class state {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stateid", nullable = false, updatable = false)
	private Long stateid;

	@Column(name = "statename", nullable = false)
	private String statename;

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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryid")
	private country cc_country;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cc_state", cascade = CascadeType.ALL)
	private Set<city> cc_city;

	public Long getStateid() {
		return stateid;
	}

	public void setStateid(Long stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
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

	public country getCc_country() {
		return cc_country;
	}

	public void setCc_country(country cc_country) {
		this.cc_country = cc_country;
	}

	public Set<city> getCc_city() {
		return cc_city;
	}

	public void setCc_city(Set<city> cc_city) {
		this.cc_city = cc_city;
	}

}
