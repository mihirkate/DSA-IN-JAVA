import java.util.Stack;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {

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
            // if (s.isEmpty()) {
            // span[i] = i + 1;
            // } else {
            // int prevhigh = s.peek();
            // span[i] = i - prevhigh;
            // }
            span[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek());
            s.push(i);
        }
        return span;
    }

    public static void print(int span[]) {
        for (int i = 1; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        // int span[]=new int[price.size()];
        // span[0]=1;
        // s.push(0);
        for (int i = 0; i < price.size(); i++) {
            int currPrice = price.get(i);
            while (!s.isEmpty() && currPrice >= price.get(s.peek())) {
                s.pop();
            }
            if (s.isEmpty()) {
                span.add(i + 1);
                // span[i]=i+1;
            } else {
                int prevHigh = s.peek();
                span.add(i - prevHigh);
                // span[i]=i-prevHigh;
            }
            s.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        // int stock[] = { 60, 10, 20, 40, 35, 30, 50, 70, 65 };
        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stock.length];
        print(span);

        // stockSpan(span, 9);

        // System.out.println("The Span After calculating Stock is :");

        // print(span);
    }
}