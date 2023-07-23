import java.util.Scanner;
import java.util.Stack;

public class ReverseStringstack {

    public static String reveString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in the Stack");
        String str = sc.nextLine();
        System.out.println(" The reverse of The string you have Entered is :  " + reveString(str));

    }
}
