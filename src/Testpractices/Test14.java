package Testpractices;

import java.util.Scanner;

public class Test14 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int num=s.nextInt();
		System.out.println(isPalindrome(num));
	}
//	public static boolean isPalindrome(int x) {
//        int n=0;
//        for(int i = x;i>0;i/=10){
//            n = n*10+i%10;
//        }
//    return x==n;
//    }
	 public static boolean isPalindrome(int x) {
	        int num=x;
	        int rem=0;
	        int temp=0;
	        while(num>0){
	            rem=num%10;
	            System.out.println(rem);
	            temp=temp*10+rem;
//	            else
//	            temp=temp*10-rem;
	            num=num/10;
	            System.out.println(temp);
	            System.out.println(num);
	        }
	        return temp==x;
	    }
}
