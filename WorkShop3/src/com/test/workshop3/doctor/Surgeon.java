package com.test.workshop3.doctor;

public class Surgeon extends Doctor {

	//TODO Doctor Ŭ���� ��� ���� ��, Ŭ���� �ϼ�
	public Surgeon(String name) {
		super(name, "�ܰ�");
	}
	public void performSurgery() {
		System.out.println("������ �����ϴ�.");
	}
	
}