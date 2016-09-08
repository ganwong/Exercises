package dataStruct;

/**
 * Created by wong on 16/5/15.
 */
public class QueueImpl<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public class Node<T> {
        Node<T> next = null;
        T value;
        public Node(T value) {
            this.value = value;
        }
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public void put(T value) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T value = head.value;
        head = head.next;
        return value;
    }

    public int size() {
        int cnt = 0;
        Node tmp = head;
        while (tmp != null) {
            cnt ++;
            tmp = tmp.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        QueueImpl<Integer> q = new QueueImpl<>();
        q.put(1);
        q.put(3);
        q.put(2);
        System.out.println(q.size());
        System.out.println(q.pop());
        System.out.println(q.size());
    }

}
