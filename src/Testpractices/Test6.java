package Testpractices;

import java.util.Arrays;

public class Test6 {
	
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
//		 int arr[][]= {{1,2},{3,4}};
//		 System.out.println(Arrays.toString(arr));
//		int num=2;
//		switch(num) {
//		case 1:{
//			System.out.println("case 1");
//		}
////		case 2:{
////			System.out.println("case 2");
////		}
//		
//		default:{
//			System.out.println("default");
//		}
//		case 3:{
//			System.out.println("case 3");
//		}
//		}
		int i=0;
		for(foo('A');foo('B')&&(i<2);foo('C')) {
			i++;
			foo('D');
		}
		
		
	}
}

//#include<stdio.h>
//void function(int[][3]);
//int main(void) {
//	int a[3][3]= {1,2,3,4,5,6,7,8,9};
//	funtion(a);
//	printf("%d\n",a[2][1]);
//	return 0;
//}