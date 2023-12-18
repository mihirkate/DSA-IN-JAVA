import java.util.*;

public class FindSubSets {
    public static void findSubSet(String str, String ans, int idx) {
        // base case
        Scanner sc = new Scanner(System.in);
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("φ(Null)");
            } else {
                // print(String.charAt(idx));
                System.out.println(ans);
            }
            return;
        }
        // recursion has Two choices -->Yes & No
        // for yes
        findSubSet(str, ans + str.charAt(idx), idx + 1);
        // For no choice
        findSubSet(str, ans, idx + 1);
        // back tracking
        sc.close();
    }

    public static void main(String[] args) {
        // String str = "abc";
        findSubSet("abc", "", 0);
    }
}
