package zohopreviousqns;

import java.util.Scanner;

public class Program3 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String[] m= {"abc","def","ghi"};
		System.out.println("Enter the input");
		int n= s.nextInt();
		int len=n+(n-m.length);
		int ind=0;
		for(int i=0;i<len;i++) {
			if(i>=n-m.length && i<n) {
				System.out.println("*"+m[ind++]+"*");
			}
			else {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			}
			System.out.println();
		}
	}
}
