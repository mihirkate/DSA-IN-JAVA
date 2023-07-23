import java.util.Stack;

public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(9);
        s.push(8);
        s.push(7);
        System.out.println("Elements in the Stack are :");
        while (!s.isEmpty()) {
            System.out.println(" " + s.peek());
            s.pop();
        }

    }
}
