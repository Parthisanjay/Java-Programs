package programming;

import java.util.Scanner;

public class AlphabetCount {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String inp=s.next();
		char a[]=inp.toCharArray();
		for(int i=0;i<a.length;i++) {
			int count=1;
			if(a[i]!=0) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						a[j]=0;
						count++;
					}
				}
				System.out.println(a[i]+" = "+count);
			}
		}
	}
}
