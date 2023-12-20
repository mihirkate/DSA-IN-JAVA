public class StartsWithProblem {
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

    public static boolean startsWithProblem(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.childern[idx] == null) {
                return false;
            }
            // updation
            curr = curr.childern[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "apple", "app", "mango", "man", "woman" };
        for (int i = 0; i < words.length; i++) {
            insertInTrie(words[i]);
        }
        String prefix = "man";
        System.out.println("The entered String  is Prefix ..?:" + startsWithProblem(prefix));
    }
}
