package dataStruct;

/**
 * Created by wong on 16/5/7.
 */
public interface LinkedListInt {

    public void append(int value);
    public boolean insertNode(int index, int value);
    public boolean pop();
    public boolean deleteNode(int index);
    public int length();
    public void sort();
    public void print();
    public void deleteDuplecate();

    /**
     * 找出链表倒数第k个元素, O(n)
     * @param k
     * @return
     */
    public Object findLastKNode(int k);

    /**
     * 非递归链表反转
     */
    public void reverse();

    /**
     * 从尾到头输出单链表
     */
    public void printReversely();

    /**
     * 寻找链表中间节点
     * @return
     */
    public Node findMidNode();

    /**
     * 判断链表是否有环
     * @return
     */
    public boolean isLoop();

    /**
     * 不知道head情况下, 删除指定节点
     * @return
     */
    public boolean deleteNodeWithoutHead(Node node);

    /**
     * 判断两个链表是否相交
     * @param node1
     * @param node2
     * @return
     */
    public boolean isIntersect(Node node1, Node node2);

}
