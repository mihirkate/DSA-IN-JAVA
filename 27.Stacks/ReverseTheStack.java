import java.util.Stack;
import java.util.Scanner;

public class ReverseTheStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.peek();
        s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseTheStack(Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            return;
        }

        int top = s.peek();
        s.pop();
        reverseTheStack(s);
        pushAtBottom(s, top);
    }

    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void printl(Stack<Integer> s) {
        // System.out.println("Enter the size of stack");
        // int n = sc.nextInt();
        // System.out.println("Enter the elements in the stack");
        // for (int i = 0; i < n; i++) {
        // int a = sc.nextInt();
        // s.push(s);
        // }
        // System.out.println("The reversed elements are :");
        // reverseTheStack(s);
        // print(s); // print(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Elements Pushed In the stack are :-");
        System.out.println(" " + s);
        reverseTheStack(s);
        System.out.println("After reversing");
        System.out.println(" " + s);

    }
}
