import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }
    static void simple(int x) {
        String answer = "YES";
        if (x <= 1) {
            answer = "NO";
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    answer = "NO";
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}