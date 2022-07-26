package com.web.EWord.ch02;

public class Hello {

	public static void main(String[] args) {
		
		/*
		 * 데이터타입 변수명 = 값; 데이터타입 변수명
		 */
		
		boolean abc = true;
		boolean xyz;
		xyz = true;
		
		String name = "이재구";
		
		String myname = "JAEGU LEE";
		String mynickname = "JAEGU LEE";
		String job = "A student";
		String nationality = "South Korea";
		int age = 27;
		String address = "worncjfrn@gmail.com";
		String login = "you are connected with Google";
		
		System.out.println(name);
		System.out.println("name 변수에 들어가 있는 값은: " + name);
		System.out.println("저의 닉네임은 " + mynickname + "입니다.");
		System.out.println("저의 직업은 " + job + "입니다.");
		System.out.println("저의 국적은 " + nationality + "입니다.");
		System.out.println("저의 나이는 " + age + "입니다.");
		System.out.println("저의 이메일 주소는 " + address + "입니다.");
	}

}
