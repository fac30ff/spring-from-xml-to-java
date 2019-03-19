package com.github.fac30ff.springdemo;

public class BaseballCoach implements Coach{
	//define a private field for dependency
	private FortuneService fortuneService;
		
	public BaseballCoach() {
		super();
	}

	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
