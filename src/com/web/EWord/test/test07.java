package com.web.EWord.test;

import java.util.Scanner;

public class test07 {
	
	public static String solution(String str) {
		
		String answer = "";
		
		char[] ch = str.toUpperCase().toCharArray();
		
		int lt = 0;
		int rt = ch.length-1;
		
		
		while (lt < rt) {
			if(ch[lt] == ch[rt]) {
				lt++;
				rt--;
				answer = "YES";
			} else {
				answer = "NO";
				break;
			} 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		
		System.out.println(solution(str));
		
	}

}
