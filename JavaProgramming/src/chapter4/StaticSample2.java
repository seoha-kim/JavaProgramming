package chapter4;

class Sample2{
	public int n;
	public void g() {
		m = 20;
	}
	
	public void h() {
		m = 30;
	}
	
	public static int m;
	public static void f() {
		m = 5;
	}
}

public class StaticSample2 {
	public static void main(String[] args) {
		Sample2.m = 10;
		
		Sample2 s1;
		s1 = new Sample2();
		System.out.println(s1.m);
		s1.f();
		Sample2.f();
	}
}
