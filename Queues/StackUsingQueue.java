import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.remove();
            }

        }

        public static int pop() {
            int data = q1.peek();
            q1.remove();
            return data;
        }

        public static int peek() {
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(" " + s.peek());
            s.pop();
        }
    }
}
