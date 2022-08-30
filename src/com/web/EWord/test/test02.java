package com.web.EWord.test;

import java.util.Scanner;

public class test02 {
	
	public static String solution(String str) {
		String answer = "";
		for(int i=0; i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				answer += Character.toUpperCase(str.charAt(i));
			} else {
				answer += Character.toLowerCase(str.charAt(i));
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.print(solution(str));
		
	}

}
