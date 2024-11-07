package programming;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAlphabetCount {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String inp=s.next();
		char a[]=inp.toCharArray();
		char copy[]=inp.toCharArray();
		Arrays.sort(copy);
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
		 System.out.println(a);
		 int totlen=uparr.length+lowarr.length;
		 String ord="";
		 int uit=0;
		 int lit=0;
		 while(ord.length()!=totlen) {
			 int upl=0,lwl=0;
			 if(uit<uparr.length) {
				 upl=uparr[uit]-64;
			 }
			 if(lit<lowarr.length) {
				 lwl=lowarr[lit]-96;
			 }	
			 if(upl==0) {
				 ord=ord+lowarr[lit];
				 lit++;
			 }
			 else if(lwl==0) {
				 ord=ord+uparr[uit];
				 uit++;
			 }
			 else if(upl==lwl) {
				 ord=ord+uparr[uit];
				 ord=ord+lowarr[lit];
				 uit++;
				 lit++;
			 }
			 else if(upl>lwl) {
				 ord=ord+lowarr[lit];
				 lit++;
			 }
			 else {
				 ord=ord+uparr[uit];
				 uit++;	
			 }
		 }
//		 System.out.println(ord);
		 char c[]=ord.toCharArray();
		 for(int i=0;i<c.length;i++) {
			 int count=0;
			 for(int j=0;j<a.length;j++) {
				 if(c[i]==a[j]) {
					 count++;
				 }
			 }
			 System.out.println(c[i]+" = "+count);
		 }
	}
}
