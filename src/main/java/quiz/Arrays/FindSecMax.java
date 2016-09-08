package quiz.Arrays;

/**
 * Created by wong on 16/6/1.
 */
public class FindSecMax {
    public static void main(String[] args) {
        Integer[] a = {1, 3, 5, 4};
        System.out.println(findSecMax(a));
    }
    public static<T extends Comparable<? super T>> T findSecMax(T[] a) {
        if (a.length == 0 || a == null) return null;
        T max = a[0];
        T sec = a[0];
        for (int i = 0; i < a.length; i ++) {
            if (a[i].compareTo(max) > 0) {
                sec = max;
                max = a[i];
            }else if (a[i].compareTo(sec) > 0) {
                sec = a[i];
            }
        }
        return sec;
    }
}
