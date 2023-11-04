package com.springboot.web;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;

@SpringBootApplication
public class SpringWebSecondApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringWebSecondApplication.class, args);
		
		UserRepository bean = context.getBean(UserRepository.class);
		
		//creating object of user
//		User user=new User();
//		user.setId(234);
//		user.setName("Devansh");
//		user.setCity("Latur");
//		user.setStatus("UnEmployed");
		
//		User user1=new User();
//		user1.setId(556);
//		user1.setName("luffy");
//		user1.setCity("fusha village");
//		user1.setStatus("pirate");
//		
//		User user2=new User();
//		user2.setId(456);
//		user2.setName("Shanks");
//		user2.setCity("west blue");
//		user2.setStatus("Emperor");
		
//		//save multiple objects
//		List<User> list= List.of(user1,user2);
//		Iterable<User> iterable = bean.saveAll(list);
////		List<User> iterable = (List<User>) bean.saveAll(list);
//		
//		iterable.forEach(user->
//		{
//			System.out.println(user);
//		});
		
//		System.out.println(user1);
		
		//Update user detail by id
		
//		Optional<User> optional = bean.findById(2);
//		User user=optional.get();
//		user.setStatus("Emperor");
//		User user1 = bean.save(user);
//		
//		System.out.println(user1);
		
		
		//get data by
		//findById -returns optional containing your data
		Iterable<User> itr = bean.findAll();
//		Iterator<User> iterator = itr.iterator();
		
//		while(iterator.hasNext())
//		{
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
//		itr.forEach(user->{System.out.println(user);});//use curly bracket for multiple lines-This is lambda function
		
//		List<User> user = bean.findByCityAndStatus("fusha village", "Emperor");
		
		List<User> alluser = bean.getAllUser("shanks");
		alluser.forEach(user->
		{
			System.out.println(user);
		});
		
//		System.out.println(user);
		
		System.out.println("Done");
		
		
	}

}
