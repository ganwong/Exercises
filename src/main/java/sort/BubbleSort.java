package sort;

import java.util.Arrays;

/**
 * Created by wong on 16/5/15.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Double[] list = {1.5, 2.6, 1.2, 6.2, 5.1, 7.0};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    private static <T extends Comparable<T>> void bubbleSort(T[] list) {
        if (list == null) return;
        for (int i = 1; i < list.length; i ++) {
            for (int j = list.length - 1; j >= i; j --) {
                if (list[j].compareTo(list[j - 1]) < 0) {
                    T tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }
}
