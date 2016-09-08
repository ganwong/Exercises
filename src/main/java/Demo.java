public class Demo {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 0;
        if (m == 1) return 1;
        if (n == 1) return 1;
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }
    public static int uniquePaths2(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            sum[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            sum[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
            }
        }
        return sum[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 3, n = 7;
        long start, end;
        start = System.currentTimeMillis();
        System.out.println(uniquePaths(7, 68));
        end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(uniquePaths2(7, 68));
        end = System.currentTimeMillis();
        int $hehe = 1;
        System.out.println($hehe);
        System.out.println("time: " + (end - start));
    }
}
