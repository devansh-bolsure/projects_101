package com.pagination;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.myhibo.Alien;

public class HQLPegination {
	
	
	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s= factory.openSession();
		
		Query query=s.createQuery("from Alien");
		
		//implementing pagination using hibernate
		
		query.setFirstResult(2);
		query.setMaxResults(3);
		List<Alien> list=query.list();
		
		for(Alien a:list) {
			System.out.println(a.getAid()+":"+a.getAname()+":" +a.getPlanet());
		}
		
		s.close();
		
		factory.close();
		
		
		
		
		
		
	}

}
