package com.springcore.LifeCycle;

public class Samosa 
{
	private int Price;

	public int getPrice() 
	{
		return Price;
	}

	public void setPrice(int price) 
	{
		System.out.println("Setting samosa price");
		Price = price;
	}

	
	
	public Samosa() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "Samosa [Price=" + Price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("inside destroy method");
	}
	
	
	
	
}
