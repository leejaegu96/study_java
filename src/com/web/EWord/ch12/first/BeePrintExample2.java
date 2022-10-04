package com.web.EWord.ch12.first;

import java.awt.Toolkit;

public class BeePrintExample2 {

	public static void main(String[] args) {
		//how1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//how2 제일 알아보기 쉬운것.
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
//				for(int i=0; i<5; i++) {		
//					toolkit.beep();
//					try { Thread.sleep(500); } catch(Exception e) {}
//				}
//			}
//		});
		
		//how3
//		Thread thread = new Thread(() -> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();	
//			for(int i=0; i<5; i++) {		
//				toolkit.beep();
//				try { Thread.sleep(500); } catch(Exception e) {}
//			}
//		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
