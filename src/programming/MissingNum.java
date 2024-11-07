package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class MissingNum {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag=true;
		TreeSet<Integer> t= new TreeSet();
		TreeSet<Integer> res= new TreeSet();
		System.out.println("Enter the Size of Array");
		int size=s.nextInt();
		System.out.println("Enter the Numbers");
		for(int i=0;i<size;i++) {
			t.add(s.nextInt());
		}
		for(int i=t.first();i<=t.last();i++) {
			if(!t.contains(i)) {
				flag=false;
				res.add(i);
			}
		}
		if(flag) {
			System.out.println("No any missing numbers");
		}
		else{
			System.out.println("Missing numbers are "+res);
		}
	}
}

//i/p
//
//Enter the Size of Array
//5
//Enter the Numbers
//20
//23
//24
//26
//29
//
//o/p
//
//Missing numbers are [21, 22, 25, 27, 28]
