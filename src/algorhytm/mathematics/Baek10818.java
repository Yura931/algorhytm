package algorhytm.mathematics;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Baek10818 {

    // 최솟값 최댓값 찾기
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 배열 정렬 후 첫번째 인덱스 값, 마지막 인덱스 값으로 최소, 최대 값 찾는 방법
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length - 1]);

    }
}
