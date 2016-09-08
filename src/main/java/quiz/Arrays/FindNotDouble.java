package quiz.Arrays;

/**
 * Created by wong on 16/6/1.
 */
public class FindNotDouble {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 4, 5};
        System.out.println(findNotDouble(a));
    }

    public static int findNotDouble(int[] a) {
        if (a.length == 0||a == null) {
            return -1;
        }
        int result = a[0];
        for (int i = 1; i < a.length; i ++) {
            result ^= a[i];
        }
        return result;
    }
}
