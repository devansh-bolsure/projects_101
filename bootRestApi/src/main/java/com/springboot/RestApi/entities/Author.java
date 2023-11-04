package com.springboot.RestApi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "Author_Details")
public class Author 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	private String firstname;
	private String lastname;
	private String language;
	
	@OneToOne(mappedBy = "author")
	@JsonBackReference
	private Books book;
	
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	public int getAuthorId()
	{
		return authorId;
	}
	public void setAuthorId(int authorId) 
	{
		this.authorId = authorId;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname) 
	{
		this.lastname = lastname;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language) 
	{
		this.language = language;
	}
	public Author(int authorId, String firstname, String lastname, String language,Books book) 
	{
		super();
		this.authorId = authorId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.language = language;
		this.book=book;
	}
	public Author() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstname=" + firstname + ", lastname=" + lastname + ", language="
				+ language + ", book=" + book + "]";
	}
	
	
	
}
