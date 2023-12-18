public class SearchInBST {
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

    public static boolean search(Node root, int key) {// O(H)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
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
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBst(root, values[i]);
        }
        System.out.println(search(root, 7));

    }
}
