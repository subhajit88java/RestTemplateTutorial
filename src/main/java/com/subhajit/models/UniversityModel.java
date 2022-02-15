package com.subhajit.models;

import javax.xml.bind.annotation.XmlRootElement;

public class UniversityModel {

	private Integer universityId;
	private String universityName;
	
	public Integer getUniversityId() {
		return universityId;
	}
	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
	@Override
	public String toString() {
		return "UniversityModel [universityId=" + universityId + ", universityName=" + universityName + "]";
	}
	
}
