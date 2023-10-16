package com.springcore.collections;

import java.util.*;

public class Emp
{
	private String name;
	private Set<String> phones;
	private List<String> Addresses;
	private Map<String, String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public List<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(List<String> addresses) {
		Addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String name, Set<String> phones, List<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		Addresses = addresses;
		this.courses = courses;
	}
	public Emp() {
		super();
		
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", Addresses=" + Addresses + ", courses=" + courses + "]";
	}
	
	

}


