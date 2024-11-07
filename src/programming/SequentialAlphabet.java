package programming;

import java.util.Scanner;

public class SequentialAlphabet {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String str=s.next();
		String temp="";
		for(int i=0;i<str.length();i++) {
			temp=temp+str.charAt(i);
			System.out.print(temp);
		}
	}
}
//i/p
//
//Enter the input
//Hyena
//
//o/p
//
//HHyHyeHyenHyena