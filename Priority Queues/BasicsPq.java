import java.util.Comparator;
import java.util.PriorityQueue;

public class BasicsPq {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println("Priority Queues in JAVA");
        pq.add(9); // O (logn)
        pq.add(1);
        pq.add(2);
        pq.add(5);
        while (!pq.isEmpty()) {
            System.out.print(" " + pq.peek());// O(1)
            pq.remove();// O(logn)
        }

    }
}