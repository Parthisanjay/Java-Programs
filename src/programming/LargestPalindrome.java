package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LargestPalindrome {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int count=0;
		int arr[]=new int[628];
		int in=0;
		for(int i=999;i>=100;i--) {
			int prod=0;
			int res=0;
			for(int j=999;j>=100;j--) {
				prod=j*i;
				res=revCheck(prod);
				if(prod==res) {
					arr[in++]=res;
					count++;
//					System.out.println("Largest palindrome is "+res);
					break;
				}
			 }
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		System.out.println("Largest Palindrome is "+arr[arr.length-1]);		
	}
	public static int revCheck(int rev) {
		int num=0;
		String sum="";
		int rem=0;
		num=rev;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;		
		}
		int res=Integer.parseInt(sum);
		return res;	
	}
	
}
