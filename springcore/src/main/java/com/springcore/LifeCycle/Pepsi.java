package com.springcore.LifeCycle;

import org.springframework.beans.factory.*;

public class Pepsi implements InitializingBean,DisposableBean 
{
	private double price;

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		System.out.println("setting pepsi price");
		this.price = price;
	}

	public Pepsi()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("taking pepsi: init");
		
	}
	
	public void destroy() throws Exception
	{
		System.out.println("pepsi is empty: destroy");
	}

	
	
}
