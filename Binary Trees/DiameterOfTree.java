
public class DiameterOfTree {
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
        if (root == null) {
            return 0;
        }
        int lh = heightofTree(root.left);
        int rh = heightofTree(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int ldiam = diameterOfTree(root.left);
        int rdiam = diameterOfTree(root.right);
        int lh = heightofTree(root.left);
        int rh = heightofTree(root.right);
        int selfDiam = lh + rh + 1;
        return Math.max(Math.max(ldiam, rdiam), selfDiam);

    }

    static class Info {
        int diam;
        int height;

        M

                Info(int diam, int height) {
            this.diam = diam;
            this.height = height;
        }
    }

    public static Info diamter2OfTree(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info lInfo = diamter2OfTree(root.left);
        Info rInfo = diamter2OfTree(root.right);
        int diameter = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.height + rInfo.height + 1);

        int ht = Math.max(lInfo.height, rInfo.height) + 1;
        return new Info(diameter, ht);
    }

    public static void main(String[] args) {
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
        /* root.right.right.right = new Node(6); */
        System.out.println("The diameter of the tree is " + diamter2OfTree(root).diam);
    }
}
