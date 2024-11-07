package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		HashSet al= new HashSet();
		al.add(2);
		al.add(true);
		al.add(30.0);
		al.add("Partha");
		al.add('s');
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
//		System.out.println(al);
//		System.out.println(al.get(3));
//		String s1="  Partha  ";
//		String s2=s1.trim();
//		System.out.println(s1);
//		System.out.println(s2);
//		int ind=s1.indexOf("art");
//		System.out.println(ind);
//		char c[]=s1.toCharArray();
//		System.out.println(Arrays.toString(c));
//		String res=new String();
//		res=String.valueOf(c);
//		res=String.valueOf("Test");
//		System.out.println(res);
//		char t[]=res.toCharArray();
//		System.out.println(t);
	}
}
