package com.capg.bean;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class Merchants {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)//GENERATING VALUES AUTOMATICALLY
	    private int id;
		
		@Column(name="merchant_name")
		private String name;
		
		@Column(name="merchant_type")
		private String type;
		
		@Column(name="merchant_organistaion")
		private String organisation;

		

		public Merchants(int id, String name, String type, String organisation) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.organisation = organisation;
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
			return organisation;
		}

		public void setOrganisation(String organisation) {
			this.organisation = organisation;
		}
		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public 	Merchants() {
		}
		}
		



