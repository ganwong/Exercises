package quiz;

/**
 * Created by wong on 16/5/15.
 */
public class checkIf2n {
    public static void main(String[] args) {
        System.out.println("4 ? " + checkIf2n(4));
        System.out.println("7 ? " + checkIf2n(7));
    }
    public static boolean checkIf2n(int n) {
        if (n < 1) return false;
        int m = n & (n - 1);
        return m == 0;
    }
}
