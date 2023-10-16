package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.*;

public class Emp 
{
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public Emp() 
	{
		super();
	
	}

	public Emp(Address address) 
	{
		super();
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Emp [address=" + address + "]";
	}
	
	
	
	
}
