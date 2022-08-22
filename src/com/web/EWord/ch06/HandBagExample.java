package com.web.EWord.ch06;

public class HandBagExample {

	public static void main(String[] args) {

		HandBag handbag = new HandBag();
		
		System.out.println("내가 쓰고싶은 가방은 " + handbag.name + "이다.");
		
		Car car = new Car();
		
		System.out.println("car.name : " + car.name);
		
		car.name = "람보르기니";
		
		System.out.println("car.name : " + car.name);
		
		
	}

}
