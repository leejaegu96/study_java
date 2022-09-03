package com.web.EWord.test;

import java.util.Scanner;

public class test04_chan {

	public static String[] solution(String[] arr, int x) {
		String[] answer = new String[x];
		//String answer = "success";
//		
//		for(String ab : arr) {
//			
//			for(int y = 0; y <= x; y++) {
//				
//				String word = "";
//				
//				for (int i = 0; i < ab.length(); i++) {
//					
//					answer[y]= word + ab.charAt( ab.length()- (i+1));
//
//				}
//			}		
//		}

		
		
		for (int y = 0; y < x; y++) {
			String word = "";
			
			for(int c = 0; c < arr[y].length(); c++) {
				word = word + arr[y].charAt(arr[y].length()-(c+1));
				
				if(c+1 == arr[y].length()) {
					answer[y] = word;
				}
			}			
		}
		
	
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();									// 인트를 받는다
		String[] str = new String[num];							// 문자를 입력 받는다
		
		int k = 0;												// 아직 안쓰임
	
		for(String x : str) {									//  									
				//for(int l = 0; l < num; l++)
				x = kb.next();				
				str[k]= x;
				k++;	
		}
		
		String[] answer = solution(str, num);
		
		int j = 0;
		for(String t: answer) {
			System.out.println(answer[j]);
			j++;
		}

	}
	
}
