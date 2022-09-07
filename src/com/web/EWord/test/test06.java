package com.web.EWord.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test06 {
	public static String solution(String str) {
		String answer = "";
		
		char[] ch = str.toCharArray();
		int lt = 0;
		
		for(int i=0;i<ch.length-1;i++) {
			if(ch[lt] == ch[i]) {
				str = str.replace(ch[lt], ' ');
			}
			
		}
			
			
		
		
		
		answer = String.valueOf(ch);
		return answer;
		
//		while(lt<rt) {
//			if(!Character.isAlphabetic(s[lt])) lt++;
//			else if(!Character.isAlphabetic(s[rt])) rt--;
//			else {
//				char tmp = s[lt];
//				s[lt]=s[rt];
//				s[rt]=tmp;
//				lt++;
//				rt--;
//			}
//			
//		}
//			answer = String.valueOf(s);
//			return answer;
//		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		System.out.println(solution(str));
		
		
	}

}
