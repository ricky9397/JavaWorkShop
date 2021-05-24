package com.test;

import java.util.*;

public class Sample02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("이순신");
		al.add("강감찬");
		al.add(12.5);
		al.add(false);
		Object obj = al.get(0);
		System.out.println(obj.getClass().getName());
		Object obj2 = al.get(1);
		System.out.println(obj.getClass().getName());
		
		for(int inx = 0; inx < al.size(); inx++) {
			Object o = al.get(inx);
			System.out.println(o.toString());
		}
		
		
	}

}
