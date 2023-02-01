package com.telusko.myhibo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Computer {
	
	@Id
	private int lid;
	private int price;
	private String brand;
	@ManyToOne
	private Alien alien;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Alien getAlien() {
		return alien;
	}
	public void setAlien(Alien alien) {
		this.alien = alien;
	}
	public Computer(int lid, int price, String brand, Alien alien) {
		super();
		this.lid = lid;
		this.price = price;
		this.brand = brand;
		this.alien = alien;
	}
	
	
	
	@Override
	public String toString() {
		return "Computer [lid=" + lid + ", price=" + price + ", brand=" + brand + ", alien=" + alien + "]";
	}
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
