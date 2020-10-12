package chapter2;

public class Hello2 {
	public static int sum(int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);	// 문자 ? 화면 출력 
		System.out.println("Hello2");	// "Hello" 화면 출력 
		System.out.println(s);	// 정수 s값 화면 출력 

	}

}
