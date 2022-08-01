package com.web.EWord.ch02;

public class CastingExample {

	public static void main(String[] args) {

		// 강제 형변환 : casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567891;
		System.out.println("doubleValue2: " + doubleValue2);
		
		// float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue);
		
		// long <- float
		long longValue = (long) floatValue;
		System.out.println("longValue :" + longValue);
		
		// int <- long
		int intValue = (int) longValue;
		System.out.println("intValue :" + intValue);
		
		// short <- int
		short shortValue = (short) intValue;
		System.out.println("longValue :" + shortValue);
		
		// byte <- short
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue :" + byteValue);
		

		
		// string을 int로 변환
//		String stringValue2 = "123";
//		int intValue2 = Integer.parseInt(stringValue2);
		String stringValue2 = String.valueOf(intValue);
		System.out.println("stringValue2: " + stringValue2);
		
		// int를 string으로 변환
//		int intValue1 = 123;
//		String stringValue = Integer.toString(intValue1);
		int intValue2 = Integer.parseInt(stringValue2);
		System.out.println("intValue2: " + intValue2);
		
//		System.out.println(stringValue2);
		
	}

}
