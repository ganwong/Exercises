package sort;

import java.util.Arrays;

/**
 * Created by wong on 16/5/17.
 */
public class QuickSort {
    public static void main(String[] args) {
        Integer[] a = {5, 3, 1, 7, 8};
        System.out.println(Arrays.toString(a));
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static <T extends Comparable> void quickSort(T[] list) {
        if (list == null) return;
        qsort(list, 0, list.length - 1);
    }

    public static <T extends Comparable> void qsort(T[] list, int left, int right) {
        int base;
        if (right > left) {
            base = sort(list, left, right);
            qsort(list, left, base - 1);
            qsort(list, base + 1, right);
        }
    }

    public static <T extends Comparable> int sort(T[] list, int left, int right) {
        T base = list[left];
        while (right > left) {
            while (right > left && list[right].compareTo(base) >= 0) {
                right --;
            }
            list[left] = list[right];
            while (right > left && list[left].compareTo(base) <= 0) {
                left ++;
            }
            list[right] = list[left];
        }
        list[left] = base;
        return left;
    }


}
