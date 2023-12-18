public class CheckIfTreeIsUniValued {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUnivalued(Node root, int prev) {
        if (root == null) {
            return true;
        }

        if (root.data != prev) {
            return false;
        }
        return isUnivalued(root.left, prev) && isUnivalued(root.right, prev);
    }

    public static boolean checkUnivalues(Node root) {
        if (root == null) {
            return true;
        }
        return isUnivalued(root, root.data);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        /*
         * Node root = new Node(1);
         * root.left = new Node(2);
         * root.right = new Node(3);
         * root.left.left = new Node(4);
         * root.left.right = new Node(5);
         * root.right.left = new Node(6);
         * root.right.right = new Node(7);
         */
        /*
         * 1
         * /\
         * 1 1
         * /\ /\
         * 1 1 1 1
         */
        Node root = new Node(1);
        root.left = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        System.out.println(checkUnivalues(root));
    }
}
