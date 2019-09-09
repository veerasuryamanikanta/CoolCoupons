package com.mc.giftcards.dto;

public class stateDto {

	private Long stateid;
	
	private Long countryid;

	private String statename;

	private Long createdby;

	private Long modifiedby;

	private String createdate;

	private String modifiedate;

	private boolean isactive;

	public Long getStateid() {
		return stateid;
	}

	public void setStateid(Long stateid) {
		this.stateid = stateid;
	}

	public Long getCountryid() {
		return countryid;
	}

	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public Long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public Long getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(Long modifiedby) {
		this.modifiedby = modifiedby;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getModifiedate() {
		return modifiedate;
	}

	public void setModifiedate(String modifiedate) {
		this.modifiedate = modifiedate;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

}
