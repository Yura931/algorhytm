package algorhytm.month05;

import java.math.BigInteger;
import java.util.Scanner;

public class Baek_1271 {
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 생명체 수
		BigInteger a = sc.nextBigInteger();
		 
		// 분배할 돈 
		BigInteger b = sc.nextBigInteger();
        
		System.out.println(a.divide(b));
		System.out.println(a.mod(b)); 
		
	}
}
