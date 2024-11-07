package programming;

public class main {
	static int k=1;
	main(){
		int k=12;
	}
	static int flare() {
		k=11;
		return k;
	}
	
	public static void main(String args[]) {
		flare();
		new main();
		System.out.println(k);
	}
}

//#include<stdio.h>
//int main() {
//	int var1=8;
//	int var2=9;
//	if((var2=1)==var1)
//		printf("%d",var2);
//	    printf("%d",++var2);
//}

//#include<stdio.h>
//int main() {
//	int c[]= {5,4,3,4,5};
//	int j,*q=c;
//	for(j=0;j<5;j++) {
//		printf("%d",*c);
//		++q;
//	}	
//}