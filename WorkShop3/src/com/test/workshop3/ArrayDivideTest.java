package com.test.workshop3;

import java.util.Arrays;

public class ArrayDivideTest {
    
    public static void main( String[] args ) {
        
        int[] arrayOne = { 10, 20, 13, 25 };
        int[] arrayTwo = { 2, 5, 0, 3, 1, 7 };
        //TODO 프로그램 작성
        int[] result = new int[arrayOne.length];
        
        for(int i=0; i<arrayTwo.length; i++) {
           try {
              result[i] = arrayOne[i]/arrayTwo[i];
              System.out.println(arrayOne[i]+" / "+arrayTwo[i]);
           }catch(ArithmeticException ae) {
              System.out.println("나누기 연산 시 에러가 발생하였습니다.");
           }catch(ArrayIndexOutOfBoundsException aibe) {
              System.out.println("인덱스 범위를 벗어나는 값에 접근하였습니다.");
              break;
           }
        }
         System.out.println("나눈 값 :"+Arrays.toString(result));

        
        	
//        	for(int i=0; i<arrayOne.length; i++) {
//        		for(int j=0; j<arrayTwo.length; j++) {
//        			arrayOne[i] = arrayOne[i] / arrayTwo[j];
//        		}
//        	}
    }
}