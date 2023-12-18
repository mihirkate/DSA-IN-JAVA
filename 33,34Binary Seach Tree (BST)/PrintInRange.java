import java.util.ArrayList;

public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        // case 1 if(k1<root<k2)
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        // case 2 k1>root
        else if (k1 > root.data) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }

    }

    public static Node insertInBst(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data == val) {
            // Value already exists, no need to insert again.
            return root;
        }
        if (root.data > val) {
            root.left = insertInBst(root.left, val);
        } else {
            root.right = insertInBst(root.right, val);
        }
        return root;

    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 12, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBst(root, values[i]);
        }
        printInRange(root, 8, 12);
    }
}
