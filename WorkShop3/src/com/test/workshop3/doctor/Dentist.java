package com.test.workshop3.doctor;

public class Dentist extends Doctor {

	//TODO Doctor 클래스 상속 받은 후, 클래스 완성
	public Dentist(String name) {
		super(name, "치과");
	}
	
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}
	
}