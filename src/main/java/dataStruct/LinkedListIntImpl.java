package dataStruct;

import java.util.HashSet;

/**
 * Created by wong on 16/5/7.
 */
public class LinkedListIntImpl implements LinkedListInt {

    public Node head = null;

//    public class dataStruct.Node {
//        int value;
//        dataStruct.Node next = null;
//        public dataStruct.Node(int value) {
//            this.value = value;
//        }
//        public String toString() {
//            return String.valueOf(this.value);
//        }
//    }
    @Override
    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length() == 0) {
            head = newNode;
            return ;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    @Override
    public boolean insertNode(int index, int value) {
        if (index < 0 || index > length()-1) {
            return false;
        }
        Node newnode = new Node(value);
        if (index == 0) {
            newnode.next = head;
            head = newnode;
            return true;
        }
        Node prev = head;
        Node curr = prev.next;
        int i = 1;
        while (i != index) {
            prev = curr;
            curr = curr.next;
            i ++;
        }
        prev.next = newnode;
        newnode.next = curr;
        return true;
    }

    @Override
    public boolean pop() {
        if (this.length() == 0) {
            return false;
        }
        if (this.length() == 1) {
            head = null;
            return true;
        }
        Node prev = head;
        Node cur = prev.next;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        return true;

    }

    @Override
    public boolean deleteNode(int index) {
        if (index < 0 || index > length()-1) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            return true;
        }

        Node prev = head;
        Node curr = prev.next;
        int i = 1;
        while (i != index) {
            prev = curr;
            curr = curr.next;
            i ++;
        }
        prev.next = curr.next;
        return false;
    }

    @Override
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length ++;
            tmp = tmp.next;
        }
        return length;
    }

    @Override
    public void sort() {
        Node curr = head;
        while (curr != null) {
            Node tmp = curr.next;
            while (tmp != null) {
                if (tmp.value < curr.value) {
                    int t = tmp.value;
                    tmp.value = curr.value;
                    curr.value = t;

                }
                tmp = tmp.next;
            }
            curr = curr.next;
        }
    }

    @Override
    public void print() {
        Node tmp = head;
        System.out.printf("[");
        int index = 0;
        while (tmp != null) {
            System.out.print(((index == 0) ? "":" ") + tmp.value);
            tmp = tmp.next;
            index ++;
        }
        System.out.printf("]\n");
    }

    @Override
    public void deleteDuplecate() {
        if (head == null) return;
        Node prev = head;
        Node curr = prev.next;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(head.value);
        while (curr != null) {
            if (!hashSet.contains(curr.value)) {
                hashSet.add(curr.value);
                prev = curr;
                curr = curr.next;
            }
            else {
                prev.next = curr.next;
                curr = curr.next;
            }
        }
    }

    @Override
    public Node findLastKNode(int k) {
        if (k <= 0 || k > length()) {
            return null;
        }
        Node former = head;
        Node latter = head;
        for (int i = 0; i < k - 1 ; i ++) {
            latter = latter.next;
        }
        while (latter.next != null) {
            former = former.next;
            latter = latter.next;
        }
        return former;
    }

    @Override
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node reservedHead = head;
        while (curr != null) {
            Node next = curr.next;
            if (next == null) reservedHead = curr;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.head = reservedHead;
    }


    @Override
    public void printReversely() {
        printReverselyHelper(this.head);
    }
    private void printReverselyHelper(Node listHead) {
        if (listHead != null) {
            printReverselyHelper(listHead.next);
            System.out.print(listHead.value + " ");
        }
    }

    @Override
    public Node findMidNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;

            }
            else return slow;
            slow = slow.next;
        }
        return slow;
    }

    @Override
    public boolean isLoop() {
        if (head != null) return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteNodeWithoutHead(Node node) {
        if (node == null || node.next != null) return false;
        int tmp = node.value;
        node.value = node.next.value;
        node.next.value = tmp;
        node.next = node.next.next;
        return true;
    }

    @Override
    public boolean isIntersect(Node node1, Node node2) {
        if (node1 == null || node2 == null) return false;
        Node tail1 = node1;
        while (tail1.next != null) tail1 = tail1.next;
        Node tail2 = node2;
        while (tail2.next != null) tail2 = tail2.next;
        return tail1 == tail2;
    }


}
