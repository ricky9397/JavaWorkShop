package com.test;

import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		// 관력 내용을 출력하시오.
		//1
		//12
		//123
		//1234
		//12345
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

//		int num = 0;
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		num = Integer.parseInt(str);
//		
//		for(int i=0; i<num; i++) {
//			for(int j=i; j<num; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<num; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=i; j<num; j++) {
//				System.out.print("*");
//			}
//			for(int j=i+1; j<num; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
