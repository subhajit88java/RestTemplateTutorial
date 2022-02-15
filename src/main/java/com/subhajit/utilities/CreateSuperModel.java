package com.subhajit.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.subhajit.models.CollegeModel;
import com.subhajit.models.CompanyModel;
import com.subhajit.models.GovtIdentityModel;
import com.subhajit.models.SuperModel;
import com.subhajit.models.UniversityModel;

public class CreateSuperModel {

	private static SuperModel getSuperModelOne() {

		// Creating College Model List
		CollegeModel collegeModelOne = new CollegeModel();
		collegeModelOne.setCollegeId(1);
		collegeModelOne.setCollegeName("Michael Madhusudan Memorial College");
		UniversityModel universityModelOne = new UniversityModel();
		universityModelOne.setUniversityId(1);
		universityModelOne.setUniversityName("Burdwan University");
		collegeModelOne.setUniversityModel(universityModelOne);

		CollegeModel collegeModelTwo = new CollegeModel();
		collegeModelTwo.setCollegeId(2);
		collegeModelTwo.setCollegeName("Heritage Institute of Technology");
		UniversityModel universityModelTwo = new UniversityModel();
		universityModelTwo.setUniversityId(2);
		universityModelTwo.setUniversityName("WBUT");
		collegeModelTwo.setUniversityModel(universityModelTwo);

		List<CollegeModel> collegeList = new ArrayList<>();
		collegeList.add(collegeModelOne);
		collegeList.add(collegeModelTwo);

		// Creating Govt. Identity Model
		GovtIdentityModel govtIdentityModel = new GovtIdentityModel();
		govtIdentityModel.setGovtIdentityName("Passport");
		govtIdentityModel.setGovtIdentityNumber("12345");

		// Creating Company Model List
		CompanyModel companyModelOne = new CompanyModel();
		companyModelOne.setCompanyId(1);
		companyModelOne.setCompanyName("Rtizen");
		List<String> companyModelOneLocations = new ArrayList<>();
		companyModelOneLocations.add("Metropoliton");
		companyModelOne.setCompanyLocations(companyModelOneLocations);

		CompanyModel companyModelTwo = new CompanyModel();
		companyModelTwo.setCompanyId(2);
		companyModelTwo.setCompanyName("Indusnet Technologies");
		List<String> companyModelTwoLocations = new ArrayList<>();
		companyModelTwoLocations.add("SDF Building");
		companyModelTwoLocations.add("DN Building");
		companyModelTwoLocations.add("Chennai");
		companyModelTwo.setCompanyLocations(companyModelTwoLocations);

		CompanyModel companyModelThree = new CompanyModel();
		companyModelThree.setCompanyId(3);
		companyModelThree.setCompanyName("Cognizant Technological Solutions");
		List<String> companyModelThreeLocations = new ArrayList<>();
		companyModelThreeLocations.add("Bantala");
		companyModelThreeLocations.add("SDF");
		companyModelThreeLocations.add("Unitech");
		companyModelThreeLocations.add("Technopolis");
		companyModelThree.setCompanyLocations(companyModelThreeLocations);

		List<CompanyModel> companyModelList = new ArrayList<>();
		companyModelList.add(companyModelOne);
		companyModelList.add(companyModelTwo);
		companyModelList.add(companyModelThree);

		Map<String, List> academicProfessionalDetails = new HashMap<>();
		academicProfessionalDetails.put("Colleges", collegeList);
		academicProfessionalDetails.put("Companies", companyModelList);

		// Populating Super Model
		SuperModel superModel = new SuperModel();
		superModel.setId(1);
		superModel.setName("Subhajit Kar");
		superModel.setAddress("House no :27, Shyampur Beltala");
		superModel.setCollegeList(collegeList);
		superModel.setGovtIdentityModel(govtIdentityModel);
		superModel.setCompanyList(companyModelList);
		superModel.setAcademicProfessionalDetails(academicProfessionalDetails);
		superModel.setIdols(new String[] { "Netaji", "APJ Abdul Kalam", "Ratan Tata", "JMG Sir", "Sourav Ganguly" });

		return superModel;
	}

