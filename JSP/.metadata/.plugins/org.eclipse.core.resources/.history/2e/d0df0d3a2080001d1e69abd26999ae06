package com.ab.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Cricketer implements ApplicationContextAware{
	
	private String batId;
	private ApplicationContext ctx;

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
		// perform dependency lookup to get dependent class object
		CricketBat bat = ctx.getBean(batId, CricketBat.class);

		// use dependent class object
		int runs = bat.scoreRuns();

		System.out.println("Cricket is doing batting and his score is : " + runs);

	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx = ctx;
	}

}
