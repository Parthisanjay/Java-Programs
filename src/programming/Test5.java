package programming;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
//		String s1="flow";
//		String temp="flower";
//		int ind= s1.indexOf(temp);
//		System.out.println(ind);
		int n=5;
		System.out.println(Arrays.toString(zoho(n)));
		System.out.println(Integer.MAX_VALUE);
		int min=Integer.MAX_VALUE;
		int diff=7-min;
		int max=Math.max(diff, 0);
		System.out.println(max);
		System.out.println(Integer.MIN_VALUE);
	}
	public static int[] zoho(int num) {
	    int[] f = new int[num + 1];
	    for (int i = 1; i <= num; i++) {
	        f[i] = f[i >> 1] + (i & 1);
	    }
	    return f;
	}

}
