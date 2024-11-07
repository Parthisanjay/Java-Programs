package programming;

import java.util.Scanner;

public class Test2 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String inp=s.next();
		char a[]=inp.toCharArray();
		char copy[]=a;
		String temp="";
		for(int i=0;i<copy.length;i++) {
			if(copy[i]!=0) {
			for(int j=i+1;j<copy.length;j++) {
				if(copy[i]==copy[j]) {
					copy[j]=0;
				}
			}
			temp=temp+copy[i];
			}
		}
		copy=temp.toCharArray();
		 String up="";
		 String low="";
		 for(int i=0;i<copy.length;i++) {
			 if(copy[i]>=65 && copy[i]<=90) {
				 up=up+copy[i];
			 }
			 else if(copy[i]>=97 && copy[i]<=122) {
				 low=low+copy[i];
			 }
		 }
		 char uparr[]=up.toCharArray();
		 char lowarr[]=low.toCharArray();
		 System.out.println(uparr);
		 System.out.println(lowarr);
	}
}
