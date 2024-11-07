package programming;

import java.util.Scanner;

public class RemoveInbetweenChar {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String str=s.next();
		String temp="";
		for(int i=0;i<str.length();) {
			for(int j=0;j<2;j++,i++) {
				temp=temp+str.charAt(i);
			}
			for(int k=0;k<2;k++,i++) {
				temp=temp+" ";
			}
		}
		System.out.println(temp);
	}
}
//i/p

//Enter the input
//abcdefghij

//o/p

//ab  ef  ij  
