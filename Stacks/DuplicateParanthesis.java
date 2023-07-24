import java.util.Stack;
import java.util.Scanner;

public class DuplicateParanthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(0);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                } // opening pair
            } else {
                s.push(ch);
            }

        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paranthesis :");
        String str = sc.nextLine();
        if (isDuplicate(str) == true) {
            System.out.println("The String " + str + "is Duplicate");
        } else {
            System.out.println("The String " + str + "is  Not (Duplicate");

        }

    }
}
