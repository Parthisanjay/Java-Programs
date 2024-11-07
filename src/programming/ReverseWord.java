package programming;

import java.util.Scanner;

public class ReverseWord {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Sentence");
		String str=s.nextLine();
		char a[]=str.toCharArray();
		int it=0;
		for(int i=0;it<a.length;i++) {
			String temp="";
			for(int j=it;j<a.length;j++) {
				if(a[j]!=' ') {
					temp=temp+a[j];
					it++;
				}
				else {
					it++;
					break;
				}
			}
			rev(temp);
		}
	}
	public static void rev(String s1){
		String res="";
		char c[]=s1.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			res=res+c[i];
		}
		System.out.print(res+" ");
	}
}
