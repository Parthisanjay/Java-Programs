package Testpractices;
class Temp12A{
	public void m1() {
		System.out.println("A method");
	}
}
class Temp12B extends Temp12A{
	public void m1() {
		System.out.println("B method");
	}
}
class Temp12C extends Temp12B{
	public void m1() {
		System.out.println("C method");
	}
}
public class Test12 {
	public static void main(String[] args) {
		Temp12A t= new Temp12C();
		t.m1();
	}
}
