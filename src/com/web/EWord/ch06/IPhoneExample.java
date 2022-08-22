package com.web.EWord.ch06;

public class IPhoneExample {

	public static void main(String[] args) {

//		. 연산자는 변수와 함수가 돌아가게끔 하는 것이다.
		
		IPhone iphone = new IPhone();
		
		System.out.println("iphone.name : " + iphone.name);
		System.out.println("iphone model : " + iphone.model[1]);
		
		iphone.pr();
		
		Car car = new Car();
		
		System.out.println("car.name : " + car.name);
		
		car.name = "람보르기니";
		
		System.out.println("car.name : " + car.name);
		
		HandBag handbag = new HandBag();
		
		System.out.println("내가 쓰고싶은 가방은 " + handbag.name + "이다.");
		
		
	}

}
