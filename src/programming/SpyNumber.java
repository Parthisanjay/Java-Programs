package programming;

import java.util.Scanner;

public class SpyNumber {

	static Scanner s=new Scanner(System.in);
	
	static int sum;
	static int prod=1;
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
		
		if(sum==prod) {
			System.out.println("SpyNumber");
		}
		else {
			System.out.println("Not a SpyNumber");
		}
	}
	
	public static void opera(int rem) {		
		sum=sum+rem;
		prod=prod*rem;
	}
}
