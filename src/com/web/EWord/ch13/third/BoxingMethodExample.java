package com.web.EWord.ch13.third;

import com.web.EWord.ch13.first.Box;

public class BoxingMethodExample {

	public static void main(String[] args) {
//		Box<String> box = new Box<String>();
		
		Box<Integer> box = Util.<Integer>boxing(100);
		int rtInt = box.get();
		
		System.out.println("rtInt: " + rtInt);
		
		Box<String> box2 = Util.<String>boxing("Tony");
		String rtString = box2.get();
		
		System.out.println("rtString: " + rtString);
	}

}
