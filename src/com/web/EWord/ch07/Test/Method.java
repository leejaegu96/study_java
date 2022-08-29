package com.web.EWord.ch07.Test;

import java.util.Arrays;

public class Method {
	
//	public void rise(int first, int second, int third) {
//		if(first > se cond && second > third) {
//			System.out.println(first + ", " + second + ", " + third);
//		} else if()
	
//	Method method = new Method(); {
//		int[] nums = new int[3];
//		for(int a = 0; a < 3; a++) {
//			nums[a] = method.nextInt();
//		}
//		Arrays.sort(nums);
//	}
//	
//	protected int nextInt() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	int sum = 0;
	int[] arr = new int[3];
	
	public void SortByAsc(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j=0; j < arr.length-1; j++) {
				
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public int getSum(int arr[]) {
		sum = (arr[0] * arr[1]) + arr[2];
		return sum;
	}
	
	public void printArr(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println(" ");
	}
		
	
	
}
