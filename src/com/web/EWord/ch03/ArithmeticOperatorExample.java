package com.web.EWord.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

//		int 변수 v1 에 초기값 5
//		int 변수 v2 에 초기값 2
		int v1 = 5;
		int v2 = 2;

//		int 변수 result1 에 + 연산 후 출력
//		int 변수 result2 에 - 연산 후 출력
//		int 변수 result3 에 * 연산 후 출력
//		int 변수 result4 에 / 연산 후 출력
//		int 변수 result5 에 % 연산 후 출력
		
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		int result2 = v1 - v2;
		System.out.println("result2: " + result2);
		int result3 = v1 * v2;
		System.out.println("result3: " + result3);
		int result4 = v1 / v2;
		System.out.println("result4: " + result4);
		int result5 = v1 % v2;
		System.out.println("result5: " + result5);
		
		double result6 = v1 / v2;
		System.out.println("result6: " + result6);
		
		double result7 = (double) v1 / v2;
		System.out.println("result7: " + result7);
		
		
//		----------------------------
		
		
		double a1 = (1+2/3-5/8) * (9+4/5);
		System.out.println(a1);
		
		double a2 = 5-(3.25-(1+5/6))*(12/17);
		System.out.println(a2);
		
		
		int a3=8;
		int a4=7;
		int a5=5;
		int result11=a3+a4+a5;
		System.out.println(result11);
		
		int b1=1;
		int b2=9;
		int b3=5;
		int result12=b1+b2+b3;
		System.out.println(result12);
		
		int c1=5;
		int c2=6;
		int c3=6;
		int result13=c1+c2+c3;
		System.out.println(result13);
		
		int d1=4;
		int d2=7;
		int d3=1;
		int result14=d1+d2+d3;
		System.out.println(result14);
		
		int e1=7;
		int e2=5;
		int e3=5;
		int result15=e1+e2+e3;
		System.out.println(result15);
		
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		avg("홍길동",60,70,85,90,45);
		avg("박말순",50,75,70,60,70);
		avg("고장난",55,60,64,58,90);
		avg("도룡뇽",80,70,63,88,78);
		
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c) );
	}
	
//	이름을 적을때 aa이런거 쓰지말고 이름을 적기 ex - name, english
//	점수는 double말고 int로 적고, 평균은 double로 캐스팅하기
	public static void avg(String name, int english, int math, int physics, int music, int athletic) {
		System.out.println("이름 :" + name + ", 영어 :" + english + ", 수학 :" + math + ", 물리 : " + physics + ", 음악 :" + music + ", 체육 :" + athletic + ", 평균 : " + (double)(english + math + physics + music + athletic)/5);
	}
	
}
