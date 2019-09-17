package com.tech.guru.pintu.ioc.model;

/**
 * 
 * @author pintug
 *
 */
public class Employee {
	
	int eid;
	String ename;
	String eaddress;
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", address=" + address
				+ ", getAddress()=" + getAddress() + ", getEid()=" + getEid() + ", getEname()=" + getEname()
				+ ", getEaddress()=" + getEaddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Employee(Address address) {
		super();
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("-- Employee Object Constucted--");
	}
	public Employee(int eid, String ename, String eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	
	public void myInit() {
		System.out.println("Object Initialized");
	}
	
	public void myDestroy () {
		System.out.println(" Object Destoroyed !!");
	}
	
	

}
