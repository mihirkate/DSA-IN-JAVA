import java.util.Stack;
import java.util.Scanner;

public class ReverseTheStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseTheStack(Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseTheStack(s);
        pushAtBottom(s, top);
    }

    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> s = new Stack<>();
        System.out.println("Enter the size of stack");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the stack");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            s.push(a);
        }

        System.out.println("The reversed elements are :");
        reverseTheStack(s);
        print(s);
    }
}
