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
		
		for(int i = 1; i <= 5; i++) {
			for(int x = 1; x <= 10; x++) {
				System.out.print("*");
				if(x ==10) {
					System.out.printf("%n");
				}
			}
		}
		System.out.println("==================");
		//**********
		//*        *
		//*        *
		//*        *
		//**********
		//출력하는 프로그램을 만드세요
		
		for(int a = 1; a <= 5; a++) {
			if(a == 1 | a == 5) {
				for (int b=1; b <= 10; b++) {
					System.out.print("*");
					if(b ==10) {
						System.out.printf("%n");
					}
				}
			} else {
				for(int c=1; c <= 10; c++) {
					if (c==1 | c== 10) {
						System.out.print("*");
						if (c ==10) {
							System.out.printf("%n");
						}
					} else {
						System.out.print(" ");
					}
				}
			}
		}
		
		System.out.println("========================");
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

		String save = "";
		
		for(int z = 1; z <= 10; z++) {
			if (z != 10) {
				System.out.println(save+z);
				save =save + Integer.toString(z);
			} else {
				for(int z1 = 1; z1 <=10; z1++) {
					if (z1%2 != 0) {
						System.out.print(z1);
						if(z1 == 9) {
							break;
						}
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			}
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
				if(j==10) {
					System.out.printf("%n");
				}
			}
		}
		
	}

}
