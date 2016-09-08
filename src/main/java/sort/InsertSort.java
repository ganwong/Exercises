package sort;

import java.util.Arrays;

/**
 * Created by wong on 16/5/15.
 */
public class InsertSort {
    public static void main(String[] args) {
        Integer[] list = {3, 2, 7, 7, 1};
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }

    private static <T extends Comparable<T>> void insertSort(T[] list) {
        if (list == null) return;
        for (int i = 1; i < list.length; i ++) {
            int j = i;
            T tmp = list[j];
            while (j > 0 && list[j - 1].compareTo(tmp) > 0) {
                list[j] = list[j - 1];
                j --;
            }
            list[j] = tmp;
        }
    }


}
