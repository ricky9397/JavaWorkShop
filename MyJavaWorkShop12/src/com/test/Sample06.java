package com.test;

import java.util.*;
import java.util.Iterator;

class MyList implements Iterable {
	ArrayList al;
	MyList(){
		al = new ArrayList();
	}
	public void addItem(Object o) {
		al.add(o);
	}
	@Override
	public Iterator iterator() {
		return new MyListIterator();
	}
	
	class MyListIterator implements Iterator {
		int currentIndex = 0;
		
		@Override
		public boolean hasNext() {
			if(currentIndex >= al.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Object next() {
			return al.get(currentIndex++);
		}
		
	}
}

public class Sample06 {

	public static void main(String[] args) {
		
		MyList ml = new MyList();
		ml.addItem(1);
		ml.addItem(2);
		
		Iterator ltr = ml.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());

		}
		
		for(Object o : ml) {
			System.out.println(o);
		}
	}
}
