package com.test;

public class Sample08 {

	public static void main(String[] args) {
		
//		int a = 10;
//		do {
//			System.out.println(a);
//			a++;
//			System.out.println();
//		} while(a < 20);
//		
		// break
		
		// continue
		
//		for(int i = 1; i <= 10; i++) {
//			if(i == 2) {
//				break;
//				continue;
//			}
//			System.out.println(i);
//		}
		//2의 배수를 구하시오.(1....10사이수에)
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
