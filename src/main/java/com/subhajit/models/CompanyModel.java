package com.subhajit.models;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

public class CompanyModel {

	private Integer CompanyId;
	private String CompanyName;
	private List<String> companyLocations;
	
	public Integer getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(Integer companyId) {
		CompanyId = companyId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public List<String> getCompanyLocations() {
		return companyLocations;
	}
	public void setCompanyLocations(List<String> companyLocations) {
		this.companyLocations = companyLocations;
	}
	
	@Override
	public String toString() {
		return "CompanyModel [CompanyId=" + CompanyId + ", CompanyName=" + CompanyName + ", companyLocations="
				+ companyLocations + "]";
	}
		
}
