public class LongestWordWithAllPrefixes {
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

    public static String ans = "";

    public static void longestWords(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.childern[i] != null && root.childern[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    // update
                    ans = temp.toString();
                }
                longestWords(root.childern[i], temp);
                // backtrack
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            insertInTrie(words[i]);
        }
        longestWords(root, new StringBuilder(""));
        System.out.println("The Longest Word with all prefixes" + ans);
    }
}
