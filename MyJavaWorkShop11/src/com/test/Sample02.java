package com.test;

class MyCustomException extends Exception {
	MyCustomException(String msg){
		super(msg);	// 상위 생성자를 object를 불러옴.
	}
}

public class Sample02 {

	public static void main(String[] args) {
		int a = 10;
		if(a == 10) {
			try {
				throw new MyCustomException("a == 10이 같다.");
			} catch(MyCustomException ex) {
				System.out.println(ex.getMessage());
			}
				
		}
	}

}
