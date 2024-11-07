package programming;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumNonStatic {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		DuplicateNumNonStatic ds= new DuplicateNumNonStatic(); 
		System.out.println("Enter the Numbers");
		String str=s.next();
		int a[]=new int[str.length()];
		for(int i=0;i<a.length;i++) {
			String s1=""+str.charAt(i);
			a[i]=Integer.parseInt(s1);
		}
		int result=ds.m1(a);
		System.out.println(result);	
	}
	
	public int m1(int a[]) {
		String temp="";
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
			 }
			temp=temp+a[i];
			}	
		}
		int res=Integer.parseInt(temp);
		return res;
	}
}

//i/p
//
//Enter the Numbers
//8248847857

//o/p
//82475