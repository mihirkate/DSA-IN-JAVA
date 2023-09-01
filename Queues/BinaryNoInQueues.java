import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNoInQueues {
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            q.add(s1 + "0");
            q.add(s1 + "1");

        }
    }

    static ArrayList<String> generate(int n) {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.remove();
            // q.remove();
            // System.out.println(s1);
            ans.add(s1);
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
        return ans;
    }

    public static void main(String[] args) {
        generateBinary(10);
    }
}
