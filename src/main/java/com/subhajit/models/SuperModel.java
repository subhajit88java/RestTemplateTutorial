package com.subhajit.models;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

public class SuperModel {

	private Integer id;
	private String name;
	private String address;
	private GovtIdentityModel govtIdentityModel;
	private List<CompanyModel> companyList;
	private List<CollegeModel> collegeList;
	private String[] idols;
	private Map<String, List> academicProfessionalDetails;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public GovtIdentityModel getGovtIdentityModel() {
		return govtIdentityModel;
	}
	public void setGovtIdentityModel(GovtIdentityModel govtIdentityModel) {
		this.govtIdentityModel = govtIdentityModel;
	}
	public List<CompanyModel> getCompanyList() {
		return companyList;
	}
	public void setCompanyList(List<CompanyModel> companyList) {
		this.companyList = companyList;
	}
	public List<CollegeModel> getCollegeList() {
		return collegeList;
	}
	public void setCollegeList(List<CollegeModel> collegeList) {
		this.collegeList = collegeList;
	}
	public String[] getIdols() {
		return idols;
	}
	public void setIdols(String[] idols) {
		this.idols = idols;
	}
	public Map<String, List> getAcademicProfessionalDetails() {
		return academicProfessionalDetails;
	}
	public void setAcademicProfessionalDetails(Map<String, List> academicProfessionalDetails) {
		this.academicProfessionalDetails = academicProfessionalDetails;
	}
	@Override
	public String toString() {
		return "SuperModel [id=" + id + ", name=" + name + ", address=" + address + ", govtIdentityModel="
				+ govtIdentityModel + ", companyList=" + companyList + ", collegeList=" + collegeList + ", idols="
				+ Arrays.toString(idols) + ", academicProfessionalDetails=" + academicProfessionalDetails + "]";
	}
		
}
