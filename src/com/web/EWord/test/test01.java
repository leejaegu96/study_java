package com.web.EWord.test;

import java.util.Scanner;

public class test01 {
	
	public static int solution(String str, char ch) {
		
		str.toUpperCase();
		Character.toUpperCase(ch);
		
		int answer = 0;
//		for(int i=0;i<str.length();i++) {
//			if(ch == str.charAt(i)) {
//				answer++;
//			}
//		}
		for(char x : str.toCharArray()) {
			if(x == ch) answer ++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char ch = scan.next().charAt(0);
		
		System.out.println(test01.solution(str, ch));
		
	}

}
