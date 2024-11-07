package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Email {
	static Scanner s = new Scanner(System.in);
	static boolean firstcheck=false;
	static String res="Invalid e-mail";
	static boolean resflag;
	static boolean usernamecheck;
	static boolean domaincheck;
	public static void main(String[] args) {
		System.out.println("Enter the e-mail");
		String str=s.next();
		char a[]=str.toCharArray();
		int count=0;
		int atcount=0;
		int atindex=0;
		int dotindex=0;
		for(int i=0;i<a.length;i++) {
			if((a[i]>='a'&&a[i]<='z')||(a[i]>='0'&&a[i]<='9')||(a[i]=='.')||(a[i]=='_')||(a[i]=='-')) {
				count++;
			}
			else if(a[i]=='@') {
				atindex=i;
				atcount++;
			}
		}
		
		if((a.length==count+atcount)&& atcount==1 && atindex>0) {
			firstcheck=true;
		}
		for(int i=atindex+1;i<a.length;i++) {
			if(a[i]>='0'&&a[i]<='9') {
				firstcheck=false;
				break;
			}
		}
//		char username[]=new char[atindex];
//		int alp=0;
		if(firstcheck) {
//			for(int i=0;i<atindex;i++) {
//				username[i]=a[i];
//			}
//			usernamecheck=validCheck(username);
			usernamecheck=opera(0,atindex,0,a,atindex);
			if(usernamecheck) {
				domaincheck=opera(atindex+1,0,a.length,a,(a.length-1)-atindex);
			}
		}
		if(domaincheck) {
			res="Valid e-mail";
		}
		System.out.println(res);
		
	}
	public static boolean opera(int sindex,int atindex,int dmindex,char a[],int arrsize) {
		boolean flag=false;
		int eindex=atindex+dmindex;
		char temp[]=new char[arrsize];
		for(int i=sindex,j=0;i<eindex;i++,j++) {
			temp[j]=a[i];
		}
		flag=validCheck(temp);
//		System.out.println(Arrays.toString(temp));
		return flag;
	}
	public static boolean validCheck(char t[]) {
		if((t[0]!='.'&&t[t.length-1]!='.')&&(t[0]!='_'&&t[t.length-1]!='_')&&(t[0]!='-'&&t[t.length-1]!='-')) {
			for(int i=0;i<t.length-1;i++) {
				if(t[i]=='.' || t[i]=='_' || t[i]=='-') {
					if(t[i+1]=='.' || t[i+1]=='_' || t[i+1]=='-') {
						return false;
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
		
	}
}
