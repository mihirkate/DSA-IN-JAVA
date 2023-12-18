import java.util.Stack;

public class MiniStack {

    class MinStack {
        Stack<Integer> s;
        int mini;

        public MinStack() {
            s = new Stack<>();
            mini = Integer.MAX_VALUE;
        }

        public void push(int data) {

            if (data <= mini) {

                s.push(mini);
                mini = data;

            }
            // Normal push
            s.push(data);
        }

        public void pop() {
            if (s.isEmpty()) {
                return;
            }
            int curr = s.pop();

            if (curr == mini) {
                mini = s.pop();
            }

        }

        public int top() {
            if (s.isEmpty()) {
                return -1;
            }
            return s.peek();

        }

        public int getMin() {
            if (s.isEmpty()) {
                return -1;
            }
            return mini;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

}
