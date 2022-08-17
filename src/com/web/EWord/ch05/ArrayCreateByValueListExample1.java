package com.web.EWord.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88,99,45,86,34};
		
		String[] name = {"장원영", "장동건", "고소영"};
		
		System.out.println("명지님 화학성적 : " + scoreChemistry[0]);
		
		
		
		System.out.println("누굴까 : " + name[2]);
		
		
		double average = 0;
		for(int i=0;i<scoreChemistry.length;i++) {
			average += scoreChemistry[i];
			}
		System.out.println("화학 평균 점수는 " + average/scoreChemistry.length);
		 
			
		
	}

}
