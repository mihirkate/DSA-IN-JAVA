import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelements {

    public static Queue<Integer> reverse(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> Nq = new LinkedList<>();
        if (q.isEmpty()) {
            return q;
        }
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
            /* q.remove(); */
        }

        while (!s.isEmpty()) {
            Nq.add(s.pop());
            /* s.pop(); */
        }

        while (!q.isEmpty()) {
            Nq.add(q.peek());
            q.remove();
        }

        return Nq;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println("Original Queue: " + q);

        q = reverse(q, 4); // Assign the reversed queue back to q
        System.out.println("Reversed Queue: " + q);
    }
}
