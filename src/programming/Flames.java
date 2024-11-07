package programming;

import java.util.Scanner;

public class Flames {
	static Scanner s= new Scanner(System.in);
	static int it;
	public static void main(String[] args) {
		System.out.println("======FLAMES======");
		System.out.println("Enter the Boy name");
		String boy=s.nextLine();
		String b1=boy.toLowerCase();
		System.out.println("Enter the Girl name");
		String girl=s.nextLine();
		String g1=girl.toLowerCase();
		char b[]=b1.toCharArray();
		char g[]=g1.toCharArray();
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<g.length;j++) {
				if(g[j]==' ') {
					g[j]=0;
				}
			    else if(b[i]==g[j]) {
					b[i]=0;
					g[j]=0;
					break;
				}
				else if(b[i]==' ') {
					b[i]=0;
					break;
				}
			}
		}
		String remains="";
		for(int i=0;i<b.length+g.length;i++) {
			if(i<b.length) {
				if(b[i]!=0) {
					remains=remains+b[i];
				}
			}
			if(i<g.length) {
				if(g[i]!=0) {
					remains=remains+g[i];
				}
			}
		}
		String res="FLAMES";
		while(res.length()!=1) {
			res=opera(res,remains.length());
		}
		System.out.println("Your Result is...");
		System.out.println("*******************");
		switch(res) {
			case "F":{
				System.out.println("FRIEND");
				break;
			}
			case "L":{
				System.out.println("LOVE");
				break;
			}
			case "A":{
				System.out.println("AFFECTION");
				break;
			}
			case "M":{
				System.out.println("MARRIAGE");
				break;
			}
			case "E":{
				System.out.println("ENEMY");
				break;
			}
			case "S":{
				System.out.println("SISTER");
				break;
			}
		}
		System.out.println("*******************");
	}
	public static String opera(String str,int rot) {
		char temp[]=str.toCharArray();
		for(int i=1;i<=rot;i++,it++) {
			if(i==rot) {
				temp[it]=0;
				if(it==temp.length-1) {
					it=0;
					break;
				}
				break;
			}
			if(it==temp.length-1) {
				it=-1;
			}
		}
		String rem="";
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=0) {
				rem=rem+temp[i];
			}
		}
		return rem;
	}
}
