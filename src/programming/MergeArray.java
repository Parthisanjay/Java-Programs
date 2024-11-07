package programming;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {50,60,70,80};		
		int c[]=new int[a.length+b.length];	
		
		for(int i=0,j=0,k=b.length-1;i<c.length;i+=2,j++,k--) {
			if(j<a.length) {
			c[i]=a[j];}
			if(k>=0) {
			c[i+1]=b[k];}
		}
		System.out.println(Arrays.toString(c));
		
	
	}
}
//op
//10 80 20 70 30 60 40 50