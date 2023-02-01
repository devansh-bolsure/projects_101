package com.telusko.myhibo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity

public class Alien {
	
	@Id
	private int aid;
	private String aname;
	private String Planet;
	
	@OneToMany(mappedBy="alien", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Collection<Computer> comp = new ArrayList<Computer>();
	
	
	

	public Collection<Computer> getComp() {
		return comp;
	}
	public void setComp(Collection<Computer> comp) {
		this.comp = comp;
	}
	public String getPlanet() {
		return Planet;
	}
	public void setPlanet(String planet) {
		Planet = planet;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int id) {
		this.aid = id;
	}
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Alien(int aid, String aname, Collection<Computer> comp) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.comp = comp;
	}
	public Alien() {
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	
	}
	

