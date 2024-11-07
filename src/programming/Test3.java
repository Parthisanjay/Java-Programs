package programming;

public class Test3 {
	public static void main(String[] args) {
//		String s="Malayalam";
//		s=s.toLowerCase();
//		char a[]=s.toCharArray();
//		System.out.println(m1(a));
		double d=20;
		String s1=""+d;
		System.out.println(s1);
		double a=Double.parseDouble(s1);
		System.out.println(a);
		
		
	}
	
	public static char m1(char a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					return a[i];
				}
			}
		}
		return '0';
	}
}
