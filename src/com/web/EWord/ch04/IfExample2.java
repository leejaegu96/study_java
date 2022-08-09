package com.web.EWord.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
//		일반:1, 5% 할인적용
//		브론즈:2, 10% 할인적용
//		실버:3, 15% 할인적용
//		골드:4, 20% 할인적용
//		플레티넘:5, 2.7% 할인적용
		
//		정가 : 할인가
		
//		int grade = 5;
//		int price = 10000;
//		
//		if (grade == 1) {
//			System.out.println("정가 : " + price + "원, " + "할인가 : " + (int)(price*(1-0.05)) + "원");
//		} else if (grade == 2) {
//			System.out.println("정가 : " + price + "원, " + "할인가 : " + (int)(price*(1-0.1)) + "원");
//		} else if (grade == 3) {
//			System.out.println("정가 : " + price + "원, " + "할인가 : " + (int)(price*(1-0.15)) + "원");
//		} else if (grade == 4) {
//			System.out.println("정가 : " + price + "원, " + "할인가 : " + (int)(price*(1-0.2)) + "원");
//		} else if (grade == 5) {
//			System.out.println("정가 : " + price + "원, " + "할인가 : " + (int)(price*(1-0.027)) + "원");
//		} else  {
//			System.out.println("1~5까지의 grade만 가능합니다.");
//		}
		
		int grade = 3;
		int price = 10000;
		double percent, sale;
		
		if(grade==1) {
			percent = 0.05;
			sale = price - price * percent;
			System.out.println("등급 : 일반 || 원가 : " + price + " || 할인가 " + (int)sale);
		} else if(grade==2) {
			percent = 0.1;
			sale = price - price * percent;
			System.out.println("등급 : 브론즈 || 원가 : " + price + " || 할인가 " + (int)sale);
		} else if(grade==3) {
			percent = 0.15;
			sale = price - price * percent;
			System.out.println("등급 : 실버 || 원가 : " + price + " || 할인가 " + (int)sale);
		} else if(grade==4) {
			percent = 0.20;
			sale = price - price * percent;
			System.out.println("등급 : 골드 || 원가 : " + price + " || 할인가 " + (int)sale);
		} else if(grade==5) {
			percent = 0.027;
			sale = price - price * percent;
			System.out.println("등급 : 플레티넘 || 원가 : " + price + " || 할인가 " + (int)sale);
		} else {
			System.out.println("등급이 존재하지 않습니다.");
		}
		
	}

}
