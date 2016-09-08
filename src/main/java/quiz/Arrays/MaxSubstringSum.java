package quiz.Arrays;

/**
 * 求整型数组最大子串和
 * Created by wong on 16/6/1.
 */
public class MaxSubstringSum {
    public static void main(String[] args) {
        int[] a = {-1, 1, 3, -1, 0, -4, 5, 5};
        System.out.println(getMaxSubstringSum(a));
    }
    public static int getMaxSubstringSum(int[] a) {
        if (a.length == 0||a == null) return -1;
        int max = a[0];
        int tmp = a[0];
        for (int i = 1; i < a.length; i ++) {
            if (tmp < 0) {
                tmp = a[i];
            }else {
                tmp += a[i];
            }
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }
}
