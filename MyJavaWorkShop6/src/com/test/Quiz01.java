package com.test;
// Encapsulation���� �ۼ��Ͻÿ�.
// name, id, age�� ���λ縦 set, get���� �޼ҵ带 �����Ͻÿ�.
class Member {
	private String name;
	private String id;
	private int age;
	
	public Member() {}
	public Member (String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("�̸�  = " + name + "\nid = " + id + "\n���� = " + age);
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Member m = new Member("ȫ�浿", "asd", 34);
		m.showInfo();
		Member m1 = new Member();
		m1.setName("�̼���");
		m1.setId("qwe");
		m1.setAge(31);
		m1.showInfo();
	}
}
