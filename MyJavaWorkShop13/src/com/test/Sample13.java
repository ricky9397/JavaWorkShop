package com.test;

enum Season {
	winter(10), summer(20);
	private int value;
	private Season(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
}

public class Sample13 {

	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s);
			System.out.println(s + ", " + s.getValue());
		}
		for(MyMenu s2 : MyMenu.values()) {
			System.out.println(s2 + ", " + s2.getA());
		}
	}

}
