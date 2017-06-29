package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by OovEver on 2017/6/26.
 */
public class BST {
    private class Node {
        int key;
        int value;
        Node left;
        Node right;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.left = this.right = null;
        }
    }

    private Node root;
    private int count;
public  BST() {
    root = null;
    count = 0;
}
    public   int size() {
        return count;
    }

    public  boolean isEmpty() {
        return count == 0;
    }

    public  void insert(int key, int value) {
        root = insert(root, key, value);
    }
    public boolean contain(int key) {
        return contain(root, key);
    }

    public int search(int key) {
        return search(root, key);
    }
    public void preOrder() {
        preOrder(root);
    }
    public void ineOrder() {
        inOrder(root);
    }
    public void posteOrder() {
        postOrder(root);
    }
    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.peek();
            queue.poll();
            System.out.println(node.key);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

    }
    public int minum() {
        assert (count != 0);
        Node minMode = minum(root);
        return minMode.key;
    }
    public int maxum() {
        assert (count != 0);
        Node maxMode = maxnum(root);
        return maxMode.key;
    }
    public void removeMin() {
        if (root!=null) {
            root = removeMin(root);
        }
    }
    public void removeMax() {
        if (root!=null) {
            root = removeMax(root);
        }
    }

    public void remove(int key) {
       root=remove(root,key);
    }
    private Node insert(Node node, int key, int value) {
        if (node == null) {
            count++;
            return new Node(key, value);
        }
        if (key == node.key) {
            node.value = value;
        } else if (key < node.key) {
            node.left = insert(node.left, key, value);
        }else
           node.right=insert(node.right, key, value);
        return node;

    }

    private  boolean contain(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (key == node.key) {
            return true;
        } else if (key < node.key) {
            return contain(node.left, key);
        }else
            return contain(node.right, key);
    }

    private int search(Node node, int key) {
        if (node == null) {
            return -1;
        }
        if (key == node.key) {
            return node.value;
        } else if (key < node.key) {
            return search(node.left, key);
        } else return search(node.right, key);
    }
    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);

        }
    }
    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);

        }
    }
    private void postOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            inOrder(node.right);
            System.out.println(node.key);
        }
    }
    private Node minum(Node node) {
        if (node.left == null) {
            return node;
        }
        return minum(node.left);
    }
    private Node maxnum(Node node) {
        if (node.right == null) {
            return node;
        }
        return maxnum(node.right);
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            count--;
            return rightNode;
        }
        node.left=removeMin(node.left);
        return node;
    }
    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            count--;
            return leftNode;
        }
        node.right=removeMax(node.right);
        return node;
    }

    private Node remove(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.key) {
            node.left=remove(node.left, key);
        } else if (key > node.key) {
            node.right = remove(node.right, key);
        } else {
            if (node.left == null) {
                Node rightNode = node.right;
                count--;
                return rightNode;
            }
            if (node.right == null) {
                Node leftNode = node.left;
                count--;
                return leftNode;
            }
        }
        Node delNode = node;
        Node successor = minum(node.right);
        count++;
        successor.right = removeMin(node.right);
        return node;
    }
    public static void main(String[] args) {

    }
}
