package com.web.EWord.ch04;

public class IfExample {

	public static void main(String[] args) {

		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80 & score < 89) {
			System.out.println("B");
		} else if(score >= 70 & score < 79) {
			System.out.println("C");
		} else if(score >= 60 & score < 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		} 
		
	}

}