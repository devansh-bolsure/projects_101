package com.telusko.myhibo;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    Alien a = new Alien();
    a.setAname("Goku");
    a.setAid(1);
    a.setPlanet("Earth");
//    	
    Computer laptop1 = new Computer();
	laptop1.setLid(106);
	laptop1.setBrand("haki");
	laptop1.setPrice(52000);
	laptop1.setAlien(a);
//
//	 Laptop laptop2 = new Laptop();
//	laptop2.setLid(102);
//	laptop2.setBrand("HP");
//	laptop2.setPrice(48000);
//	laptop2.setAlien(a);

//	Laptop laptop3 = new Laptop();
//	laptop3.setLid(103);
//	laptop3.setBrand("ASUS");
//	laptop3.setPrice(60000);
//	laptop3.setAlien(a);
//		
//	Laptop laptop4 = new Laptop();
//	laptop4.setLid(104);
//	laptop4.setBrand("ACER");
//	laptop4.setPrice(55000);
//	laptop4.setAlien(a);
//////			 
//	Computer laptop5 = new Computer();
//	laptop5.setLid(105);
//	laptop5.setBrand("APPLE");
//	laptop5.setPrice(100000);
//	laptop5.setAlien(a);
//        
				
//		List<Laptop> list = new ArrayList<Laptop>();
//		list.add(laptop2);
////		list.add(laptop4);
//		list.add(laptop1);
//		a.setLaps(list);
        
				
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Computer.class).addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
       Session s = sf.openSession();
        
        s.beginTransaction();
//        
       s.save(a);
////   s.save(laptop3);
       s.save(laptop1);
//     s.save(laptop5);
        
//        Alien a1 = (Alien)s.get(Alien.class, 1);
//        
//        System.out.println(a1.getAid());
//        System.out.println(a1.getAname());
       
//        LAZY Loading
        
//        System.out.println(a1.getLaps().size());
//        System.out.println(a1.getAname());
//        
//        for(Laptop a:a1.getLaps())
//        {
//        	System.out.println(a.getBrand());
//        	
//        }
//        
        s.getTransaction().commit();
        
        s.close();
        sf.close();
        
      
    }
}
