import java.util.Stack;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static int[] stockSpan(int stock[], int n) {
        // public static void stockSpan( int stock[], int span[]) {

        int span[] = new int[stock.length];
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];
            while (!s.isEmpty() && curr > stock[s.peek()]) {
                s.pop();
            }
            /*
             * if (s.isEmpty()) {
             * span[i] = i + 1;
             * } else {
             * int prevhigh = s.peek();
             * span[i] = i - prevhigh;
             * }
             */
            span[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek());
            s.push(i);
        }
        return span;
    }
}

public class StockSpanGFG {
    public static void main(String[] args) {
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int n = 7;
        int s[] = new Solution().stockSpan(stock, n);

        for (int i = 0; i < n; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
