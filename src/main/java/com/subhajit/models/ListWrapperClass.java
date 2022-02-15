package com.subhajit.models;

import java.util.List;

public class ListWrapperClass {

	List<SuperModel> superModelList;

	public List<SuperModel> getSuperModelList() {
		return superModelList;
	}

	public void setSuperModelList(List<SuperModel> superModelList) {
		this.superModelList = superModelList;
	}

	@Override
	public String toString() {
		return "ListWrapperClass [superModelList=" + superModelList + "]";
	}
	
	
}
