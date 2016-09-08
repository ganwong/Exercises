package sort;

import java.util.Arrays;

/**
 * Created by wong on 16/5/17.
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 1, 4};
        System.out.println(Arrays.toString(a));
        countSort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void countSort(int[] a) {
        if (a == null || a.length == 0) return;
        int max = max(a);

        int[] count = new int[max + 1];
        Arrays.fill(count, 0);

        for (int i = 0; i < a.length; i ++) {
            count[a[i]] ++;
        }

        int k = 0;
        for (int i = 0; i <= max; i ++) {
            for (int j = 0; j < count[i]; j ++) {
                a[k ++] = i;
            }
        }

    }

    private static int max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int e : a) {
            if (e > max)
                max = e;
        }
        return max;
    }
}
