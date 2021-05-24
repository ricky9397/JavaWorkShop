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
		System.out.println("# 1. 덧셈");
		System.out.println("# 2. 뺄셈");
		System.out.println("# 3. 곱셈");
		System.out.println("# 4. 나눗셈");
		System.out.println("# 5. 종료");
		System.out.println("####################");
		System.out.println("메뉴를 선택해주세요. : ");
		int input = sc.nextInt();
			switch(input) {
			case 1:
				add(input, input);
				System.out.println("첫번째숫자를 입력해주세요. : ");
				int num1 = sc.nextInt();
				System.out.println("두번째숫자를 입력해주세요. : ");
				int num2 = sc.nextInt();
				System.out.println("결과는 "+(num1+num2)+"입니다.");
				break;
			case 2:
				subtract(input, input);
				System.out.println("첫번째숫자를 입력해주세요. : ");
				int num3 = sc.nextInt();
				System.out.println("두번째숫자를 입력해주세요. : ");
				int num4 = sc.nextInt();
				System.out.println("결과는 "+(num3-num4)+"입니다.");
				break;
			case 3:
				multiply(input, input);
				System.out.println("첫번째숫자를 입력해주세요. : ");
				int num5 = sc.nextInt();
				System.out.println("두번째숫자를 입력해주세요. : ");
				int num6 = sc.nextInt();
				System.out.println("결과는 "+(num5*num6)+"입니다.");
				break;
			case 4:
				divide(input, input);
				System.out.println("첫번째숫자를 입력해주세요. : ");
				int num7 = sc.nextInt();
				System.out.println("두번째숫자를 입력해주세요. : ");
				int num8 = sc.nextInt();
				System.out.println("결과는 "+(num7/num8)+"입니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(5);
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
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
		// # 1. 덧셈
		// # 2. 뺄셈
		// # 3. 곱셈
		// # 4. 나눗셈
		// # 5. 종료
		// ####################
		// # 메뉴를 선택해주세요. :
		//
		// 1을 선택한 경우
		// 첫번째 숫자를 입력해주세요. : 5
		// 두번째 숫자를 입력해주세요. : 5
		// 결과는 10입니다.
		// 단. 종료를 누를때까지 계속 반복적으로 처리하도록 구현하시오.
		// 사칙연산은 메소드로 구현하시오.
		Quiz quiz = new Quiz();
		quiz.showIfo();
	}

}
