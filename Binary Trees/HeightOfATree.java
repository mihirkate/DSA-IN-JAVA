import org.w3c.dom.Node;

public class HeightOfATree {
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

    public static int heightofTree(Node root) {
        // base case
        if (root == null) {
            return 0;
        }
        int lh = heightofTree(root.left);
        int rh = heightofTree(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int countOfNodes(Node root) {
        // base case
        if (root == null) {
            return 0;

        }
        int lcount = countOfNodes(root.left);
        int rcount = countOfNodes(root.right);
        return (lcount + rcount + 1);
    }

    public static int sumOfNodes(Node root) {
        // base case
        if (root == null) {
            return 0;

        }
        int lsum = sumOfNodes(root.left);
        int rsum = sumOfNodes(root.right);
        return lsum + rsum + root.data;
    }

    public static void main(String[] args) {
        // creation of Tree
        // creation of Tree
        /*
         * 1
         * / \
         * 2 3
         * /\ /\
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(6);

        System.out.println("The height of the Binary Trees is : " + heightofTree(root));
        /*
         * System.out.println("The count of Node are :" + countOfNodes(root));
         * System.out.println("The sum of Nodes:" + sumOfNodes(root));
         */
    }
}
