public class AvlTrees {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            /*
             * this.right = null;
             * this.left = null;
             */
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;

    }

    // calculate balance factor
    public static int getBalanceFactor(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node temp = y.left;
        // perform rotation
        y.left = x;
        x.right = temp;

        // update heights
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(x.left), height(x.right));
        return y;
    }

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node temp = x.right;
        // perform rotations
        x.right = y;
        y.left = temp;
        // Update Heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        // Returning the root which is on the Top
        return x;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get balance factor
        int bf = getBalanceFactor(root);
        // cases
        // left left case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }
        // right right case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }
        // left right case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // right left case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        /*
         * AVL TREE
         * 30
         * / \
         * 20 40
         * / \ \
         * 10 25 50
         */
        preOrder(root);
    }
}
