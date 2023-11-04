import java.util.ArrayList;

public class Merge2Bsts {
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

    public static Node createBst(ArrayList<Integer> newArr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(newArr.get(mid));
        root.left = createBst(newArr, si, mid - 1);
        root.right = createBst(newArr, mid + 1, ei);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node mergeBsts(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        ArrayList<Integer> newArr = new ArrayList<>();

        // merger
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                newArr.add(arr1.get(i));
                i++;
            } else {
                newArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            newArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            newArr.add(arr2.get(j));
            j++;
        }

        // Sorted AL --> Balanced BST
        return createBst(newArr, 0, newArr.size() - 1);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBsts(root1, root2);
        preOrder(root);
    }
}
