package programming;

import java.util.Scanner;
public class EvenOddProduct {

	static Scanner s=new Scanner(System.in);
	
	static int even;
	static int odd;
	static int prod;
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int m=s.nextInt();
		
		int num=m;
		int rem=0;
		
		while(num!=0) {
			rem=num%10;
			opera(rem);
			num=num/10;
		}
		
		prod=even*odd;
		
		System.out.println("The Product of the Number is :"+prod);
		
	}
	
	public static void opera(int rem) {
		if(rem%2==0) {
			even=even+rem;
		}
		else {
			odd=odd+rem;
		}
	}
	
}