	private static SuperModel getSuperModelTwo() {

		// Creating College Model List
		CollegeModel collegeModelOne = new CollegeModel();
		collegeModelOne.setCollegeId(1);
		collegeModelOne.setCollegeName("Women's College");
		UniversityModel universityModelOne = new UniversityModel();
		universityModelOne.setUniversityId(1);
		universityModelOne.setUniversityName("Burdwan University");
		collegeModelOne.setUniversityModel(universityModelOne);

		List<CollegeModel> collegeList = new ArrayList<>();
		collegeList.add(collegeModelOne);

		// Creating Govt. Identity Model
		GovtIdentityModel govtIdentityModel = new GovtIdentityModel();
		govtIdentityModel.setGovtIdentityName("Voter Card");
		govtIdentityModel.setGovtIdentityNumber("54321");

		// Creating Company Model List
		CompanyModel companyModelOne = new CompanyModel();
		companyModelOne.setCompanyId(1);
		companyModelOne.setCompanyName("Pace IIT");
		List<String> companyModelOneLocations = new ArrayList<>();
		companyModelOneLocations.add("City Centre");
		companyModelOne.setCompanyLocations(companyModelOneLocations);

		CompanyModel companyModelTwo = new CompanyModel();
		companyModelTwo.setCompanyId(2);
		companyModelTwo.setCompanyName("Pathfinder");
		List<String> companyModelTwoLocations = new ArrayList<>();
		companyModelTwoLocations.add("City Centre");
		companyModelTwoLocations.add("Benachity");
		companyModelTwo.setCompanyLocations(companyModelTwoLocations);

		List<CompanyModel> companyModelList = new ArrayList<>();
		companyModelList.add(companyModelOne);
		companyModelList.add(companyModelTwo);

		Map<String, List> academicProfessionalDetails = new HashMap<>();
		academicProfessionalDetails.put("Colleges", collegeList);
		academicProfessionalDetails.put("Companies", companyModelList);

		// Populating Super Model
		SuperModel superModel = new SuperModel();
		superModel.setId(2);
		superModel.setName("Pallobi Das");
		superModel.setAddress("Quarter no : 333, B-Zone Township");
		superModel.setCollegeList(collegeList);
		superModel.setGovtIdentityModel(govtIdentityModel);
		superModel.setCompanyList(companyModelList);
		superModel.setAcademicProfessionalDetails(academicProfessionalDetails);
		superModel.setIdols(new String[] { "APJ Abdul Kalam", "Swami Vivekananda" });

		return superModel;
	}

	private static SuperModel getSuperModelThree() {

		// Creating College Model List
		CollegeModel collegeModelOne = new CollegeModel();
		collegeModelOne.setCollegeId(1);
		collegeModelOne.setCollegeName("Chuchura Institute");
		UniversityModel universityModelOne = new UniversityModel();
		universityModelOne.setUniversityId(1);
		universityModelOne.setUniversityName("WBUT");
		collegeModelOne.setUniversityModel(universityModelOne);

		CollegeModel collegeModelTwo = new CollegeModel();
		collegeModelTwo.setCollegeId(2);
		collegeModelTwo.setCollegeName("Heritage Institute of Technology");
		UniversityModel universityModelTwo = new UniversityModel();
		universityModelTwo.setUniversityId(2);
		universityModelTwo.setUniversityName("WBUT");
		collegeModelTwo.setUniversityModel(universityModelTwo);

		List<CollegeModel> collegeList = new ArrayList<>();
		collegeList.add(collegeModelOne);
		collegeList.add(collegeModelTwo);

		// Creating Govt. Identity Model
		GovtIdentityModel govtIdentityModel = new GovtIdentityModel();
		govtIdentityModel.setGovtIdentityName("PAN Card");
		govtIdentityModel.setGovtIdentityNumber("00000");

		// Creating Company Model List
		CompanyModel companyModelOne = new CompanyModel();
		companyModelOne.setCompanyId(1);
		companyModelOne.setCompanyName("National Informatics Centre");
		List<String> companyModelOneLocations = new ArrayList<>();
		companyModelOneLocations.add("Kolkata");
		companyModelOneLocations.add("Haldia");
		companyModelOneLocations.add("Vishakhapatnam");
		companyModelOneLocations.add("Delhi");
		companyModelOne.setCompanyLocations(companyModelOneLocations);

		CompanyModel companyModelTwo = new CompanyModel();
		companyModelTwo.setCompanyId(2);
		companyModelTwo.setCompanyName("Infosys");
		List<String> companyModelTwoLocations = new ArrayList<>();
		companyModelTwoLocations.add("Bhubaneswar");
		companyModelTwoLocations.add("Bangalore");
		companyModelTwo.setCompanyLocations(companyModelTwoLocations);

		CompanyModel companyModelThree = new CompanyModel();
		companyModelThree.setCompanyId(3);
		companyModelThree.setCompanyName("Accenture");
		List<String> companyModelThreeLocations = new ArrayList<>();
		companyModelThreeLocations.add("Kolkata");
		companyModelThreeLocations.add("Bangalore");
		companyModelThreeLocations.add("Hyderabad");
		companyModelThree.setCompanyLocations(companyModelThreeLocations);

		List<CompanyModel> companyModelList = new ArrayList<>();
		companyModelList.add(companyModelOne);
		companyModelList.add(companyModelTwo);
		companyModelList.add(companyModelThree);

		Map<String, List> academicProfessionalDetails = new HashMap<>();
		academicProfessionalDetails.put("Colleges", collegeList);
		academicProfessionalDetails.put("Companies", companyModelList);

		// Populating Super Model
		SuperModel superModel = new SuperModel();
		superModel.setId(3);
		superModel.setName("Asim Sarkar");
		superModel.setAddress("Debagram, Nadia");
		superModel.setCollegeList(collegeList);
		superModel.setGovtIdentityModel(govtIdentityModel);
		superModel.setCompanyList(companyModelList);
		superModel.setIdols(new String[] { "JMG Sir", "Kacchap" });
		superModel.setAcademicProfessionalDetails(academicProfessionalDetails);

		return superModel;
	}

