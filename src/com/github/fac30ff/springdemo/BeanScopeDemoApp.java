package com.github.fac30ff.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach anotherCoach = context.getBean("myCoach", Coach.class);
		
		//compare object reference
		boolean equals = (coach == anotherCoach);
		System.out.println("\nPointing to the same object " + equals);
		System.out.println("\nMemory location for the coach " + coach);
		System.out.println("\nMemory location for the anotherCoach " + anotherCoach);
		
		//close the context
		context.close();
	}

}
