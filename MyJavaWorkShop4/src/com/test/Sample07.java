package com.test;

public class Sample07 {

	public static void main(String[] args) {
		// Collection, 컬렉션, 쉽게 말하면 자료구조 배열임
		// List....
		// index, 첨자...접근 사용할수 있음.
		// List, 딕셔낼리
		// for => foreach
		int a = 10;
		int [] arr = {1,2,3,4,5,6,7};
//		System.out.println(arr[0]);
//		System.out.println(arr[2]);
		for(int i = 0; i <7; i++) {
			System.out.println(arr[i]);
		}
		
		for(int j : arr) {
			System.out.print(j);
		}
		
		int k = 0;
		int sum = 0;
		while(k <= 10) {
			System.out.println(k);
			sum += k; // sum = sum + k;
			k++;
		}
	}
}
