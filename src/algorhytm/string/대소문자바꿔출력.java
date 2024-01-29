package algorhytm.string;

import java.util.Scanner;

public class 대소문자바꿔출력 {

    public static String solutionA(String str) {
        StringBuffer sb = new StringBuffer();
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x))
                sb.append(Character.toUpperCase(x));

            if(Character.isUpperCase(x))
                sb.append(Character.toLowerCase(x));
        }

        answer = sb.toString();
        return answer;
    }

    public static String solutionB(String str) {
        // 아스키 코드
        // 대문자 65 ~ 90
        // 소문자 97 ~ 122
        // 둘 차이는 32
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for (char x : str.toCharArray()) {
            if ( x >= 65 && x <= 90)
                sb.append((char)(x + 32));  // 형변환 안 하면 숫자 출력

            if ( x >= 97 && x <= 122)
                sb.append((char)(x - 32));
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
/*
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));

            if(Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
        }
*/



        System.out.println(solutionA(str));
        System.out.println(solutionB(str));
    }
}
