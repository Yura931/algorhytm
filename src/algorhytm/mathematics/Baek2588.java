package algorhytm.mathematics;

import java.util.Scanner;

public class Baek2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 일의자리
        sb.append(a *(b % 10));
        sb.append('\n');

        // 십의자리
        sb.append(a * ((b % 100) / 10));
        sb.append('\n');

        // 백의자리
        sb.append(a * ((b % 1000) / 100));
        sb.append('\n');

        sb.append(a * b);
        System.out.println(sb);
    }
}
