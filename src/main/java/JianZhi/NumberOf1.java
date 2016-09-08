package JianZhi;

import java.util.Scanner;

/**
 * Created by wong on 16/8/12.
 */
public class NumberOf1 {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(numberOf1_s1(n));
        System.out.println(numberOf1_s2(n));
    }
    public static int numberOf1_s1(int n) {
        int m = 1;
        int cnt = 0;
        while (m != 0) {
            if ((n & m) != 0) {
                cnt++;
            }
            m = m << 1;
        }
        return cnt;
    }
    public static int numberOf1_s2(int n) {
        int cnt = 0;
        while (n != 0) {
            n &= n - 1;
            cnt++;
        }
        return cnt;
    }
}
