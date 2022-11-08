package com.cav.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="custome")
public class Customer {
	
	String id;
	String fname;
	String sname;
	String dob;
	String gender;
	
	

	public void setId(String id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getSname() {
		return sname;
	}

	public String getDob() {
		return dob;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", sname=" + sname + ", dob=" + dob + ", gender=" + gender
				+ "]";
	}

}
