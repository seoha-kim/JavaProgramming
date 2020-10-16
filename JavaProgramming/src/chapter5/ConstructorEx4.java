package chapter5;

class A1 {
	public A1() {
		System.out.println("생성자A");
	}
	
	public A1(int x) {
		System.out.println("매개변수생성자A"+x);
	}
}

class B1 extends A1 {
	public B1() {
		System.out.println("생성자B");
	}
	public B1(int x) {
		super(x);
		System.out.println("매개변수생성자B"+x);
	}
}

public class ConstructorEx4 {

	public static void main(String[] args) {
		B1 b;
		b = new B1(5);
	}

}
