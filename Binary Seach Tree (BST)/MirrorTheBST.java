public class MirrorTheBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
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

    public static Node mirrorTheBST(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMirror = mirrorTheBST(root.left);
        Node rightMirror = mirrorTheBST(root.right);
        // swapp
        root.right = leftMirror;
        root.left = rightMirror;
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);

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
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 12, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insertInBst(root, values[i]);
        }
        preOrder(root);
        mirrorTheBST(root);
        System.out.println();
        preOrder(root);
    }

}
