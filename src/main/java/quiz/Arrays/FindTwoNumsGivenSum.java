package quiz.Arrays;

import sort.QuickSort;

import java.util.Arrays;

/**
 * Created by wong on 16/6/1.
 */
public class FindTwoNumsGivenSum {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 1};
        getCombs(a, 3);
    }

    public static Integer[] intToIntegerArray(int[] a) {
        Integer[] a2 = new Integer[a.length];
        for (int i = 0; i < a.length; i ++) {
            a2[i] = a[i];
        }
        return a2;
    }

    public static void getCombs(int[] list, int target) {
        if (list.length == 0 || list == null) return ;
        Integer[] a = intToIntegerArray(list);
        QuickSort.quickSort(a);

        int front = 0;
        int end = a.length - 1;
        while (front < end) {
            if (a[front] + a[end] > target) {
                end --;
            }else if (a[front] + a[end] < target) {
                front ++;
            }else {
                System.out.printf("(%d, %d)", a[front], a[end]);
                front ++;
                end --;
            }
        }
    }
}
