package com.parth.emt.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"password"})
@JsonPropertyOrder({"email","name","country","password"})
public class Employee {
	@JsonProperty("Student_Name")
	private String name;
	@JsonProperty("Password")
	private String password;
	@JsonProperty("Student_Email")
	private String email;
	@JsonProperty("Student_Country")
	private String country;
	
	public String getPassword() {
	
		return password;
	}

	
	public void setPassword(String password) {
	
		this.password = password;
	}

	
	public String getEmail() {
	
		return email;
	}

	
	public void setEmail(String email) {
	
		this.email = email;
	}

	
	public String getCountry() {
	
		return country;
	}

	
	public void setCountry(String country) {
	
		this.country = country;
	}

	

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}
	
}
