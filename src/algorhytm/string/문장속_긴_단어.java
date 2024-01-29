package algorhytm.string;

import java.util.Scanner;

public class 문장속_긴_단어 {

    public static String solutionA(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;    // 가장 작은 값으로 초기화
        String[] strArr = str.split(" ");
        for(String x : strArr) {
            int len = x.length();
            if(len > max) {
                max = len;
                answer = x;
            }
        }

        return answer;
    }

    public static String solutionB(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1) { 
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);   // 탐색해야 할 문자열 변경
        }
        
        if(str.length() > max) answer = str;    // 마지막 단어의 경우 단어 끝 공백이 없기 때문에 인식하지 못함. 따로 처리
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solutionA(str));
        System.out.println(solutionB(str));
    }
}
