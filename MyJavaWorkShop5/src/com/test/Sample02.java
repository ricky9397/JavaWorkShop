package com.test;

class Student2 {
	String name;
	void working() {
		System.out.println(name + "�� ���θ� �ϴ�.");
	}
}

public class Sample02 {
	public static void main(String[] args) {
		Student2 st = new Student2();
		st.working();
		st.name = "�������";
		System.out.println(st.name);
		st.working();
		Student2 st2 = new Student2();
		st2.name = "�̼���";
		st2.working();
	}

}
