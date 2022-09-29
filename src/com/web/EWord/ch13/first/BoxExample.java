package com.web.EWord.ch13.first;

public class BoxExample {
	
	public static void main(String[] args) {
//		Box box = new Box();
		
		Box<String> box = new Box<String>();
		// Box 객체 중에서 한개 즉 지네릭 타입은 String 으로 된 것 이다.
		// String t;
		box.set("장원영");
		String str = box.get();
		box.out();
		System.out.println("str: " + str);
		
		Box<Integer> box2 = new Box<Integer>();
		// t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
		
		Box<Double> box3 = new Box<Double>();
		box3.set(3.0); // set으로 데이터를 받아서
		Double number2 = box3.get(); // get 으로 사용하겠다.
		System.out.println("number: "+ number2);

	}
	
}
