import java.lang.reflect.Array;
import java.util.*;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = reverse(s);
        System.out.println(String.valueOf(c));
    }
    public static void swap(char[] a, int left, int right) {
        if (a == null || left >= right) {
            return ;
        }
        while (left < right) {
            char c = a[left];
            a[left] = a[right];
            a[right] = c;
            left ++;
            right --;
        }
    }
    public static char[] reverse(String s) {
        char[] a = s.toCharArray();
        swap(a, 0, s.length() - 1);
        int left = 0, right = s.length() - 1;
        for (int i = 0; i < s.length(); i ++) {
            if (a[i] == ' ') {
                swap(a, left, i - 1);
                left = i + 1;
            }
        }
        swap(a, left, right);
        return a;
    }
}