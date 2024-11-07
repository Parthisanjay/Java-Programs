package zohopreviousqns;

import java.util.Scanner;

public class Program2 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input String");
		String str=s.next();
		System.out.println("Enter the Rotation");
		String rot=s.next();
		System.out.println("Enter the n");
		int n=s.nextInt();
		String temp="";
		if(rot.charAt(0)=='L') 
			temp=str.substring(n)+str.substring(0, n);
		else if(rot.charAt(0)=='R')
			temp=str.substring(str.length()-n)+str.substring(0, str.length()-n);
		System.out.println(temp);
	}
}
