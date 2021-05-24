package com.test;

public class Sample08 {

	public static void main(String[] args) {
		String msg1 = "이순신";
		String msg2 = "강감찬";
		String msg3 = msg1 + msg2;
		System.out.println(msg3);
		
		StringBuffer sb = new StringBuffer("이순신");
		System.out.println(sb.capacity()); // 용량확인
		sb.append("강감찬");
		sb.insert(1, "세종대왕"); // 1번자리뒤에 세종대왕을 집어넣을 수 있다.
		sb.replace(1, 3, "안녕"); // 1,3인덱스 위치에 있는 문자열을 "안녕"으로 바까준다.
		sb.delete(1, 3); // 1,3위치에 있는 인덱스를 삭제해준다.
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		
	}

}
