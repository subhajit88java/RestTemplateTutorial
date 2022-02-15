package com.subhajit.models;

import javax.xml.bind.annotation.XmlRootElement;

public class GovtIdentityModel {

	private String govtIdentityName;
	private String govtIdentityNumber;
	
	public String getGovtIdentityName() {
		return govtIdentityName;
	}
	public void setGovtIdentityName(String govtIdentityName) {
		this.govtIdentityName = govtIdentityName;
	}
	public String getGovtIdentityNumber() {
		return govtIdentityNumber;
	}
	public void setGovtIdentityNumber(String govtIdentityNumber) {
		this.govtIdentityNumber = govtIdentityNumber;
	}
	
	@Override
	public String toString() {
		return "GovtIdentityModel [govtIdentityName=" + govtIdentityName + ", govtIdentityNumber=" + govtIdentityNumber
				+ "]";
	}
	
}
