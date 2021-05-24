package com.test;

public enum MyMenu {
	set1(1000),
	set2(3000);
	private int a;
	private MyMenu(int a) {
		this.a = a;
	}
	public int getA() {
		return this.a;
	}
	
}

