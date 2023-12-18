public class DeleteLeafNodesWithValueX {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
        /* return root.data; */
    }

    public static Node deleteLeaf(Node root, int x) {
        if (root == null) {
            return null;
        }
        root.left = deleteLeaf(root.left, x);
        root.right = deleteLeaf(root.right, x);
        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }
        return root;
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
        System.out.println(deleteLeaf(root, 1).data);
        preOrder(root);
    }
}