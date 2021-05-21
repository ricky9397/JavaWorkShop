package com.test.workshop3.doctor;

public class Surgeon extends Doctor {

	//TODO Doctor 클래스 상속 받은 후, 클래스 완성
	public Surgeon(String name) {
		super(name, "외과");
	}
	public void performSurgery() {
		System.out.println("수술을 집도하다.");
	}
	
}