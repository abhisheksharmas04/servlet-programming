package com.ab.bean;

public abstract class Cricketer {

	public abstract CricketBat createCricketBat();

	public Cricketer(String batId) {
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
		CricketBat bat = createCricketBat();

		// use dependent class object
		int runs = bat.scoreRuns();

		System.out.println("Cricket is doing batting and his score is : " + runs);

	}

}
