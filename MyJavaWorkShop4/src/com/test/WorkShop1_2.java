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
		System.out.println("Computer Science 성적을 입력하세요:");
		float a = getUserInput();
		System.out.println("Java Programming 성적을 입력하세요:");
		float b = getUserInput();
		System.out.println("공학수학 성적을 입력하세요:");
		float c = getUserInput();
		System.out.println("오페라의 이해 성적을 입력하세요:");
		float d = getUserInput();
		System.out.println("배드민턴 성적을 입력하세요:");
		float e = getUserInput();
		
//		boolean a1Check = (a >= 2.5) ? true:false;
//		boolean a2Check = (b >= 2.5) ? true:false;
//		boolean a3Check = (c >= 2.5) ? true:false;
//		boolean a4Check = (d >= 2.5) ? true:false;
//		boolean a5Check = (e >= 2.5) ? true:false;
//		boolean allCheck = a1Check && a2Check && a3Check && a4Check && a5Check;
//		float totalScore = (a + b + c + d + e)/5;
//		System.out.println("평점은 "+totalScore+"점 입니다.");
//		if(totalScore >= 3.7) {
//			if(allCheck) {
//				System.out.println("다음 학기 장학금 대상자 입니다.");
//			} 
//		}
//		}
//		float total2 = totalScore(a, b, c, d, e); // 함수를 사용함.
		total = a+b+c+d+e;
		avg = (float) (total/5);
		if(avg >= 3.7) {
			System.out.printf("평점은 " + avg + "점 입니다.\n다음 학기 장학금 대상자 입니다.\n");
		} else if(avg <= 2.5) {
			System.out.println("과락으로 장학금 탈락입니다.");
		} else {
			System.out.println("해당사항없음");
		}
				
		}
	}
//	public static float totalScore(float a, float b, float c, float d, float e) {	// 함수 메서드
//		float result;
//		result = (a+b+c+d+e)/5;
//		return result;
//	}
}
