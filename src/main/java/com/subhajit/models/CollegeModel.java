package com.subhajit.models;

import javax.xml.bind.annotation.XmlRootElement;

public class CollegeModel {

	private Integer collegeId;
	private String collegeName;
	private UniversityModel universityModel;

	public CollegeModel(Integer collegeId, String collegeName) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}

	public CollegeModel() {}

	public UniversityModel getUniversityModel() {
		return universityModel;
	}

	public void setUniversityModel(UniversityModel universityModel) {
		this.universityModel = universityModel;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "CollegeModel [collegeId=" + collegeId + ", collegeName=" + collegeName + ", universityModel="
				+ universityModel + "]";
	}


}
