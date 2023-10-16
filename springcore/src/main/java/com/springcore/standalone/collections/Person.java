package com.springcore.standalone.collections;

import java.util.*;

public class Person 
{
	private List<String>friends;
	private Map<String,Integer> feestructure;

	public List<String> getFriends()
	{
		return friends;
	}

	public void setFriends(List<String> friends) 
	{
		this.friends = friends;
	}
	
	

	public Map<String, Integer> getFeestructure() 
	{
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) 
	{
		this.feestructure = feestructure;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", "
				+"\nfeestructure=" + feestructure + "]";
	}

	public Person()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
