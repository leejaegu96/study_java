package com.web.EWord.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		
		String[] name = {"1번", "2번", "3번", "4번", "5번"};
		String[] subject = {"국어", "영어", "수학"};
		
		
		System.out.println("scores[1][1]: " + scores[1][1]);
		System.out.println("scores[2][1]: " + scores[2][1]);
		System.out.println("scores[2][0]: " + scores[2][0]);
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		System.out.println("---------------------");
		
//		1. 개인의 평균
//		int a=0;
//		double average = 0;
//		for(int i=0;i<=4;i++) {
//			for(int j=0;j<=2;j++) {
//				a=a+scores[i][j];
//			}
//		}
		
		double average=0;
		double average2=0;
		double average3=0;
		double average4=0;
		double average5=0;
		for(int i=0;i<=4;i++) {
			if(i==0) {
				for(int j=0;j<=2;j++) {
					average+=scores[i][j];
				}
				average=average/3;
				System.out.println("1번님의 평균 : " + average);
			}else if(i==1) {
				for(int j=0;j<=2;j++) {
					average2+=scores[i][j];
				}
				average2=average2/3;
				System.out.println("2번님의 평균 : " + average2);
			} else if(i==2) {
				for(int j=0;j<=2;j++) {
					average3+=scores[i][j];
				}
				average3=average3/3;
				System.out.println("3번님의 평균 : " + average3);
			} else if(i==3) {
				for(int j=0;j<=2;j++) {
					average4+=scores[i][j];
				}
				average4=average4/3;
				System.out.println("4번님의 평균 : " + average4);
			} else if(i==4){
				for(int j=0;j<=2;j++) {
					average5+=scores[i][j];
				}
				average5=average5/3;
				System.out.println("5번님의 평균 : " + average5);
			}
		}
		
		System.out.println("---------------------");
		
		for(int i=0; i<scores.length;i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length;j++) {
				sum +=scores[i][j];
			}
			System.out.println(name[i]+"의 평균 점수는: " +((double)sum/scores[i].length));
		}
		
		System.out.println("---------------------");
		
//		2. 과목별 평균
		double avg = 0;
		double avg2 = 0;
		double avg3 = 0;
		
		for(int j=0;j<=2;j++) {
			if(j==0) {
				for(int i=0;i<=4;i++) {
					avg += scores[i][j];
				}
				avg=avg/5;
				System.out.println("국어의 평균 점수 : " + avg);
			} else if(j==1) {
				for(int i=0;i<=4;i++) {
					avg2 += scores[i][j];
				}
				avg2=avg2/5;
				System.out.println("영어의 평균 점수 : " + avg2);
			} else {
				for(int i=0;i<=4;i++) {
					avg3 += scores[i][j];
				}
				avg3=avg3/5;
				System.out.println("수학의 평균 점수 : " + avg3);
			} 
				
		}
		
		System.out.println("---------------------");
		
		for(int j=0; j<3;j++) {
			int sum = 0;
			for(int i=0; i<5;i++) {
				sum +=scores[i][j];
			}
			System.out.println(subject[j]+"의 평균 점수는: " +((double)sum/5));
		}
		
		System.out.println("---------------------");
		
		int[] sum2 = new int[3];
		
		for(int i=0; i<scores.length;i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum2[j] += scores[i][j];
			}
		}
		for(int i=0; i<sum2.length; i++) {
			System.out.println(subject[i]+" 과목의 평균 점수는: " +((double)sum2[i]/scores.length));
		}
		
	}

}
