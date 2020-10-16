package chapter4;

public class MyExp {
	int base;
	int exp;
	int getValue() {
		int res=1;
		for (int i=0; i<exp; i++)
			res = res * base;
		return res;
	}
	
	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		number1.base = 2;
		number1.exp = 3;
		
		MyExp number2 = new MyExp();
		number2.base = 3;
		number2.exp = 4;
		
		System.out.println("2의 3승 = "+number1.getValue());
		System.out.println("3의 승 = "+number2.getValue());

	}

}
