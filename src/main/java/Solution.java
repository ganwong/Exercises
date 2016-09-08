import java.util.Arrays;

public class Solution {
    public enum Direction {
        LeftToRight, RightToLeft
    }
    /**
     * @param matrix: a matrix of integers
     * @return: an array of integers
     */
    public static int[] printZMatrix(int[][] matrix) {
        if (matrix == null) return null;
        int size = matrix.length * matrix[0].length;
        int i = 0;
        int x = 0, y = 0;
        Direction d = Direction.LeftToRight;
        int[] a = new int[size];
        int startX = 0, startY = 0;
        while (i < size) {
            if (d == Direction.LeftToRight) {
                while (i < size && x - 1 >= 0 && y + 1 < matrix[0].length) {
                    a[i] = matrix[x][y];
                    x--;
                    y++;
                    i++;
                }
                if (i < size && y + 1 < matrix[0].length) {
                    y++;
                }else if (i < size && x + 1 < matrix.length){
                    x++;
                }
                d = Direction.RightToLeft;
            }
            else if (d == Direction.RightToLeft) {
                while (i < size && x + 1 < matrix.length && y - 1 >= 0) {
                    a[i] = matrix[x][y];
                    x++;
                    y--;
                    i++;
                }
                if (i < size && x + 1 < matrix.length) {
                    x++;
                }else if (i < size && y + 1 < matrix[0].length){
                    y++;
                }
                d = Direction.LeftToRight;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2,  3,  4},
        {5, 6,  7,  8},
        {9,10, 11, 12}};
        int[] a = printZMatrix(matrix);
        System.out.println(Arrays.toString(a));
    }
//    public void help(int[] a, Direction d, int startX, int startY, int xMax, int yMax) {
//        if (d == Direction.LeftToRight) {
//            while (startX <= xMax - 1) {
//                a[startX][startY] =
//            }
//        }
//    }
}