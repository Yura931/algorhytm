package algorhytm.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1546 {
    // 점수 조작 평균 값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1;
        // 오차범위가 있기 때문에 자료형 1개 이상은 double형 사용. 자동 형변환이 되면서 자료형이 큰 쪽으로(int 에서 double) 변환 됨
        // 데이터가 다양해지거나, 제한 된 데이터형들이 존재하게 될 경우 실수 할 수도 있기 때문에 안전하게 모두 double형으로 선언해주는 것이 좋다.
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if(value > max) max = value;
            sum += value;
        }

        System.out.println(((sum / max) * 100.0) / N);


    }
}
