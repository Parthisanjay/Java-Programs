package Testpractices;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            String s2="";
            int x=sc.nextInt();
//            System.out.printf("%-10s%+18d%03d%n",s1,sp,x);
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
	}
}
