package com.web.EWord.ch04;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**********
		//**********
		//**********
		//**********
		//**********
		//출력하는 프로그램을 만드세요
		
//		for(int i = 1; i <= 5; i++) {
//			for(int x = 1; x <= 10; x++) {
//				System.out.print("*");
//				if(x ==10) {
//					System.out.printf("%n");
//				}
//			}
//		}
//		System.out.println("==================");
		
		//**********
		//*        *
		//*        *
		//*        *
		//**********
		//출력하는 프로그램을 만드세요
		
//		for(int a = 1; a <= 5; a++) {
//			if(a == 1 | a == 5) {
//				for (int b=1; b <= 10; b++) {
//					System.out.print("*");
//					if(b ==10) {
//						System.out.printf("%n");
//					}
//				}
//			} else {
//				for(int c=1; c <= 10; c++) {
//					if (c==1 | c== 10) {
//						System.out.print("*");
//						if (c ==10) {
//							System.out.printf("%n");
//						}
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//		}
//		
//		System.out.println("========================");
		
		//1
		//12
		//123
		//1234
		//12345
		//123456
		//1234567
		//12345678
		//123456789
		//1 3 5 7 90
		//출력하는 프로그램을 만드시오

//		String save = "";
//		
//		for(int z = 1; z <= 10; z++) {
//			if (z != 10) {
//				System.out.println(save+z);
//				save =save + Integer.toString(z);
//			} else {
//				for(int z1 = 1; z1 <=10; z1++) {
//					if (z1%2 != 0) {
//						System.out.print(z1);
//						if(z1 == 9) {
//							break;
//						}
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println("0");
//			}
//		}
		
//		for(int i=1;i<=10;i++) {
//			if(i==10) {
//				for(int j=1;j<=i;j++) {
//					if(j%2==1) {
//						System.out.print(j);
//					}else if(j==10) {
//						System.out.print("0");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}else {
//				for(int j=1;j<=i;j++) {
//					System.out.print(j);
//				}
//				System.out.printf("%n");
//			}
//		}
		
		
		//**********
		//**********
		//**********
		//**********
		//**********
		//출력하는 프로그램을 만드세요
		
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=10;i++) {
				System.out.print("*");
				if(i == 10) {
					System.out.printf("%n");
				}
			}
		}
		
		System.out.println("----------------");
		
		//**********
		//*        *
		//*        *
		//*        *
		//**********
		//출력하는 프로그램을 만드세요
		
		for(int i=1;i<=5;i++) {
			if(i==1 || i==5) {
				for(int j=1;j<=10;j++) {
					System.out.print("*");
					if(j==10) {
						System.out.printf("%n");
					}
				}
			}else {
				for(int k=1;k<=10;k++) {
					if(k==1 || k==10) {
						System.out.print("*");
						if(k==10) {
							System.out.printf("%n");
						}
					}else {
						System.out.print(" ");
					}
				}
			}
		}
		
		//1
		//12
		//123
		//1234
		//12345
		//123456
		//1234567
		//12345678
		//123456789
		//1 3 5 7 90
		//출력하는 프로그램을 만드시오
		
		for(int i=1;i<=10;i++) {
			if(i==10) {
				for(int j=1;j<=i;j++) {
					if(j%2==1) {
						System.out.print(j);
					}else if(j==10) {
						System.out.println("0");
					}else {
						System.out.print(" ");
					}
				}
			}else {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.printf("%n");
			}
		}
		
		System.out.println("----------------");
		
//		피라미드형 구조
		int a;
		int b;
		int c;
		int num = 5;
		for(a=0;a<num;a++) {
			for(b=1;b<num-a;b++) {
				System.out.print(" ");
			}
			for(c=0;c<a*2+1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
