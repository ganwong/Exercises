package dataStruct;

/**
 * Created by wong on 16/5/14.
 */
public interface StackInt<T> {
    public Object[] stack = null;
    public int size = 0;
    public boolean isEmpty();
    public T peek();
    public T pop();
    public T push(T item);
    public void ensureCapacity(int size);

}
