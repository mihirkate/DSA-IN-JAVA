import java.util.ArrayList;

public class ConvertBST_To_BalancedBSt {
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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node convertBST(ArrayList<Integer> inorder, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = convertBST(inorder, si, mid - 1);
        root.right = convertBST(inorder, mid + 1, ei);
        return root;
    }

    public static Node balancedBst(Node root) {
        // inorder calculation
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        // sorted elements to Bst
        root = convertBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        /* Given Input 
         * 8
         * / \
         * 6 10
         * / \
         * 5 11
         * / \
         * 3 12
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        /*
         * 8
         * / \
         * 5 11
         * /\ /\
         * 3 6 10 12
         */
        root = balancedBst(root);
        preOrder(root);
    }
}
