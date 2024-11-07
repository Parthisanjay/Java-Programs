package Testpractices;

class Temptest10{
	static Temptest10 t;
	static String s;
	public static String getA() {
		if(s==null) {
			s="partha";
			System.out.println("Block executed");
		}
		return s;
	}
}




public class Test10 {
	public static void main(String[] args) {
		System.out.println(Temptest10.getA());
		System.out.println(Temptest10.getA());
	}
}
