package com.web.EWord.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class test1102 {
	
	public int solution(int n, int[] arr){
		int answer = 1;
		int aa = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>aa) {
				answer++;
				aa = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		test1102 T = new test1102();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}
