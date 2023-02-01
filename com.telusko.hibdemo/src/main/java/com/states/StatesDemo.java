package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class StatesDemo {
	public static void main(String[] args) {
		
		//practical of hibernate states;
		//Transient
		//Persistent
		//Detached
		//Removed
		System.out.println("Example:");
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory f = con.buildSessionFactory(reg);
        		
		
		//Creating laptop object
		
		Laptop laptop = new Laptop();
		laptop.setLid(1);
		laptop.setBrand("DELL");
		laptop.setPrice(50000);
		//Student:Transient
		
		
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(laptop);
		//Student:Persistent - session,Database
		laptop.setBrand("ASUS");
		tx.commit();
		
		s.close();
		//students:Detached
		laptop.setBrand("ACER");
		
		//below is printed but not shown in database
		System.out.println(laptop);
		
		f.close();
	}

}
