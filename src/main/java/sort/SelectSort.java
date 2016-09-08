package sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        String[] list = {"ab", "Ab"};
        Integer[] list2 = {4, 3, 2, 1, 6};
        selectSort(list);
        System.out.println(Arrays.toString(list));
        selectSort(list2);
        System.out.println(Arrays.toString(list2));

    }

    public static <T extends Comparable<T>> void selectSort(T[] list) {
        if (list == null) return;
        for (int i = 0; i < list.length - 1; i ++) {
            T min = list[i];
            int index = i;
            for (int j = i + 1; j < list.length; j ++) {
                if (list[j].compareTo(min) < 0) {
                    min = list[j];
                    index = j;
                }
            }
            list[index] = list[i];
            list[i] = min;
        }
    }
}
