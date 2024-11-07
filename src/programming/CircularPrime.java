package programming;

import java.util.Scanner;

public class CircularPrime {
	static Scanner s = new Scanner(System.in);
	static boolean notprime=false;
	static String res=" is a Circular PrimeNumber";
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int inp=s.nextInt();
		int num=inp;
		if(num!=1 && num!=0) {
			do{
				int rem=0;
				rem=num%10;
				num=num/10;
				String s1=""+rem;
				if(num!=0) {
					s1=s1+num;
				}
				num=Integer.parseInt(s1);
				primeCheck(num);
				if(notprime) {
					res=" is Not a Circular PrimeNumber";
					break;
				}		
			}while(num!=inp);
			System.out.println(inp+res);
	  }
		else {
			System.out.println(inp+" is Neither Prime Nor Composite");
		}
	}
	public static void primeCheck(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				notprime=true;
				break;
			}
		}
	}
}
