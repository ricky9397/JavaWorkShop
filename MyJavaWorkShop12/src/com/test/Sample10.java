package com.test;

public class Sample10 {

	public static void main(String[] args) {
				  // 0 1 2 3
		int[] arr = {2,1,3,4,20,21,3,4,9,8};
		int temp;
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for(int inx = 0; inx < arr.length-1; inx++) {
				if(arr[inx] > arr[inx+1]) {
					temp = arr[inx];
					arr[inx] = arr[inx+1];
					arr[inx+1] = temp;
					sorted = false;
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a+",");
			
		}
	}

}
