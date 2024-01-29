package algorhytm.mathematics;

import java.util.Scanner;

public class Baek2884 {
    
    // 45분 전으로 알람 맞추기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int alarmHour = h;
        int alarmMin = m - 45;

        if(alarmMin < 0) {
            if (alarmHour == 0) {
                alarmHour = 23;
            } else {
                alarmHour = h - 1;
            }
            alarmMin = 60 - (45 - m);
        }
        System.out.println(alarmHour + " " + alarmMin);

        // 시간을 분으로 변환 후 게산
        if(h == 0) h = 24;
        h =  h * 60 + m - 45;
        System.out.println((h / 60) + " " + (h % 60));
    }
}
