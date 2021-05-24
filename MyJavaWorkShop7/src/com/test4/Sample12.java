package com.test4;

class A2 {
	int a;
	A2() { 
		System.out.println("A default Constuctor");
	}
	A2(int a) {
		this.a = a;
		System.out.println(a + " A constructor");
	}
}

class B2 extends A2 {
	B2() {
		super(10);
		System.out.println("B default Constuctor");
	}
}


public class Sample12 {
	public static void main(String[] args) {
		B2 b = new B2();
	}

}
