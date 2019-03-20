package com.github.fac30ff.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the configuration of the spring context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//get bean from context
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach);
		//close context
		context.close();
	}

}
