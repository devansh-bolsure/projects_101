package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.myhibo.Alien;
import com.telusko.myhibo.Computer;

public class CascadeExample {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session s= factory.openSession();
		
		Alien a1= new Alien();
		
		a1.setAid(452);
		a1.setAname("Goku");
		
		
		Computer c1= new Computer(2344,51679, "Asus", a1);
//		c1.setAlien(a1);
		Computer c2= new Computer(1235, 51345, "Devil", a1);
//		c2.setAlien(a1);
		Computer c3= new Computer(1247, 51678, "Lenovo", a1);
//		c3.setAlien(a1);
		List<Computer> list= new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		a1.setComp(list);
		Transaction tx= s.beginTransaction();
	    
		System.out.println("ok");
		s.save(a1);
		System.out.println("stillok");
		
//		s.merge(c1);
//		System.out.println("ok2");
//		s.merge(c2);
//		System.out.println("ok3");
//		s.merge(c3);
//		System.out.println("ok4");
//		
		
		
		tx.commit();
		
		s.close();
		factory.close();
	}
	
	
	

}
