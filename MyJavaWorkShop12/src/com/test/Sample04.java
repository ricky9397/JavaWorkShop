package com.test;

import java.util.*;

public class Sample04 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add("�̼���");
		ll.add(30);
		
		for(Object o : ll) {
			System.out.println(o);
		}
		System.out.println();
		ll.add(0, "�������");	// �ε���0��° �ڸ� �߰�
		ll.addFirst("��������");	// ó������ �߰�
		ll.addLast("����");		// �������� �߰�
		
		Iterator Itr = ll.iterator();
		while(Itr.hasNext()) {
			System.out.println(Itr.next());
		}
	}

}
