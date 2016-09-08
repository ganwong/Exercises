package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wong on 16/6/5.
 */
class Node {
    public int data;
    public Node left;
    public Node right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    private Node root;
    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        }else {
            Node curr = root;
            Node parent;
            while (true) {
                parent = curr;
                if (data < curr.data) {
                    curr = curr.left;
                    if (curr == null) {
                        parent.left = newNode;
                        return;
                    }
                }else {
                    curr = curr.right;
                    if (curr == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void buildTree(int[] data) {
        for (int i = 0; i < data.length; i++) {
            insert(data[i]);
        }
    }

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.left);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.right);
        }
    }
    public void inOrder() {
        this.inOrder(this.root);
    }

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }
    public void preOrder() {
        this.preOrder(this.root);
    }

    public void postOrder(Node localNode) {
        if (localNode != null) {
            postOrder(localNode.left);
            postOrder(localNode.right);
            System.out.print(localNode.data + " ");
        }
    }
    public void postOrder() {
        this.postOrder(this.root);
    }

    public void levelOrder() {
        if (this.root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(this.root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.data + " ");
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] a = {2, 8, 7, 4, 9, 3, 6, 7, 5};
        bst.buildTree(a);
        System.out.println("inorder");
        bst.inOrder();
        System.out.println();

        System.out.println("preorder");
        bst.preOrder();
        System.out.println();

        System.out.println("postorder");
        bst.postOrder();
        System.out.println();

        System.out.println("levelorder");
        bst.levelOrder();


    }
}