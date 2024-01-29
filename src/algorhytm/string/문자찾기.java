package algorhytm.string;

import java.util.Scanner;

public class 문자찾기 {

    // 대소문자 구분 없이
    public static int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == t) answer++;
//        }

        for(char x : str.toCharArray()) // 문자열 문자 배열로 변환
            if(x == t) answer++;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        System.out.println(solution(str, ch));
    }
}
