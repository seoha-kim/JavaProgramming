package chapter4;

class Static1 {
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

public class StaticSample1 {
	public static void main(String[] args) {
		Static1 s1, s2;
		s1 = new Static1();
		s1.n = 5;
		s1.g();
		s1.m = 50;
		s2 = new Static1();
		s2.n = 8;
		s2.h();
		s2.f();
		
		System.out.println(s1.m);
		System.out.println(s2.m);
	}
}
