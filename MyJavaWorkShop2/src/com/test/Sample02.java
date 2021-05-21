package com.test;

public class Sample02 {

	public static void main(String[] args) {
		// value type ��Ÿ��
		// JVM stack�޸� ������ �Ҵ�ǰ� �ʱ�ȭ��.
		int a = 1;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		Employee e = new Employee();
		e.name = "�̼���";
		e.age = 30;
		System.out.printf("%s %s",e.name,e.age);
		Employee e2 = e;
		e2.name = "�������";
		System.out.printf("%s %s",e.name,e.age);
		// reference type ����Ÿ��
		// JVAM stack �޸� ������ e���� �Ҵ�ǰ�
		// heap�޸� ������ Employee���� �����ǰ�
		// ���� ���� name, age�� �Ҵ��.
		// e������ heap �޸� ������ Employee�� ������.
	}
}

class Employee{
	public String name;
	public int age;
}
