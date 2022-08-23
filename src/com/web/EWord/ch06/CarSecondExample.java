package com.web.EWord.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carSecond = new CarSecond();
		String color;

		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("White", 2500);
//		String color2 = "Red";
		
//		System.out.println("carSecond.color : " + color2);
		System.out.println("carSecond2.color : " + carSecond2.color);
		System.out.println("carSecond2.cc : " + carSecond2.cc);
		
		System.out.println("carSecond3.color : " + carSecond3.color);
		System.out.println("carSecond3.cc : " + carSecond3.cc);
		
		
		
	}

}
