package sort;

import java.util.Arrays;

public class HeapSort {
    private static int getParentIndex(int index) {
        return (index - 1) >> 1;
    }
    private static int getLeftChildIndex(int index) {
        return (index << 1) + 1;
    }
    private static int getRightChildIndex(int index) {
        return (index << 1) + 2;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 2, 0};
        buildMaxHeap(a);
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void heapSort(int[] a) {
        for (int i = a.length - 1; i > 0; i --) {
            int tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            maxHeapify(a, i, 0);
        }
    }

    private static void buildMaxHeap(int[] a) {
        int start = getParentIndex(a.length - 1);
        for (int i = start; i >= 0; i --) {
            maxHeapify(a, a.length, i);
        }
    }

    private static void maxHeapify(int[] a, int heapSize, int index) {
        int left = getLeftChildIndex(index);
        int right = getRightChildIndex(index);
        int largest = index;

        if (left < heapSize && a[left] > a[largest]) largest = left;
        if (right < heapSize && a[right] > a[largest]) largest = right;

        if (largest != index) {
            int tmp = a[largest];
            a[largest] = a[index];
            a[index] = tmp;
            maxHeapify(a, heapSize, largest);
        }
    }


}