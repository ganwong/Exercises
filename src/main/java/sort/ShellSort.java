package sort;

import java.util.Arrays;

/**
 * Created by wong on 16/5/17.
 */
public class ShellSort {
    public static void shellSort(int[] a) {
        int gap = 1, i, j, len = a.length;
        int temp;
        while (gap < len / 3)
            gap = gap * 3 + 1;
        for (; gap > 0; gap /= 3)
            for (i = gap; i < len; i ++) {
                temp = a[i];
                for (j = i - gap; j >= 0 && a[j] > temp; j -= gap)
                    a[j + gap] = a[j];
                a[j + gap] = temp;
            }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 7, 5};
        System.out.println(Arrays.toString(a));
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }
}
