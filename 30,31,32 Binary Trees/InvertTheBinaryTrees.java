public class InvertTheBinaryTrees {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node invert(Node root) {
        if (root == null) {
            return null;
        }
        invert(root.left);
        invert(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(" " + root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preOrder(root);
        System.out.println();

        System.out.println();
        System.out.println(invert(root).data);
        preOrder(root);
    }
}