package com.test;
// Encapsulation으로 작성하시오.
// name, id, age를 접두사를 set, get으로 메소드를 구현하시오.
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
		System.out.println("이름  = " + name + "\nid = " + id + "\n나이 = " + age);
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		Member m = new Member("홍길동", "asd", 34);
		m.showInfo();
		Member m1 = new Member();
		m1.setName("이순신");
		m1.setId("qwe");
		m1.setAge(31);
		m1.showInfo();
	}
}
