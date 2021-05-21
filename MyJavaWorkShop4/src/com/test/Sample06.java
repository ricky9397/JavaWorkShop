package com.test;

public class Sample06 {

	public static void main(String[] args) {
		//관련내용을 출력하는 코드를 작성하시오.
//		12345
//		1234
//		123
//		12
//		1
		for(int i = 5; i >= 1; --i) {			// 5 4 3 2 1 
			for(int j = 1; j <= i; ++j) {	
				System.out.print(j);
			}
			System.out.println();
		}
	
	}

}
