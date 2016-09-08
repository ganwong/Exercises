package quiz;

/**
 * Created by wong on 16/5/15.
 */
public class countOneNum {
    public static void main(String[] args) {
        System.out.println(countOneNum2(5));
    }
    public static int countOneNum(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                cnt ++;
            }
            n >>= 1;
        }
        return cnt;
    }

    /**
     * 这样效率为O(m), 算法1效率为O(n), m为1的个数
     * @param n
     * @return
     */
    public static int countOneNum2(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt ++;
            n &= n - 1;
        }
        return cnt;
    }
}
