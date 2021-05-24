package com.test;

class Student2 {
	String name;
	void working() {
		System.out.println(name + "은 공부를 하다.");
	}
}

public class Sample02 {
	public static void main(String[] args) {
		Student2 st = new Student2();
		st.working();
		st.name = "세종대왕";
		System.out.println(st.name);
		st.working();
		Student2 st2 = new Student2();
		st2.name = "이순신";
		st2.working();
	}

}
