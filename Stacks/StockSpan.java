import java.util.Stack;

public class StockSpan {
    public static void stockSpan(int span[], int stock[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];
            while (!s.isEmpty() && curr > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
    }

    public static void print(int span[]) {
        for (int i = 1; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int stock[] = { 60, 10, 20, 40, 35, 30, 50, 70, 65 };
        int span[] = new int[stock.length];
        print(span);
        stockSpan(span, stock);
        System.out.println("The Span After calculating Stock is :");
        print(span);
    }
}