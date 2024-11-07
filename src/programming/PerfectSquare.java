package programming;

import java.util.Scanner;

public class PerfectSquare {
	static Scanner s= new Scanner(System.in);
	static boolean sq=false;
	static boolean cu=false;
	static boolean pl=false;
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int inp=s.nextInt();
		square(inp);
		cube(inp);
		if(sq) {
			System.out.println(inp+" is a Perfect Square");
			palindrome(inp);
			
		}
		if(cu) {
			System.out.println(inp+" is a Perfect Cube");
			palindrome(inp);
		}
		if(sq==false&&cu==false) {
			System.out.println("The Entered Number is Neither Perfect Square Nor Perfect Cube");
		}
		if(pl) {
			System.out.println(inp+" is a Palindrome");
		}
		else {
			System.out.println(inp+" Not a Palindrome");
		}
		
	}
	
	public static void square(int num) {
		for(int i=1;i<=num;i++) {
			int prod=i*i;
			if(prod==num) {
				System.out.println(i+" Square");
				sq=true;
				break;
			}
		}
	}
	public static void cube(int num) {
		for(int i=1;i<=num;i++) {
			int prod=i*i*i;
			if(prod==num) {
				System.out.println(i+" Cube");
				System.out.println(prod);
				cu=true;
				break;
			}
		}
	}
	public static void palindrome(int inp) {
		int num=inp;
		int rem=0;
		int rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(inp==rev) {
			pl=true;
		}
	}
}
