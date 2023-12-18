import java.util.Stack;

public class DeleteMidElement {
    public static void dMidElement(Stack<Integer> s, int count, int size) {

        if (count == size / 2) {
            s.pop();
            return;
        }
        int top = s.peek();
        s.pop();
        // recursive call
        dMidElement(s, count + 1, size);
        s.push(top);
    }

    public static void solve(Stack<Integer> s, int size) {
        int count = 0;
        dMidElement(s, count, size);
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
        s.push(4);
        s.push(8);
        s.push(12);
        s.push(9);
        s.push(5);
        s.push(7);
        System.out.println("Orignal Stack:");
        print(s);
        solve(s, 5);
        System.out.println("After Deleting Mid element :");
        print(s);
    }
}
