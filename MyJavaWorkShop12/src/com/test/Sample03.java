package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample03 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("�̼���");
		al.add(12.3);
		
		for(int inx = 0; inx < al.size(); inx++) {
			System.out.println(al.get(inx).getClass().getName());
			System.out.println(al.get(inx).toString());
		}
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
