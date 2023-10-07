
public class TransformSum {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /*
     * GFG Code
     * int transform(Node root){
     * if(root==null){
     * return 0;
     * }
     * int leftchild = transform(root.left);
     * // fir right child ko call karenge
     * int rightChild = transform(root.right);
     * 
     * int data=root.data;
     * 
     * /* // int newLeft=root.left==null?0:root.left.data;
     * // int newRight=root.right==null?0:root.right.data;
     */
    /*
     * root.data=leftchild+rightChild;
     * return data+root.data;
     * }
     * public void toSumTree(Node root){
     * 
     * transform(root);
     * }
     */
    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        // pehle left child ko call karenge
        int leftchild = transform(root.left);
        // fir right child ko call karenge
        int rightChild = transform(root.right);
        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.left == null ? 0 : root.right.data;
        root.data = newLeft + leftchild + newRight + rightChild;
        return data;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        /* return root.data; */
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
        System.out.println("\nThe Transformed Sum of The Tree is " + transform(root));
        preOrder(root);
    }
}
