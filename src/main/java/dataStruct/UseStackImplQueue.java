package dataStruct;

import java.util.Stack;

/**
 * Created by wong on 16/5/15.
 */
public class UseStackImplQueue<T> {
    private Stack<T> s1 = new Stack<>();
    private Stack<T> s2 = new Stack<>();

    public synchronized void put(T value) {
        s1.push(value);
    }

    public synchronized T pop() {
        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());
        return s2.pop();
    }

    public synchronized boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        UseStackImplQueue<Integer> q = new UseStackImplQueue<>();
        q.put(2);
        q.put(3);
        q.put(1);
        System.out.println(q.pop());
    }
}
