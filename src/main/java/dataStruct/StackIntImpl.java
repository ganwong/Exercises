package dataStruct;

import java.util.Arrays;

/**
 * Created by wong on 16/5/14.
 */
public class StackIntImpl<T> implements StackInt<T> {
    private Object[] stack;
    private int size;

    public StackIntImpl() {
        stack = new Object[2];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return (T) stack[size - 1];
    }

    @Override
    public T pop() {
        T tmp = peek();
        stack[size - 1] = null;
        size --;
        return tmp;
    }

    @Override
    public T push(T item) {
        ensureCapacity(size + 1);
        stack[size ++] = item;
        return item;
    }

    @Override
    public void ensureCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            int newlen = len + 10;
            System.out.println("original: " + stack.length);
            stack = Arrays.copyOf(stack, newlen);
            System.out.println("after: " + stack.length);
            System.out.println("increase capacity done.");
        }
    }

    public static void main(String[] args) {
        StackIntImpl s = new StackIntImpl();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.peek());
    }
}
