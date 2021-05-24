package com.test;

class Calculator1 {
	//µ¡¼À, »¬¼À, °ö¼À, ³ª´«¼À ¸Þ¼Òµå¸¦ ±¸ÇöÇÏ½Ã¿À.
	// add, subtract, multiply, divide
	int add (int a, int b) {
		return a + b;
	}
	int subtract (int a, int b) {
		return a - b;
	}
	int multiply (int a, int b) {
		return a / b;
	}
	double divide (double a, double b) {
		return a % b;
	}
}

public class Sample12 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		Calculator1 cc = new Calculator1();
		int t1 = cc.add(a, b);
		int t2 = cc.subtract(a, b);
		int t3 = cc.multiply(a, b);
		double t4 = cc.divide(a, b);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		//===========================
		int d1 = cc.add(1, 2);
		int d2 = cc.subtract(5, 2);
		int d3 = cc.multiply(1, 2);
		double d4 = cc.divide(5, 2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
	}

}
