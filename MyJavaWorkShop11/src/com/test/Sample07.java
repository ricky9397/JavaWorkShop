package com.test;

public class Sample07 {

	public static void main(String[] args) {
		String msg = "�ȳ��ϼ���. �ݰ�����.";
		char c = msg.charAt(1); // ������ ��ġ�� �ִ� ���ڸ� �˷��ش�.
		System.out.println(c);
		
		String msg1 = "abcdefgABCD";
		char c2 = msg1.charAt(7);
		System.out.println(c2);
		
		int n = (int)c2;
		System.out.println(n); // �ƽ�Ű�� �ڵ尪
		
		String msg2 = "   �ݰ����� ";			
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length());
		System.out.println(msg2.trim());	// ������ ���ְ� ����Ѵ�.
		System.out.println(msg1.startsWith("ab")); // �־��� ���ڿ��� �����ϴ��� �˻��Ѵ�.
		
		int n2 = 1234;
		String temp2 = String.valueOf(n2);	// ���ڿ��� ���ڿ��� �ٲ۴�.
		System.out.println(temp2 + 2);
		String msg3 = "ababc";
		String msg4 = msg3.replace('b', 'c'); // ���ڿ� ���� ���ڸ� ���ο� ���ڷ� �ٲ� ���ڿ��� ��ȯ�Ѵ�.
		System.out.println(msg4);
		
		String tel = "010-123-5678";
		System.out.println(tel.substring(0,3));
		System.out.println(tel.substring(4,7));
		System.out.println(tel.substring(3));
		char c3 = "�氡����".charAt(0);
		System.out.println(c3);
		
	}

}
