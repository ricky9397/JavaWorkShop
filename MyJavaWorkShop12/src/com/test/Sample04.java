package com.test;

import java.util.*;

public class Sample04 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add("이순신");
		ll.add(30);
		
		for(Object o : ll) {
			System.out.println(o);
		}
		System.out.println();
		ll.add(0, "세종대왕");	// 인덱스0번째 자리 추가
		ll.addFirst("을지문덕");	// 처음시작 추가
		ll.addLast("권율");		// 마지막에 추가
		
		Iterator Itr = ll.iterator();
		while(Itr.hasNext()) {
			System.out.println(Itr.next());
		}
	}

}
