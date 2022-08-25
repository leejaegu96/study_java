package com.web.EWord.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
	
		// 부모 객체를 생성하고 powerOn 메서드 실행
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		// 자식 객체를 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		// 자식객체의 turnOffDmb 실행
		dmbCellPhone.turnOffDmb();
		
		// 생성자를 이용하여 자식 객체 생성
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("아이폰11", "white", 27);
		
		
		// dmbCellPhone2 객체를 사용하여 자식 클래의 함수 전체 호출
		dmbCellPhone2.turnOnDmb();
		dmbCellPhone2.changeChannelDmb(22);
		dmbCellPhone2.turnOffDmb();
		
		dmbCellPhone2.powerOn();
		dmbCellPhone2.powerOff();
		dmbCellPhone2.bell();
		dmbCellPhone2.sendVoice("Hi!");
		dmbCellPhone2.receiveVoice("Hi~");
		dmbCellPhone2.hangUp();
	
	}
}
