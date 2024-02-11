package com.smart.entities;

import java.util.*;



import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "USER")
public class User 
{
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message = "Name field must not be empty")
	@Size(min = 5,max = 20,message = "min 5 and max 20 characters are allowed!!")
	private String name;
	@NotBlank(message = "Email field must not be empty")

	@Email(regexp =
			"^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}"
			+ "\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))"
			+ "([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$")
	private String email;
	@NotBlank(message = "Password field must not be empty")
	
	private String password;
	private String role;
	private String imageurl;
	@Column(length = 50000)
	private String about;
	private boolean enabled;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user",orphanRemoval = true)
	private List<Contact>contact=new ArrayList<>();
	
	public User()
	{
		super();
	}
	
	public List<Contact> getContact() {
		return contact;
	}



	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}



	public int getId() 
	{
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) {
		
		this.password = password;
	}

	public String getRole() 
	{
		return role;
	}

	public void setRole(String role) 
	{
		this.role = role;
	}

	public String getImageurl()
	{
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		
		this.imageurl = imageurl;
	}

	public String getAbout() 
	{
		return about;
	}

	public void setAbout(String about) 
	{
		this.about = about;
	}

	


	public boolean isEnabled() {
		return enabled;
	}



	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", imageurl=" + imageurl + ", about=" + about + ", enabled=" + enabled + ", contact=" + contact + "]";
	}

	
	
	
	
}
