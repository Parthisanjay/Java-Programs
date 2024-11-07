package programming;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {5,4,1,12,-5,16,2,12,14};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[j]<a[i]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
