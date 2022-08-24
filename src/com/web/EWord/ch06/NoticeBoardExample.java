package com.web.EWord.ch06;

public class NoticeBoardExample {

	public static void main(String[] args) {

		NoticeBoard noticeBoard = new NoticeBoard();
		
		NoticeBoard noticeBoard2 = new NoticeBoard("12번 게시물");
		
		NoticeBoard noticeBoard3 = new NoticeBoard("67번 게시물", 300);
		
		NoticeBoard noticeBoard4 = new NoticeBoard("90번 게시물", false);
		
		NoticeBoard noticeBoard5 = new NoticeBoard("215번 게시물", 500, false);
		
		
		
//		System.out.println(noticeBoard.name + "의 조회수는" + noticeBoard.views + "이고, 사용여부: " + noticeBoard.useNy );
//		
//		System.out.println(noticeBoard2.name + "의 조회수는" + noticeBoard2.views + "이고, 사용여부: " + noticeBoard2.useNy );
//		
//		System.out.println(noticeBoard3.name + "의 조회수는" + noticeBoard3.views + "이고, 사용여부: " + noticeBoard3.useNy );
//		
//		System.out.println(noticeBoard4.name + "의 조회수는" + noticeBoard4.views + "이고, 사용여부: " + noticeBoard4.useNy );
//		
//		System.out.println(noticeBoard5.name + "의 조회수는" + noticeBoard5.views + "이고, 사용여부: " + noticeBoard5.useNy );
		
		
		noticeBoard.say();
		noticeBoard2.say();
		noticeBoard3.say();
		noticeBoard4.say();
		noticeBoard5.say();
		
	}

}
