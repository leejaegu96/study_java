package com.web.EWord.ch07.sixth;

public class AnimalExample {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound();
		dog.sound();
		System.out.println("------------");
		cat.sound("이야옹");
		dog.sound("멍멍");
		
	}

}
