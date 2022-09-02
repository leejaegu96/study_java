package com.web.EWord.test;

public class Computer extends Calculator{

	@Override
	public double areaCircle(double param) {
		
		return Constants.PAI_2() * param * param;
	}
	
}
