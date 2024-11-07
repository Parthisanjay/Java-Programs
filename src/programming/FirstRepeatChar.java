package programming;

import java.util.Scanner;
import java.util.TreeSet;

public class FirstRepeatChar {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String inp=s.next();
		String str=inp.toLowerCase();		
		char a[]=str.toCharArray();
		TreeSet<Integer> t=new TreeSet();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					t.add(j);
				}
			}
		}
		if(t.isEmpty()) {
			System.out.println("No Repeating Character in this String");
		}
		else {
			System.out.println(a[t.first()]);
		}
	}
}
