import java.util.LinkedList;
import java.util.Queue;

public class TraversalOrder {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            // creation of New Node
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;

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

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(" " + root.data);
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.data);
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(nodes);

        System.out.println("\n Preorder Traversal is :");
        b.preOrder(root);
        System.out.println("\nInorder Traversal is :");
        b.inOrder(root);
        System.out.println("\nPostOrder Traversal is :");
        b.postOrder(root);

        System.out.println("\nLevel Order Traversal ");
        b.levelOrder(root);
    }
}
