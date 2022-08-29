package com.web.EWord.ch07.fifth;

public class SmartPhoneExample {

	public static void main(String[] args) {

//		abstract는 기본생성자 없어야 함. 
//		Phone phone = new Phone();
		
		
		SmartPhone smartPhone = new SmartPhone("asdf");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
		
	}

}
