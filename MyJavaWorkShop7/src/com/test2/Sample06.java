package com.test2;

class Animal {
	void breathing() {
		System.out.println("Animal Breathing");
	}
}
class Dog extends Animal{
	void braking() {
		System.out.println("Dog barking");
	}
}

class Cat extends Animal {
	void meowing() {
		System.out.println("Cat meowing");
	}
}

public class Sample06 {
	static void test1(Dog d) {}
	static void test2(Cat c) {}
	static void test3(Animal a) {}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathing();
		dog.braking();
		Animal animal = dog;
		animal.breathing();
		Dog dog2 = (Dog)animal;
		dog2.braking();
		dog2.breathing();
		
		Object obj = dog;
		Dog obj2 = (Dog)obj;
		obj2.braking();
		obj2.breathing();
		
//		byte a = Byte.MAX_VALUE;
//		int b = Integer.MAX_VALUE;
//		
	}

}
