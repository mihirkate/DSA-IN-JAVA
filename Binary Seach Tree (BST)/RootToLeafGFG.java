import java.util.ArrayList;

public class RootToLeafGFG {
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

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        rootToLeaf(root, path, result);
        return result;
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(path));
        }
        rootToLeaf(root.left, path, result);
        rootToLeaf(root.right, path, result);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

    }
}
