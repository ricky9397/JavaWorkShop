package com.test3;

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

class BlackDog extends Dog{
	void running() { 
		System.out.println("BlackDog running");
	}
}

class Cat extends Animal {
	void meowing() {
		System.out.println("Cat meowing");
	}
}

public class Sample07 {
	static Animal test(Animal a) {
		Animal a2 = null;
		String name = a.getClass().getName();
		switch(name) {
		case "Dog":
			a2 = new Dog();
			break;
		case "BlackDog":
			a2= new BlackDog();
			break;
		}
		return a2;
	}
	public static void main(String[] args) {
		BlackDog bkDog = new BlackDog();
		Dog dog5 = bkDog;
		Animal animal3 = dog5;
		BlackDog bkDog2 = (BlackDog)animal3;
		Dog dog6 = (Dog)animal3;
		dog6.braking();
		dog6.breathing();
		
		BlackDog bkDog3 = new BlackDog();
		Animal obj2 = bkDog3;
		Animal obj = new BlackDog();
		
		Dog dog7 = new Dog();
		Animal obj4 = dog7;
		Animal obj3 = new Dog();
		
		Animal obj5 = test(new BlackDog());
		Animal obj6 = test(new Dog());
		
		
		
		
//		Dog dog3 = new Dog();
//		Animal animal2 = dog3;
//		Cat cat = (Cat)animal2;	// ��������(x)
		
//		Animal animal3 = new Animal();
//		Dog dog4 = (Dog)animal3;
//		��ü�� �����ϴ� �ʴ� ��� ����(x)
		
	}
}
