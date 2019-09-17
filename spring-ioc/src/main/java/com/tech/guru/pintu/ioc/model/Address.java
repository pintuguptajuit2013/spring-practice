package com.tech.guru.pintu.ioc.model;
/**
 * 
 * @author pintug
 *
 */
public class Address {
	
	
	String city;
	String zipCode;
	String state;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String zipCode, String state) {
		super();
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCode=" + zipCode + ", state=" + state + ", getCity()=" + getCity()
				+ ", getZipCode()=" + getZipCode() + ", getState()=" + getState() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
