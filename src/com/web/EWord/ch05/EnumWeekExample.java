package com.web.EWord.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week abc;
		Week xyz;
		
//		abc = 1  -> x 
//		abc = "asdfadf"  -> x
//		abc = 1.1  -> x
		abc = Week.MONDAY;
		
		
		System.out.println("Week.FRIDAY : " + Week.FRIDAY);
		System.out.println("abc : " + abc);
		
//		String name = abc;
		String name = abc.name();
		System.out.println("name: " + name);
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal: " + ordinal);
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index + ": day: " + day);
			index++;
		}
		
		
	}

}
