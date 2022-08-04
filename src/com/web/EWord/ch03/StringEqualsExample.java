package com.web.EWord.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "이재구";
		String str2 = "이재구";
		String str3 = new String("이재구");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1= " + result1);		// true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2= " + result2);		// false

		System.out.println("str1.equals(str2): " + str1.equals(str2)); // == (x) true     1.equal(2) -> 문자열을 비교
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // == (x) true
		
		
	}

}
