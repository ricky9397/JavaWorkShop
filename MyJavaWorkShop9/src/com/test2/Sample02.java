package com.test2;

interface IStudent {
	public void study();
}
class Student implements IStudent {
	
	@Override
	public void study() {
		System.out.println("�л��� �����ϴ�.");
	}
}


public class Sample02 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.study();
		IStudent stu2 = new Student();
		stu.study();
		
	}

}
