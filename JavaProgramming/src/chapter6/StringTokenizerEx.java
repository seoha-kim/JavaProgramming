package chapter6;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팔쥐", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}

}
