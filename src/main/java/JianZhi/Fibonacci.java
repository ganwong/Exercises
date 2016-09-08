package JianZhi;

import java.util.Scanner;

/**
 * Created by wong on 16/8/12.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 0) return -1;
        int f1 = 0, f2 = 1, f3 = 1;
        if (n == 1) return f1;
        if (n == 2) return f2;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
