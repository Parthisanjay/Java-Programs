package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Paranthesis {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String inp=s.next();
		char a[]=inp.toCharArray();
		int op=0;
		int cl=0;
//	    System.out.println(Arrays.toString(arr));
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]==')'&& op<=cl) {
	    		cl++;
//	    		System.out.println("Not Balanced");
	    		break;
	    	}
	    	else if(a[i]=='(') {
	    		op++;
	    	}
	    	else if(a[i]==')') {
	    		cl++;
	    	}
	    }
	    String res=(op==cl)?"Balanced":"Not Balanced";
	    System.out.println(res);
	}
}