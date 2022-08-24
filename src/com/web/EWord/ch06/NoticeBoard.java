package com.web.EWord.ch06;

public class NoticeBoard {
	
	String name = "1번 게시물";
	int views = 100;
	boolean useNy = true;
	
	NoticeBoard() {
		
	}
	
	NoticeBoard(String name) {
		this.name=name;
	}
	
	NoticeBoard(String name, int views) {
		this.name=name;
		this.views=views;
	}
	
	NoticeBoard(String name, boolean useNy) {
		this.name=name;
		this.useNy=useNy;
	}
	
	NoticeBoard(String name, int views, boolean useNy) {
		this.name=name;
		this.views=views;
		this.useNy=useNy;
	}
	
	public void say() {
		System.out.println("이름: "+name+", 조회수: "+views+", 사용여부: "+useNy);
	}
	
}
