package com.test;

import java.lang.reflect.Method;

class MyClass {
	String name;
	void myMethod() {
		
	}
}

public class Sample06 {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		Class c = obj.getClass();
		System.out.println(c.getName() + ", " + c.getSimpleName());
		Method[] methods = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
		}
	}

}
