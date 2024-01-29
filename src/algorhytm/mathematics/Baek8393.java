package algorhytm.mathematics;

import java.util.Scanner;

public class Baek8393 {
    static int sum = 0;
    public static void main(String[] args) {
        // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

}