	private static SuperModel getSuperModelFour() {

		// Creating College Model List
		CollegeModel collegeModelOne = new CollegeModel();
		collegeModelOne.setCollegeId(1);
		collegeModelOne.setCollegeName("Techno India");
		UniversityModel universityModelOne = new UniversityModel();
		universityModelOne.setUniversityId(1);
		universityModelOne.setUniversityName("WBUT");
		collegeModelOne.setUniversityModel(universityModelOne);

		List<CollegeModel> collegeList = new ArrayList<>();
		collegeList.add(collegeModelOne);

		// Creating Govt. Identity Model
		GovtIdentityModel govtIdentityModel = new GovtIdentityModel();
		govtIdentityModel.setGovtIdentityName("Passport");
		govtIdentityModel.setGovtIdentityNumber("99999");

		// Creating Company Model List
		CompanyModel companyModelOne = new CompanyModel();
		companyModelOne.setCompanyId(1);
		companyModelOne.setCompanyName("Wipro");
		List<String> companyModelOneLocations = new ArrayList<>();
		companyModelOneLocations.add("Kolkata");
		companyModelOneLocations.add("Mumbai");
		companyModelOne.setCompanyLocations(companyModelOneLocations);

		CompanyModel companyModelTwo = new CompanyModel();
		companyModelTwo.setCompanyId(2);
		companyModelTwo.setCompanyName("Indusnet");
		List<String> companyModelTwoLocations = new ArrayList<>();
		companyModelTwoLocations.add("SDF Building");
		companyModelTwoLocations.add("DN Building");
		companyModelTwoLocations.add("Chennai");
		companyModelTwo.setCompanyLocations(companyModelTwoLocations);

		CompanyModel companyModelThree = new CompanyModel();
		companyModelThree.setCompanyId(3);
		companyModelThree.setCompanyName("Tata Consultancy Service");
		List<String> companyModelThreeLocations = new ArrayList<>();
		companyModelThreeLocations.add("Kolkata");
		companyModelThreeLocations.add("Bangalore");
		companyModelThreeLocations.add("Hyderabad");
		companyModelThree.setCompanyLocations(companyModelThreeLocations);

		CompanyModel companyModelFour = new CompanyModel();
		companyModelFour.setCompanyId(3);
		companyModelFour.setCompanyName("MPhasis");
		List<String> companyModelFourLocations = new ArrayList<>();
		companyModelFourLocations.add("Bangalore");
		companyModelFour.setCompanyLocations(companyModelFourLocations);

		List<CompanyModel> companyModelList = new ArrayList<>();
		companyModelList.add(companyModelOne);
		companyModelList.add(companyModelTwo);
		companyModelList.add(companyModelThree);
		companyModelList.add(companyModelFour);

		Map<String, List> academicProfessionalDetails = new HashMap<>();
		academicProfessionalDetails.put("Colleges", collegeList);
		academicProfessionalDetails.put("Companies", companyModelList);

		// Populating Super Model
		SuperModel superModel = new SuperModel();
		superModel.setId(4);
		superModel.setName("Chandrima Raha");
		superModel.setAddress("Quarter no :125, B-Zone Township");
		superModel.setCollegeList(collegeList);
		superModel.setGovtIdentityModel(govtIdentityModel);
		superModel.setCompanyList(companyModelList);
		superModel.setAcademicProfessionalDetails(academicProfessionalDetails);
		superModel.setIdols(new String[] { "Salman Khan", "Dev Totla" });

		return superModel;
	}

