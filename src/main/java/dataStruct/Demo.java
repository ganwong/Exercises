package dataStruct;

public class Demo {
    public static void main(String[] args) {
        LinkedListIntImpl ll = new LinkedListIntImpl();
        ll.append(2);
        ll.append(3);
        ll.append(1);
        ll.append(4);
        ll.print();
        ll.sort();
        ll.print();
        ll.deleteNode(1);
        ll.print();
        ll.insertNode(0, 6);
        ll.insertNode(1, 5);
        ll.print();
        ll.append(3);
        ll.append(5);
        ll.print();
        ll.deleteDuplecate();
        ll.print();
        System.out.println(ll.findLastKNode(3));
        ll.reverse();
        ll.print();
        ll.printReversely();
        System.out.println(ll.findMidNode().toString());
    }
}