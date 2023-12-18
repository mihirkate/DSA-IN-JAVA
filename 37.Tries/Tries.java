public class Tries {
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

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String words[] = { "the", "a", "there", "their", "any", "thee" };
        String words[] = { "i", "like", "samsung", "mobile", "ice" };

        for (int i = 0; i < words.length; i++) {
            insertInTrie(words[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}