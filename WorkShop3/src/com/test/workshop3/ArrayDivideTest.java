package com.test.workshop3;

import java.util.Arrays;

public class ArrayDivideTest {
    
    public static void main( String[] args ) {
        
        int[] arrayOne = { 10, 20, 13, 25 };
        int[] arrayTwo = { 2, 5, 0, 3, 1, 7 };
        //TODO ���α׷� �ۼ�
        int[] result = new int[arrayOne.length];
        
        for(int i=0; i<arrayTwo.length; i++) {
           try {
              result[i] = arrayOne[i]/arrayTwo[i];
              System.out.println(arrayOne[i]+" / "+arrayTwo[i]);
           }catch(ArithmeticException ae) {
              System.out.println("������ ���� �� ������ �߻��Ͽ����ϴ�.");
           }catch(ArrayIndexOutOfBoundsException aibe) {
              System.out.println("�ε��� ������ ����� ���� �����Ͽ����ϴ�.");
              break;
           }
        }
         System.out.println("���� �� :"+Arrays.toString(result));

        
        	
//        	for(int i=0; i<arrayOne.length; i++) {
//        		for(int j=0; j<arrayTwo.length; j++) {
//        			arrayOne[i] = arrayOne[i] / arrayTwo[j];
//        		}
//        	}
    }
}