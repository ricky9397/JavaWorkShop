package com.test.workshop3.doctor;

public class Dentist extends Doctor {

	//TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
	public Dentist(String name) {
		super(name, "ġ��");
	}
	
	public void pullOutTooth() {
		System.out.println("�̸� �̽��ϴ�.");
	}
	
}