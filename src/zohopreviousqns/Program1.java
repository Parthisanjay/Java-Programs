package zohopreviousqns;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		String version1="1.0.1";
		String version2="1";
		System.out.println(compareVersion(version1,version2));
	}
	public static int compareVersion(String version1, String version2) {
//        char s1[]=version1.toCharArray();
//        char s2[]=version2.toCharArray();
		
        // int size=(s1.length<s2.length)?dotCount(s1):dotCount(s2);
//        System.out.println(Arrays.toString(s1));
		String s1=version1;
		String s2=version2;
        int inds1=0,inds2=0;
        int res=0;
        int start1=0;
        int start2=0;
       while(inds1!=s1.length() || inds2!=s2.length()){
            int v1=0,v2=0;
            while(inds1<s1.length()){
	                if(s1.charAt(inds1)=='.'){
	                    v1=Integer.parseInt(s1.substring(start1, inds1));
	                    inds1++;
	                    start1=inds1;
	                    break;
	                }
	                else{
	                	inds1++;
	                    v1=Integer.parseInt(s1.substring(start1, inds1));
	                }
                }
            while(inds2<s2.length()){
                if(s2.charAt(inds2)=='.'){
                	v2=Integer.parseInt(s2.substring(start2, inds2));
                    inds2++;
                    start2=inds2;
                    break;
                }
                else{    
                	inds2++;
                    v2=Integer.parseInt(s2.substring(start2, inds2));
                }
                }
            System.out.println(v1+""+v2);
                res=compare(v1,v2);
                if(res!=0)
                    return res;
            }
            return res;

    }
    public static int compare(int v1,int v2){
        if(v1<v2)
            return -1;
        else if(v1>v2)
            return 1;
        else
            return 0;
    }
}
