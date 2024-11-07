package programming;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
	public static void main(String[] args) {
		String s="";
		System.out.println(s.isEmpty());
//		ArrayList al= new ArrayList();
//		al.add(2);
//		al.add(-1);
//		al.add("test");
//		al.add('c');
//		al.add(true);
//		al.add(2);
//		al.remove(2);
//		System.out.println(al);
		List ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(30);
		ar.add(50);
		ar.add(10);
		ar.add(20);
		System.out.println(ar);
		int tot=0;
        for(int i=0;i<ar.size();i++){
            int count=1;
            if(ar.get(i)!=Integer.valueOf(0)) {
	            for(int j=i+1;j<ar.size();j++){
	                if(ar.get(i)==ar.get(j)){
	                    count++;
	                    ar.set(j,0);
	                }
	            }
	            if(count>1){
	                tot=tot+(count/2);
	            }
	            System.out.println(ar);
	        }
        }
        System.out.println(tot);
	}
}
