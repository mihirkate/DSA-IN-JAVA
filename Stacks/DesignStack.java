import java.util.Stack;

public class DesignStack {

    static class SpecialStack {
        Stack<Integer> s = new Stack<>();
        int mini = Integer.MAX_VALUE;

        void push(int data) {
            // Implement the push() function.
            /// for the first element
            if (s.isEmpty()) {
                s.push(data);
                mini = data;
            } else {
                if (data < mini) {

                    s.push(2 * data - mini);
                    mini = data;

                } else {
                    // Normal push
                    s.push(data);
                }
            }

        }

        void pop() {
            // Implement the pop() function.

            if (s.isEmpty()) {
                return;
            }
            int curr = s.peek();
            s.pop();
            if (curr > mini) {
                return;
            } else {

                mini = 2 * mini - curr;

            }
        }

        int top() {
            if (s.isEmpty()) {
                return -1;
            }
            int curr = s.peek();
            if (curr < mini) {
                return mini;
            } else {
                return curr;
            }

        }

        int getMin() {
            if (s.isEmpty()) {
                return -1;
            }
            return mini;

        }
    };
}