	private static SuperModel getSuperModelFive() {

		// Creating College Model List
		CollegeModel collegeModelOne = new CollegeModel();
		collegeModelOne.setCollegeId(1);
		collegeModelOne.setCollegeName("Chuchura Institute");
		UniversityModel universityModelOne = new UniversityModel();
		universityModelOne.setUniversityId(1);
		universityModelOne.setUniversityName("WBUT");
		collegeModelOne.setUniversityModel(universityModelOne);

		CollegeModel collegeModelTwo = new CollegeModel();
		collegeModelTwo.setCollegeId(2);
		collegeModelTwo.setCollegeName("Heritage Institute of Technology");
		UniversityModel universityModelTwo = new UniversityModel();
		universityModelTwo.setUniversityId(2);
		universityModelTwo.setUniversityName("WBUT");
		collegeModelTwo.setUniversityModel(universityModelTwo);

		List<CollegeModel> collegeList = new ArrayList<>();
		collegeList.add(collegeModelOne);
		collegeList.add(collegeModelTwo);

		// Creating Govt. Identity Model
		GovtIdentityModel govtIdentityModel = new GovtIdentityModel();
		govtIdentityModel.setGovtIdentityName("Voter Card");
		govtIdentityModel.setGovtIdentityNumber("55555");

		// Creating Company Model List
		CompanyModel companyModelOne = new CompanyModel();
		companyModelOne.setCompanyId(1);
		companyModelOne.setCompanyName("Govt. Sector");
		List<String> companyModelOneLocations = new ArrayList<>();
		companyModelOneLocations.add("Debagram");
		companyModelOne.setCompanyLocations(companyModelOneLocations);

		List<CompanyModel> companyModelList = new ArrayList<>();
		companyModelList.add(companyModelOne);

		Map<String, List> academicProfessionalDetails = new HashMap<>();
		academicProfessionalDetails.put("Colleges", collegeList);
		academicProfessionalDetails.put("Companies", companyModelList);

		// Populating Super Model
		SuperModel superModel = new SuperModel();
		superModel.setId(5);
		superModel.setName("Suman Sadhu");
		superModel.setAddress("Chuchura Chelapotti");
		superModel.setCollegeList(collegeList);
		superModel.setGovtIdentityModel(govtIdentityModel);
		superModel.setCompanyList(companyModelList);
		superModel.setAcademicProfessionalDetails(academicProfessionalDetails);
		superModel.setIdols(new String[] { "Allu Arjun", "Mahesh Babu" });

		return superModel;
	}

	public static SuperModel getSuperModel() {

		return getSuperModelOne();
	}

	public static List<SuperModel> getSuperModelList() {

		List<SuperModel> superModelList = new ArrayList<>();

		superModelList.add(getSuperModelOne());
		superModelList.add(getSuperModelTwo());
		superModelList.add(getSuperModelThree());
		superModelList.add(getSuperModelFour());
		superModelList.add(getSuperModelFive());

		return superModelList;
	}

	public static Map<String, SuperModel> getSuperModelMap() {

		Map<String, SuperModel> introduction = new HashMap<>();

		introduction.put("Subhajit", getSuperModelOne());
		introduction.put("Pallobi", getSuperModelTwo());
		introduction.put("Asim", getSuperModelThree());
		introduction.put("Chandrima", getSuperModelFour());
		introduction.put("Suman", getSuperModelFive());

		return introduction;
	}

	public static void main(String[] args) {
		// System.out.println(getSuperModel());
		// System.out.println(getSuperModelList());
		System.out.println(getSuperModelMap());
	}
}
