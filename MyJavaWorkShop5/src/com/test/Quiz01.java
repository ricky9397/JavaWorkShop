package com.test;

import java.util.Scanner;

class Quiz {
	Scanner sc = new Scanner(System.in);
	int add;
	int subtract;
	int multiply;
	double divide;
		
	void showIfo() {
		while(true) {
		System.out.println("####################");
		System.out.println("# 1. ����");
		System.out.println("# 2. ����");
		System.out.println("# 3. ����");
		System.out.println("# 4. ������");
		System.out.println("# 5. ����");
		System.out.println("####################");
		System.out.println("�޴��� �������ּ���. : ");
		int input = sc.nextInt();
			switch(input) {
			case 1:
				add(input, input);
				System.out.println("ù��°���ڸ� �Է����ּ���. : ");
				int num1 = sc.nextInt();
				System.out.println("�ι�°���ڸ� �Է����ּ���. : ");
				int num2 = sc.nextInt();
				System.out.println("����� "+(num1+num2)+"�Դϴ�.");
				break;
			case 2:
				subtract(input, input);
				System.out.println("ù��°���ڸ� �Է����ּ���. : ");
				int num3 = sc.nextInt();
				System.out.println("�ι�°���ڸ� �Է����ּ���. : ");
				int num4 = sc.nextInt();
				System.out.println("����� "+(num3-num4)+"�Դϴ�.");
				break;
			case 3:
				multiply(input, input);
				System.out.println("ù��°���ڸ� �Է����ּ���. : ");
				int num5 = sc.nextInt();
				System.out.println("�ι�°���ڸ� �Է����ּ���. : ");
				int num6 = sc.nextInt();
				System.out.println("����� "+(num5*num6)+"�Դϴ�.");
				break;
			case 4:
				divide(input, input);
				System.out.println("ù��°���ڸ� �Է����ּ���. : ");
				int num7 = sc.nextInt();
				System.out.println("�ι�°���ڸ� �Է����ּ���. : ");
				int num8 = sc.nextInt();
				System.out.println("����� "+(num7/num8)+"�Դϴ�.");
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				System.exit(5);
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
				break;
			}
		}
	}
	
	public int add (int a, int b) {
		return a + b;
	}
	public int subtract (int a, int b) {
		return a - b;
	}
	public int multiply (int a, int b) {
		return a * b;
	}
	public double divide (double a, double b) {
		return a / b;
	}
}

public class Quiz01 {
	public static void main(String[] args) {

		// ####################
		// # 1. ����
		// # 2. ����
		// # 3. ����
		// # 4. ������
		// # 5. ����
		// ####################
		// # �޴��� �������ּ���. :
		//
		// 1�� ������ ���
		// ù��° ���ڸ� �Է����ּ���. : 5
		// �ι�° ���ڸ� �Է����ּ���. : 5
		// ����� 10�Դϴ�.
		// ��. ���Ḧ ���������� ��� �ݺ������� ó���ϵ��� �����Ͻÿ�.
		// ��Ģ������ �޼ҵ�� �����Ͻÿ�.
		Quiz quiz = new Quiz();
		quiz.showIfo();
	}

}
