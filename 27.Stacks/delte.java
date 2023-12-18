import java.util.Stack;

public class delte {
    public static void deleteMid(Stack<Integer> s, int size) {
        int count = 0;
        solve(s, count, size);
    }

    public static void solve(Stack<Integer> s, int count, int size) {
        if (count == size / 2) {
            s.pop();
            return;
        }
        int top = s.peek();
        s.pop();
        solve(s, count + 1, size);
        s.push(top);
    }

    public static void print(Stack<Integer> s) {
        // Create a temporary stack to store the elements for printing
        Stack<Integer> tempStack = new Stack<>();
        while (!s.isEmpty()) {
            int element = s.peek();
            System.out.print("  " + element);
            tempStack.push(element);
            s.pop();
        }
        System.out.println();

        // Restore the original stack after printing
        while (!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(11);
        s.push(8);
        s.push(4);
        s.push(13);
        s.push(19);
        System.out.println("Orignal Stack:");
        print(s);
        deleteMid(s, 6);
        System.out.println("After Deleting Mid element :");
        print(s);

    }
}
