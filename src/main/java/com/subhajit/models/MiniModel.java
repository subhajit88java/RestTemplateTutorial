package com.subhajit.models;

public class MiniModel {

	private Integer id;
	private String name;
	
	public MiniModel() {}
	
	public MiniModel(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "MiniModel [id=" + id + ", name=" + name + "]";
	}
	
}
