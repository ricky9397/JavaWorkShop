package com.test;

public class Sample08 {

	public static void main(String[] args) {
		String msg1 = "�̼���";
		String msg2 = "������";
		String msg3 = msg1 + msg2;
		System.out.println(msg3);
		
		StringBuffer sb = new StringBuffer("�̼���");
		System.out.println(sb.capacity()); // �뷮Ȯ��
		sb.append("������");
		sb.insert(1, "�������"); // 1���ڸ��ڿ� ��������� ������� �� �ִ�.
		sb.replace(1, 3, "�ȳ�"); // 1,3�ε��� ��ġ�� �ִ� ���ڿ��� "�ȳ�"���� �ٱ��ش�.
		sb.delete(1, 3); // 1,3��ġ�� �ִ� �ε����� �������ش�.
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		
	}

}
