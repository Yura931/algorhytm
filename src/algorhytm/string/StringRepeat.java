package algorhytm.string;

import java.util.Scanner;

public class StringRepeat {
    // 주어진 문자열을 주어진 수만큼 반복
    // repeat 함수를 사용해서 간단하게 처리 가능
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(5));
    }
}
