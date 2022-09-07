package com.web.EWord.test;

import java.util.Scanner;

public class testchan {

	public static String solution(String str) {

		String answer;
		
		char[] ch = str.toCharArray(); 

		int lt = 0;
		int rt = ch.length - 1;

	
		while (lt < rt) {
			if( (ch[lt] >= 97 && ch[lt] <= 122) || (ch[lt] <= 90 && ch[lt] >= 65) ) {
				lt++;
			}
			else if( (ch[rt] >= 97 && ch[rt] <= 122) || (ch[rt] <= 90 && ch[rt] >= 65) ) {
				rt--;
			}
			char tmp = ch[lt];
			ch[lt]=ch[rt];
			ch[rt]=tmp;
		}
		
		answer = String.valueOf(ch);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		
		System.out.println(solution(str));

	}

}