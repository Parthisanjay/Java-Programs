package programming;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray2 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[]= {50,60,70,80};		
		int c[]=new int[a.length+b.length];	
		
		for(int i=0,j=0,k=b.length-1;i<c.length;i++,j++) {
			if(j<a.length) {
			c[i]=a[j];}
			if(i>a.length-1) {
			c[i]=b[k];
			k--;
			}
		}
		System.out.println(Arrays.toString(c));
		
	
	}
}
//op
// 10 20 30 40 80 70 60 50
