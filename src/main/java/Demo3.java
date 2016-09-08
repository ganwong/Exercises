import java.util.HashMap;
import java.util.Map;

/**
 * Created by wong on 16/7/20.
 */
public class Demo3 {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('a', 1);
        m.put('b', 1);
        System.out.println(m);
        m.put('b', m.get('b') + 1);
        System.out.println(m);
    }
}
