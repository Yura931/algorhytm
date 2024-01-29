package algorhytm.mathematics;

import java.io.*;
import java.util.StringTokenizer;

public class Baek15552 {

    // 빠른 A + B
    public static void main(String[] args) throws IOException {
        /*
            알고리즘 입출력의 경우 자바는 보통 Scanner를 사용
            하지만 Scanner 자체가 regular expression, 정규식을 거쳐 입력이 되기 때문에 빠른 입력이 안 됨
            사용자 입장에서 편리한 점은 있지만 알고리즘에서는 사용자가 직접 필요에 따라 파싱하는게 더욱 빠름
            그래서 BufferedReader를 사용!

            Scanner 자체가 입력을 받으면 구문분석을 위해 정규식을 거치게 되고 BufferedReader는 그런 특별한 구문분석이 없어서 속도차이가 발생
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 반복문 마다 객체가 새로 생성되므로 StringTokenizer()를 사용하지 않고
            // " " 공백을 기준으로 문자의 위치를 찾아 String.substring()을 사용해 문자를 분리해주는 방법이 더 빠를 수도 있다.
            st = new StringTokenizer(br.readLine());
            // 데이터의 양이 많지 않은 경우 write보다 StringBuilder를 통해 append해준 후 출력하는 것이 더 빠를 수도 있음
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
