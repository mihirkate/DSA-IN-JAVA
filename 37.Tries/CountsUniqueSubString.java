public class CountsUniqueSubString {
    static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < childern.length; i++) {
                childern[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insertInTrie(String word) {// O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                // add create new Nod
                curr.childern[idx] = new Node();
            }
            // just assign that curr node to the next Node
            curr = curr.childern[idx];
        }
        curr.eow = true;

    }

    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                // add create new Nod
                return false;
            }
            curr = curr.childern[idx];
        }
        return curr.eow == true;
    }

    public static int countNodes(Node root) {
        int count = 0;
        if (root == null) {
            return 0;

        }
        for (int i = 0; i < 26; i++) {
            if (root.childern[i] != null) {
                System.out.print(" " + (char) ('a' + i));
                count += countNodes(root.childern[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        // find suffixes and insert into the trie
        String str = "apple";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insertInTrie(suffix);
        }
        System.out.println("The count of Unique subString is:" + countNodes(root));
    }
}