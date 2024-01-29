package algorhytm.month05;

import java.math.BigInteger;
import java.util.Scanner;

public class Baek_2338 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		// 입력 조건의 '10진수로 1000자리를 넘지 않는 수'는 아주 큰 수로 int Type으로는 부족
		// int가 아닌 문자열 형태로 이루어져 숫자의 범위가 무한인 BigInteger를 이용
		// int의 범위는 '-2,147,483,648 ~ 2,147,483,647'
		// BigInteger 클래스 내부 함수 사용
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b)); 
	}
}
