package dataStruct;

/**
 * Created by wong on 16/5/9.
 */
public class Node implements NodeInt {
    int value;
    Node next = null;
    public Node(int value) {
        this.value = value;
    }
    public String toString() {
        return String.valueOf(this.value);
    }
}
