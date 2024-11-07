package programming;

import java.util.Scanner;

public class HappyNumber {
	static Scanner s= new Scanner(System.in);
	static boolean flag=false;
	static int num;
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int inp=s.nextInt();
		num=inp;
		int count=0;
		while(num!=1) {
		num=opera(num);
		count++;
			if(count>=inp) {
				break;
			}
		}
		if(num==1) {
			System.out.println(inp+" is a Happy Number");
		}
		else {
			System.out.println(inp+" is Not a Happy Number");
		}			
	}
	
	public static int opera(int inp) {
		int m=inp;
		int rem=0;
		int sum=0;
		int prod=0;
		while(m!=0) {
			rem=m%10;
			prod=rem*rem;
			sum=sum+prod;
			m=m/10;
		}
		return sum;
	}
}
