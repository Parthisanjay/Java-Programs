package Testpractices;

class Temptest11{
	static int a=1;
	static String s="static";
	int b=2;
	String ns="Nonstatic";
}



public class Test11 {
	public static void main(String[] args) {
		Temptest11 t= new Temptest11();
		System.out.println(t.a);
		System.out.println(t.s);
		System.out.println(t.b);
		System.out.println(t.ns);
		t.a=3;
		t.s="static altered";
		t.b=4;
		t.ns="Nonstatic altered";
		System.out.println(t.a);
		System.out.println(t.s);
		System.out.println(t.b);
		System.out.println(t.ns);
		
		Temptest11 t1= new Temptest11();
		System.out.println(t1.a);
		System.out.println(t1.s);
		System.out.println(t1.b);
		System.out.println(t1.ns);
		
	}
}
