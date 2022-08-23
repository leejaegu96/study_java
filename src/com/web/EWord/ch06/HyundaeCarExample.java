package com.web.EWord.ch06;

public class HyundaeCarExample {

	public static void main(String[] args) {

		HyundaeCar hyundaecar = new HyundaeCar();
		
		System.out.print("현대자동차 차종 : ");
		
		for(int i=0;i<hyundaecar.name.length;i++) {
			if(i==hyundaecar.name.length-1) {
				System.out.println(hyundaecar.name[i]);
			}else {
				System.out.print(hyundaecar.name[i] + ", ");
			}
		}
		
		
		int result = hyundaecar.sum(2,3);
		System.out.println("result : " + result);
		
	}

}
