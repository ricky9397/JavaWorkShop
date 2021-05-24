package com.test;

class Student {
	String name;
	void studying() {
		System.out.println(name + "가 공부하다.");
	}
}

class MiddleStudent extends Student {
	void eating() {
		System.out.println(name);
	}
}

class Point {
	int x;
	int y;
}

class Point3D extends Point {
	int z;
}

public class Sample03 {
	public static void main(String[] args) {
		MiddleStudent mstu = new MiddleStudent();
		mstu.name = "인순신";
		mstu.studying();
		mstu.eating();
		Student stu = new Student();
		Point3D p = new Point3D();
		p.x = 10;
		p.y = 20;
		p.z = 30;
		Point p1 = new Point3D();
		p.x = 1;
		p.y = 2;
		p.z = 3;
		
	}

}
