package com.CURD;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 @Entity
public class EmployeeDetails {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String ename;
	String address;
	String gender;
	long contact;
	String email;
	Double pack;
	String dsignation;
	
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int id, String ename, String address, String gender, int contact, String email, Double pack,
			String dsignation) {
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
		this.pack = pack;
		this.dsignation = dsignation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long l) {
		this.contact = l;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPack() {
		return pack;
	}

	public void setPack(Double pack) {
		this.pack = pack;
	}

	public String getDsignation() {
		return dsignation;
	}

	public void setDsignation(String dsignation) {
		this.dsignation = dsignation;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", ename=" + ename + ", address=" + address + ", gender=" + gender
				+ ", contact=" + contact + ", email=" + email + ", pack=" + pack + ", dsignation=" + dsignation + "]";
	}
		
	
	

}
