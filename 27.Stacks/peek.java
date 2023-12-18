import java.util.Stack;

public class peek {
    public static void main(String[] args) {
        Stack<Long> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        int arr[] = { 7, 8, 10, 0, -1 };

        System.out.println(arr[s.peek()]);
    }
}
