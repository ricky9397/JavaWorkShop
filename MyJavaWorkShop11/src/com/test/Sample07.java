package com.test;

public class Sample07 {

	public static void main(String[] args) {
		String msg = "안녕하세요. 반가워요.";
		char c = msg.charAt(1); // 지정된 위치에 있는 문자를 알려준다.
		System.out.println(c);
		
		String msg1 = "abcdefgABCD";
		char c2 = msg1.charAt(7);
		System.out.println(c2);
		
		int n = (int)c2;
		System.out.println(n); // 아스키드 코드값
		
		String msg2 = "   반가워요 ";			
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length());
		System.out.println(msg2.trim());	// 공백을 없애고 출력한다.
		System.out.println(msg1.startsWith("ab")); // 주어진 문자열로 시작하는지 검사한다.
		
		int n2 = 1234;
		String temp2 = String.valueOf(n2);	// 숫자열을 문자열로 바꾼다.
		System.out.println(temp2 + 2);
		String msg3 = "ababc";
		String msg4 = msg3.replace('b', 'c'); // 문자열 중의 문자를 새로운 문자로 바꾼 문자열을 반환한다.
		System.out.println(msg4);
		
		String tel = "010-123-5678";
		System.out.println(tel.substring(0,3));
		System.out.println(tel.substring(4,7));
		System.out.println(tel.substring(3));
		char c3 = "방가워요".charAt(0);
		System.out.println(c3);
		
	}

}
