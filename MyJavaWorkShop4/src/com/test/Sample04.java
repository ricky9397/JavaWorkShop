package com.test;

//ÆäÀÌÁö162
public class Sample04 {

	public static void main(String[] args) {
		// i = 1, j = 1...5
		// i = 2, j = 1...5
		// i = 3, j = 1...5
		// i = 4, j = 1...5
		// i = 5, j = 1...5
		
		for(int i = 1; i < 6; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			for(int j = 1; j < i+1; j++) {
				System.out.print(i+", "+j);
			}
			System.out.println();
		}
	}

}
