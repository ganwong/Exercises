package dataStruct;

/**
 * Created by wong on 16/5/14.
 */
public class StackInt2Impl<T> implements StackInt2<T> {
    Node<T> top = null;

    public class Node<T> {
        Node<T> next = null;
        T value;
        public Node(T value) {
            this.value = value;
        }
    }
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        if (isEmpty()) return null;
        T tmp = top.value;
        top = top.next;
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return top.value;
    }

    public static void main(String[] args) {
        StackInt2Impl stack = new StackInt2Impl();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
