package com.test;

import java.util.Scanner;

public class WorkShop1_2 {
	public static float getUserInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return Float.parseFloat(input);
	}
	public static void main(String[] args) {
		float total;
		float avg;
		while(true) {
		System.out.println("Computer Science ������ �Է��ϼ���:");
		float a = getUserInput();
		System.out.println("Java Programming ������ �Է��ϼ���:");
		float b = getUserInput();
		System.out.println("���м��� ������ �Է��ϼ���:");
		float c = getUserInput();
		System.out.println("������� ���� ������ �Է��ϼ���:");
		float d = getUserInput();
		System.out.println("������ ������ �Է��ϼ���:");
		float e = getUserInput();
		
//		boolean a1Check = (a >= 2.5) ? true:false;
//		boolean a2Check = (b >= 2.5) ? true:false;
//		boolean a3Check = (c >= 2.5) ? true:false;
//		boolean a4Check = (d >= 2.5) ? true:false;
//		boolean a5Check = (e >= 2.5) ? true:false;
//		boolean allCheck = a1Check && a2Check && a3Check && a4Check && a5Check;
//		float totalScore = (a + b + c + d + e)/5;
//		System.out.println("������ "+totalScore+"�� �Դϴ�.");
//		if(totalScore >= 3.7) {
//			if(allCheck) {
//				System.out.println("���� �б� ���б� ����� �Դϴ�.");
//			} 
//		}
//		}
//		float total2 = totalScore(a, b, c, d, e); // �Լ��� �����.
		total = a+b+c+d+e;
		avg = (float) (total/5);
		if(avg >= 3.7) {
			System.out.printf("������ " + avg + "�� �Դϴ�.\n���� �б� ���б� ����� �Դϴ�.\n");
		} else if(avg <= 2.5) {
			System.out.println("�������� ���б� Ż���Դϴ�.");
		} else {
			System.out.println("�ش���׾���");
		}
				
		}
	}
//	public static float totalScore(float a, float b, float c, float d, float e) {	// �Լ� �޼���
//		float result;
//		result = (a+b+c+d+e)/5;
//		return result;
//	}
}
