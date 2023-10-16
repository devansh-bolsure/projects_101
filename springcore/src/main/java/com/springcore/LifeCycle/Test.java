package com.springcore.LifeCycle;

import org.springframework.context.*;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		AbstractXmlApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/LifeCycle/LC_Config.xml");
//		
//		Samosa samosa=(Samosa) context.getBean("samosa");
//		System.out.println(samosa);
//		//registering shutdownhook
		context.registerShutdownHook();
//		
//		System.out.println("+++++++++++++++++++++++++++");
//		
//		Pepsi pepsi=(Pepsi) context.getBean("pepsi");
//		System.out.println(pepsi);
		
		Example example=(Example)context.getBean("example");
		System.out.println(example);
	}
}
