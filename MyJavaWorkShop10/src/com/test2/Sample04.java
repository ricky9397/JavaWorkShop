package com.test2;

class MyException2 extends Exception {
	MyException2(String msg){
		super(msg);
	}
}

public class Sample04 {
	public static void main(String[] args) {
		int i = 2;
		
		try {
			if(i == 2) {
				throw new MyException2("�ȳ��ϼ���");
			}
		} catch (MyException2 e) {
			System.out.println(e.getMessage());
		}
	}
}
