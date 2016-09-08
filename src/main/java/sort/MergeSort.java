package sort;

import java.util.Arrays;

/**
 * Created by wong on 16/5/17.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 6, 1};
        System.out.println(Arrays.toString(a));
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int[] a) {
        mSort(a, 0, a.length - 1);
    }

    private static void mSort(int[] a, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;

        mSort(a, left, mid);
        mSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                tmp[k ++] = a[i ++];
            }
            else {
                tmp[k ++] = a[j ++];
            }
        }

        while (i <= mid) {
            tmp[k ++] = a[i ++];
        }

        while (j <= right) {
            tmp[k ++] = a[j ++];
        }

        for (int p = 0; p < tmp.length; p ++) {
            a[left + p] = tmp[p];
        }
    }
}
