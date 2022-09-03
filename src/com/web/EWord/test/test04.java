package com.web.EWord.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test04 {

	public ArrayList<String> solution(int n, String[] str) {
		
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp=new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
//		for(int i = str.length()-1; i>=0;i--) {
//			char target;
//			target = str.charAt(i);
//			System.out.print(target);
//		}
		
		
		return answer;

	}

	public static void main(String[] args) {
		
		test04 T = new test04();

		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n,str)) {
			System.out.println(x);
		}
		
	}

}
