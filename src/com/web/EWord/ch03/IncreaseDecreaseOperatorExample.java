package com.web.EWord.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {

//		++ / -- 피연산자 : 다른 연산 수행 전에 피연사 1증가 / 감소
//		피연산자 ++ / --  : 다른 연산 수행 후에 피연사 1증가 / 감소
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
//		int 변수 a,b를 선언하고 초기값으로 1을 넣어 준다.
//		a 앞에 감소연산
//		b 뒤에 감소연산
//		두 변수의 결과를 출력
		int a = 1;
		int b = 1;
		--a;
		b--;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
//		int 변수 k선언 후 초기값으로 i뒤에 증감 연산
		int k = i++;
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		
		int m = ++j;
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		
		
		// j = 2
		// j = 2
		int z = ++i + j++;		//i = 3, j = 2, z = 5
		
		// z = 5
		
		System.out.println("z: " + z);		// 5 
		System.out.println("i: " + i);		// 3
		System.out.println("j: " + j);		// 3
		
	}

}
