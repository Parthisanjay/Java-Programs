package programming;

import java.util.Scanner;

public class ParanthesisAll {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String inp=s.next();
		char a[]=inp.toCharArray();
		int opcb=0;
		int clcb=0;
		int opfb=0;
		int clfb=0;
		int opsq=0;
		int clsq=0;
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]==')'&& opcb<=clcb) {
	    		clcb++;
	    		break;
	    	}
	    	else if(a[i]=='}'&& opfb<=clfb) {
	    		clfb++;
	    		break;
	    	}
	    	else if(a[i]==']'&& opsq<=clsq) {
	    		clsq++;
	    		break;
	    	}
	    	else if(a[i]=='(') {
	    		opcb++;
	    	}
	    	else if(a[i]==')') {
	    		clcb++;
	    	}
	    	else if(a[i]=='{') {
	    		opfb++;
	    	}
	    	else if(a[i]=='}') {
	    		clfb++;
	    	}
	    	else if(a[i]=='[') {
	    		opsq++;
	    	}
	    	else if(a[i]==']') {
	    		clsq++;
	    	}
	    }
	    String res=((opcb==clcb)&&(opfb==clfb)&&(opsq==clsq))?"Balanced":"Not Balanced";
	    System.out.println(res);
	}
}
 