import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int[] a = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            a[i - 1] = (int) Math.pow(i, 3);
        }
        System.out.println(a[x - 1]);
        System.out.println(a[y - 1]);
    }
}

