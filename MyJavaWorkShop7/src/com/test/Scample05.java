package com.test;

class A {
	void amethod() {
		System.out.println("aMethod int A Class");
	}
}

class B extends A {
	void aMethod() {
		System.out.println("aMethod int B Class");
	}
}

public class Scample05 {

	public static void main(String[] args) {
		B b = new B();
		b.amethod();
	}

}
