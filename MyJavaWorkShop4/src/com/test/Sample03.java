package com.test;

public class Sample03 {

	public static void main(String[] args) {
		//=============¹Ýº¹¹®============
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for(int j = 2; j < 10; j++) {
			System.out.println(j);
			System.out.println();
			for(int k = 1; k <= 9; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print("\t" + i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < 5; j++) {
				System.out.print("*");
			}
			for(int j = i+1; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
