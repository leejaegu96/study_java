package com.web.EWord.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

//		int min = 1;
//		int max = 100;
//		int sum = 0;
//		
//		int random1= (int)((Math.random() * (max-min)) + min);
//		int random2= (int)((Math.random() * (max-min)) + min);
//		System.out.println("랜덤한 숫자1: " + random1 + ", 랜덤한 숫자2: "+ random2);
//		
//		if(random1>random2) {
//			for(int i = random2; i<=random1;i++) {
//				sum = sum + i;
//			}System.out.println("두 수 사의 합 :" + sum);
//			
//		}else if(random1<random2) {
//			for(int i = random1; i <= random2; i++) {
//				sum = sum + random1;
//			}System.out.println("두 수 사의 합 :" + sum);
//		}else {
//			System.out.println("두 수 사의 합 :" + random1 + random2);
//		}
		
		double num1 = 1;
		double num2 = 100;
		int sum = 0, min = 0, max = 0; 
		
		int random1= (int)((Math.random() * (num2-num1)) + num1);
		int random2= (int)((Math.random() * (num2-num1)) + num1);
		
		if(random1 > random2) {
			max = random1;
			min = random2;
		} else if(random1 < random2) {
			max = random2;
			min = random1;
		} else {
			System.out.println("서로 다른 값을 입력하세요");
		}
		System.out.println("min :" + min + ", max : " + max);
		
		for (int i = min; i <= max; i++) {
			sum = sum + i;
			System.out.println(i + " : " + sum);
		}
		System.out.println("total : " + sum);
	}

}