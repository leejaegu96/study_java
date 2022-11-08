package com.web.EWord.test1;

import java.util.Scanner;

public class test1103 {
	
	public String solution(int n, int[] arr, int[] arr1){
		
		
		String answer = "";
		for(int i=0; i<n;i++) {
			if(arr[i]-arr1[i] == 0) {
				answer += "D";
			}else if(arr[i]-arr1[i] == 1 || arr[i]-arr1[i] == -2) {
				answer += "A";
			}else {
				answer += "B";
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		test1103 T = new test1103();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int i=0; i<n; i++){
			arr1[i]=kb.nextInt();
		}
		for(char x : T.solution(n, arr, arr1).toCharArray()){
			System.out.println(x);
		}
	}
}
