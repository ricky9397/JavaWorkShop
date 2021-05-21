package com.test;

import java.util.*;


public class Sample05 {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(3);
		
		Iterator Itr = s.iterator();
		while(Itr.hasNext()) {
			System.out.println(Itr.next());
		}
	}

}
