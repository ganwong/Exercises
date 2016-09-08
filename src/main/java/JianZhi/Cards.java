package JianZhi;

import java.util.Scanner;

/**
 * Created by wong on 16/8/17.
 */
public class Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[][] result = new int[times][];
        for (int t = 0; t < times; t++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];
            for (int i = 0; i < n; i++) {
                a1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a2[i] = sc.nextInt();
            }
            result[t] = washCards(a1, a2, k);
        }
    }
    public static int[] washCards(int[] a1, int[] a2, int k) {
        washKtimes(a1, a2, k);
        int length = a1.length;
        int[] whole = new int[length * 2];
        for (int i = 0; i < length; i++) {
            whole[i] = a1[i];
        }
        for (int i = 0; i < length; i++) {
            whole[i + length] = a2[i];
        }
        return whole;
    }
    public static void washKtimes(int[] a1, int[] a2, int k) {
        for (int i = 0; i < k; i++) {
            oneRound(a1, a2);
        }
    }
    public static void oneRound(int[] a1, int[] a2) {
        int length = a1.length * 2;
        int[] whole = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                whole[i] = a1[i / 2];
            }else {
                whole[i] = a2[i / 2];
            }
        }
        for (int i = 0; i < a1.length; i++) {
            a1[i] = whole[i];
            a2[i] = whole[i + a1.length];
        }
    }
}
