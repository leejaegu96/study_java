package com.web.EWord.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int resultsum = arithmetic.sum(4,2);
		int resultsubtraction = arithmetic.subtraction(4,2);
		int resultdivision = arithmetic.division(4,2);
		int resultmultiplication = arithmetic.multiplication(4,2);
		int resultRemainder = arithmetic.Remainder(4,2);
		
		arithmetic.say(resultsum);
		arithmetic.say(resultsubtraction);
		arithmetic.say(resultdivision);
		arithmetic.say(resultmultiplication);
		arithmetic.say(resultRemainder);
		
		
		String a ="가";
		String b ="나";
		arithmetic.combine(a,b);
		
		
		
		
	}

}
