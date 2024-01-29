package algorhytm.month05;

import java.util.Scanner;

public class Baek_1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		// 16진수를 입력받아 10진수로 변환 Integer.parseInt(string, radix)활용
		int b = Integer.parseInt(a, 16);
		System.out.println(b); 
	}
}
