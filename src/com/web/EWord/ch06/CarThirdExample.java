package com.web.EWord.ch06;

public class CarThirdExample {

	public static void main(String[] args) {

		CarThird carThird = new CarThird();
		
		CarThird carThird2 = new CarThird("아이오닉",2000,"black");
		
		System.out.println("차 정보 : " + carThird.name + ", " + carThird.cc + "cc, " + carThird.color);
		
		System.out.println("차 정보 : " + carThird2.name + ", " + carThird2.cc + "cc, " + carThird2.color);
		
		CarThird carThird4 = new CarThird("소나타");
		CarThird carThird5 = new CarThird("그렌저", 3000);
		CarThird carThird6 = new CarThird("g80", 3000, "gray");
		CarThird carThird7 = new CarThird(3300);
		CarThird carThird8 = new CarThird(3300,"gv70");
		
		System.out.println(carThird4.name + " / " +  carThird4.cc + " / " + carThird4.color);
		System.out.println(carThird5.name + " / " + carThird5.cc + " / " + carThird5.color);
		System.out.println(carThird6.name + " / " + carThird6.cc + " / " + carThird6.color);
		System.out.println(carThird7.name + " / " + carThird7.cc + " / " + carThird7.color);
		System.out.println(carThird8.name + " / " + carThird8.cc + " / " + carThird8.color);
		
		
	}

}
