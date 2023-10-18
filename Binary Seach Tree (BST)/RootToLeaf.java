import java.util.ArrayList;

public class RootToLeaf {
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

    public static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            /* System.out.println(path); */
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size() - 1);

    }

    public static void printPath(ArrayList<Integer> path) {

        for (int i = 0; i < path.size(); i++) {

            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("Nulll");
    }

    public static void main(String[] args) {
        /*
         * __8
         * / __\
         * 5 __ 10
         * /\ ___\
         * 3 6 ___12
         * /\ _____ \
         * 1 4 ____14
         */
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 12, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBst(root, values[i]);
        }

    }
}
