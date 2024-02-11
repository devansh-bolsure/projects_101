package com.smart.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "CONTACT")
public class Contact 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	@Column(unique = true)
	private String phone;
	private String name;
	private String secondname;
	@Column(unique = true)
	private String email;
	private String work;
	private String image;
	@Column(length = 10000)
	private String description;
	
	@ManyToOne()
	@JsonIgnore
	private User user;
	
	
	
	public User getUser()
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}

	public Contact() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() 
	{
		return cid;
	}

	public void setCid(int cid) 
	{
		this.cid = cid;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSecondname() 
	{
		return secondname;
	}

	public void setSecondname(String secondname)
{
		this.secondname = secondname;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
		
	}

	public String getWork() 
	{
		return work;
	}

	public void setWork(String work) 
	{
		this.work = work;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", phone=" + phone + ", name=" + name + ", secondname=" + secondname + ", email="
				+ email + ", work=" + work + ", image=" + image + ", description=" + description + "]";
	}
	
	@Override
	public boolean equals(Object object)
	{
		return this.cid==((Contact)object).getCid();
	}

	
	
	
}
