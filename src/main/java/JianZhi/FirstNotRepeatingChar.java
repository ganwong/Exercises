package JianZhi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wong on 16/7/19.
 */
public class FirstNotRepeatingChar {
    public static char firstNotRepeatingChar(String s) {
        if (s == null || s.length() == 0) return '\0';
        char arr[] = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (char c : arr) {
            if (m.containsKey(c))
                m.put(c, m.get(c) + 1);
            else m.put(c, 1);
        }
        for (char c : arr) {
            if (m.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String s = "abaccdeff";
        String s2 = "aabbcc";
        String s3 = "febacf";
        String s4 = null;
        System.out.println(firstNotRepeatingChar(s));
        System.out.println(firstNotRepeatingChar(s2));
        System.out.println(firstNotRepeatingChar(s3));
        System.out.println(firstNotRepeatingChar(s4));
    }
}
