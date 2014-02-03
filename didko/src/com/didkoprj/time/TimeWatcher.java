package com.didkoprj.time;

/**
 * 		This class contains current game-time, and controls it
 **/

public class TimeWatcher {

	private final static int DAYS_PER_MONTH = 3;
	
	/*
	 * Number of the last day in the year / how many days are in the year
	 * 4 seasons * 3 month * DAYS_PER_MONTH
	 */
	private final static int MAX_DAY = 4 * 3 * DAYS_PER_MONTH; 
	
	/*
	 * Current day relatively the month: {0, 1, ... DAYS_PER_MONTH}
	 */
	private static int currentDay = 0;
	private static int currentMonth = 0;
	private static int currentYear = 612;
	
	/*
	 * Day or night?
	 */
	private static boolean isDay = false;
	private static Season season = Season.SPRING;
	
	private TimeWatcher() {
	}
	
	public static boolean isDay() {
		return isDay;
	}
	
	/*
	 * Returns current day relatively the month
	 */
	public static int getDay() {
		return currentDay;
	}
	
	/*
	 * Returns current day relatively the year
	 */
	public static int getAbsoluteDay() {
		return DAYS_PER_MONTH * currentMonth + currentDay;
	}
	
	public static int getMonth() {
		return currentMonth;
	}
	
	public static Season getSeason() {
		return season;
	}
	
	public static int getYear() {
		return currentYear;
	}
	
	/*
	 * Changes current time when time to new turn comes
	 */
	public static void nextTurn() {
		
		
		if(isDay) {
			
			isDay = false;
			currentDay++;
			
			if(currentDay == DAYS_PER_MONTH) {
				currentDay = 0;
				currentMonth++;
				
				if(currentMonth == 12) {
					currentMonth = 0;
					currentYear++;
				}
				
				if(currentMonth < 3) {
					season = Season.SPRING;
				}
				if(currentMonth > 2 && currentMonth < 6) {
					season = Season.SUMMER;
				}
				if(currentMonth > 5 && currentMonth < 9) {
					season = Season.AUTUMN;
				}
				if(currentMonth > 8 && currentMonth < 12) {
					season = Season.WINTER;
				}
			}
			
		} 
		else {
			isDay = true;
		}	
	}
	
	public static String getString() {
		String day = null;
		if(isDay) {
			day = " day,   ";
		}else {
			day = " night, ";
		}
		return new String("Current time: " + day + currentDay + " day, "
				+ currentMonth + " month, " + season + " season, "
				+ currentYear + " year.");
	}
	
	
	
}
