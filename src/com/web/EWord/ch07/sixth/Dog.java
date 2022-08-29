package com.web.EWord.ch07.sixth;

public class Dog extends Animal {
	
//	생성자
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("으르렁");
	}
	
	@Override
	public void sound(String aaa) {
		System.out.println("으르렁" + aaa);
	}
	

}
