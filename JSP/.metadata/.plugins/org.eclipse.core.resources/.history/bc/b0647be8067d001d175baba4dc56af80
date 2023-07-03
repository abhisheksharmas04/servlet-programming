package com.ab.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	
	private String batId;

	public Cricketer(String batId) {
		this.batId=batId;
		System.out.println("Cricketer.Cricketer() :: 0-Param Constructor");
	}
	
	public void fielding() {
		System.out.println("Crickert is doing fielding of ball");
	}
	
	public void bowling() {
		System.out.println("Crickert is doing bowling of ball");
	}
	
	public void wicketKeeping() {
		System.out.println("Crickert is doing wicket Keeping of ball");
	}
	
	public void batting() {
		//create Extra IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/ab/cfg/applicationContext.xml");
		
		// perform dependency lookup to get dependent class object
		CricketBat bat = ctx.getBean(batId, CricketBat.class);
		
		// use dependent class object 
		int runs = bat.scoreRuns();
		
		System.out.println("Cricket is doing batting and his score is : " + runs);
		
		ctx.close();
		
	}

}
