package com.cg.spring.springbootmvc2.beans;

public class Merchants {

	private int id;
	private String name;
	private String Organisation;
	private String type;

	public Merchants(int id, String name, String organisation, String type) {
		super();
		this.id = id;
		this.name = name;
		Organisation = organisation;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(String organisation) {
		Organisation = organisation;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Merchants() {

	}
}