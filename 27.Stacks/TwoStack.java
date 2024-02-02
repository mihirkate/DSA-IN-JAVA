import java.util.Stack;

public class TwoStack {
    public static Stack<Integer> addTwoStack(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> ans = new Stack<>();
        int sum = 0;
        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {

            sum = carry + (!s1.isEmpty() ? s1.peek() : 0) + (!s2.isEmpty() ? s2.peek() : 0);
            carry = sum / 10;
            ans.push(sum % 10);

            if (!s1.isEmpty()) {
                s1.pop();
            }
            if (!s2.isEmpty()) {
                s2.pop();
            }
        }
        if (carry != 0) {
            ans.push(carry);
        }
        return ans;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        /*
         * int arr1[] = { 3, 8, 1, 3, 5 };
         * int arr2[] = { 6, 2, 4, 3, 5 };
         * for (int i = 0, j = 0; i < arr1.length && j < arr2.length; i++, j++) {
         * s1.push(arr1[i]);
         * s2.push(arr2[j]);
         * }
         */

        // s1
        s1.push(3);
        s1.push(8);
        s1.push(1);
        s1.push(3);
        s1.push(5);
        // s2
        s2.push(6);
        s2.push(2);
        s2.push(4);
        s2.push(3);
        s2.push(5);

        System.out.println(s1);
        System.out.println(s2);
        ans = addTwoStack(s1, s2);
        while (!ans.isEmpty()) {
            System.out.print(ans.pop() + " ");

        }
    }
}