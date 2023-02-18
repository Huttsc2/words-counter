import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        int hour;
        int minute;
        if (second >= 3600) {
            hour = second/3600;
            second = second%(hour*3600);
        } else {
            hour = 0;
        }
        if (second >= 60) {
            minute = second/60;
            second = second%(minute*60);
        } else {
            minute = 0;
        }
        System.out.println(hour + "h " + minute + "m " + second  + "s");
    }
}
