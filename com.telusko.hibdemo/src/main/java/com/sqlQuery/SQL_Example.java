package com.sqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.myhibo.Alien;

public class SQL_Example {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		
		//Sql query
		
		String q= "Select * from Alien";
		SQLQuery nq= s.createSQLQuery(q);
		List<Object []> list= nq.list();
		
		for(Object [] a:list) {
			
			System.out.println(a[1]+":"+a[2]);
		}
		
 
		s.close();
		factory.close();
		
	}

}

