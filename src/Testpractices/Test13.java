package Testpractices;

import java.util.Iterator;
import java.util.LinkedList;

public class Test13 {
	public static void main(String[] args) {
		LinkedList a= new LinkedList();
		a.add(2);
		a.add(4);
		a.add(3);
		System.out.println(a);
		a.addLast(5);
		System.out.println(a);
		a.add(1, 7);
		System.out.println(a);
//		Iterator i= a.descendingIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		System.out.println(a.element());
		System.out.println(a.get(4));
		
	}
}
