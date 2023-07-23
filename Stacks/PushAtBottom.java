import java.util.Scanner;
import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        System.out.println("Enter the size of stack");
        int n = sc.nextInt();

        System.out.println("Enter The elements in the stack");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            s.push(a);
        }
        System.out.println("Enter the element want to push to the bottom");
        int number = sc.nextInt();
        pushAtBottom(s, number);
        while (!s.isEmpty()) {
            System.out.println("Element  :" + s.peek());
            s.pop();
        }
        System.out.println("The Element pushed at the Bottom is " + number);
    }
}
