package com.github.fac30ff.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the object
		Coach bCoach = new BaseballCoach();
		Coach tCoach = new TrackCoach();
		//use the object
		System.out.println(bCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyWorkout());
	}

}
