package com.qa.ecommerce.pojo; // POJO = Plain Old Java Object

public class user {
	private String name;
	private String companyName;
	private String companyContactNo;
	private String companyEmail;
	private String companyAddress;
	private String password;

	public user() {
	}

	public user(String name, String companyName, String companyContactNo, String companyEmail,
			String companyAddress, String password) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.companyContactNo = companyContactNo;
		this.companyEmail = companyEmail;
		this.companyAddress = companyAddress;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyContactNo() {
		return companyContactNo;
	}

	public void setCompanyContactNo(String companyContactNo) {
		this.companyContactNo = companyContactNo;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}