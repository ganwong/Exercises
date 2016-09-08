package quiz;

/**
 * Created by wong on 16/5/15.
 * 当乘数满足条件时, 利用移位操作实现乘法运算
 */
public class multiByBit {
    public static void main(String[] args) {
        System.out.println("3 * 8 = " + multi(3, 3));
    }

    public static int multi(int a, int b) {
        for (int i = 0; i < b; i ++) {
            a = a << 1;
        }
        return a;
    }
}
