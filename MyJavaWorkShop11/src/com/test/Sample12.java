package com.test;

import java.util.*;

public class Sample12 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();	// 순서가 있는 데이터의집합.데이터의 중복을 허용한다. (예)대기자명단
//		List al1 = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);	
		
		for (int i = 0; i < al.size(); i++) {
			int a = (int)al.get(i);
			System.out.println(a);
		}
		
		// 사이즈를 모를땐 interator()과 hasNext()를 이용해서 아래와같이 사용하면 된다.
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList ll = new LinkedList();
		ll.add(300);
		ll.add(400);
		ll.add(500);
		
		Iterator itr2 = ll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
