package programming;

import java.util.Scanner;

public class NegativeCount {
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Size of the Array");
		int size=s.nextInt();
		
		int[] a=new int[size];
		
		//taking values from the user
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		int count=0;
		
		//Count the Negative values
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<0) {
				count++;
			}
		}
		
		System.out.println("NegativeCount is: "+count);
		
	}
}
