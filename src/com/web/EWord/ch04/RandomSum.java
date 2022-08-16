package com.web.EWord.ch04;

public class RandomSum {

	public static void main(String[] args) {

//		double num1 = 1;
//		double num2 = 100;
//		int sum = 0, min = 0, max = 0;
//		
//		int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
//		int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
//		
//		if (random1 < random2) {
//			max = random2;
//			min = random1;
//		} else if (random1 > random2) {
//			max = random1;
//			min = random2;
//		} else {
//			System.out.println("서로 다른 값을 입력하세요");
//			return ;
//		}
//		System.out.println("min : " + min + ", " + "max : " + max);
//		
//		for (int i = min; i <= max; i++) {
//			sum = sum + i;
//			System.out.println(i + " : " + sum);
//		}
//		System.out.println("total : " + sum);
		
		int min = 1;
		int max = 100;
		int sum = 0;
		
		int random1 = (int) ((Math.random() * (max-min)) + min);
		int random2 = (int) ((Math.random() * (max-min)) + min);
		System.out.println("random1 : " + random1 + 
				", random2 : " + random2);
		
		if(random1 > random2) {
			for(int i = random2; i <= random1; i++) {
				sum = i + sum;
			} System.out.println("두 수 사이의 합은 : " + sum);
		}else if(random1 < random2) {
			for(int i = random1; i <=random2; i++) {
				sum = i + sum;
			} System.out.println("두 수 사이의 합은 : " + sum);
		}else {
			sum = random1 + random2;
			System.out.println("두 수 사이의 합은 : " + sum);
		} 
		
	}

}