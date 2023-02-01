package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.myhibo.Alien;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;


public class HQL_example {
	
	
	public static void main(String[] args) {
		
		
Configuration con = new Configuration().configure("hibernate.cfg.xml");
        
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory factory= con.buildSessionFactory();
        
        Session s= factory.openSession();
        //HQL
        //Syntax:
        String query="from Alien as a where a.Planet=:x and a.aname=:n";
           
        Query q=  s.createQuery(query);
        
       q.setParameter("x", "uranus");
       q.setParameter("n", "ronaldo");
        
        //single-(unique result it iis called)= q.uniueresult();
        //multiple- list
        
        List<Alien> list= q.list();
        
        for(Alien alien1:list) {
        	
        	System.out.println(alien1.getAname()+" : "+alien1.getAid());
        }
        
       
        System.out.println("---------------------------");
        
        Transaction tx= s.beginTransaction();
//      Delete Query
//      Query q2= s.createQuery("delete from Alien as a where a.Planet=:p");
//        
//      q2.setParameter("p","uranus");
//        
//	    int r= q2.executeUpdate();
//	    System.out.println("deleted");
//	    System.out.println(r);

//        Update Query
        
        Query q2= s.createQuery("update from Alien set Planet=:p where aname=:n");
        q2.setParameter("p", "earth");
        q2.setParameter("n", "Devansh");
        
        int r= q2.executeUpdate();
        System.out.println(r+" objects Updated");
        
        tx.commit();
	    
        s.close();
        
        factory.close();
        
	}

}
