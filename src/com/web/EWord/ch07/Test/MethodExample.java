package com.web.EWord.ch07.Test;

public class MethodExample {

	public static void main(String[] args) {
		
		Method method = new Method();
		
		Method2 method2 = new Method2();
		
		int[] arr = {30, 20, 50 };
		
		System.out.println("정렬 전 ===============");
		method.printArr(arr);
		System.out.println("정렬 후 ===============");
		method.SortByAsc(arr);
		method.printArr(arr);
		
		System.out.println("부모 메서드2 =================");
		System.out.println(method.getSum(arr));
		
		System.out.println("자식 메서드2 =================");
		System.out.println(method2.getSum(arr));
		
		System.out.println("값 차이 =================");
		System.out.println(method.getSum(arr) - method2.getSum(arr));
		
		
		
	}

}
