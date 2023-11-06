import java.util.Comparator;
import java.util.PriorityQueue;

public class Classroom {
    static class Students implements Comparable<Students> {
        String name;
        int rank;

        public Students(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Students s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Students> pq = new PriorityQueue<>();
        System.out.println("Priority Queues in JAVA");
        pq.add(new Students("A ", 4)); // O (logn)
        pq.add(new Students("B ", 5)); // O (logn)
        pq.add(new Students("C ", 2)); // O (logn)
        pq.add(new Students("D ", 6)); // O (logn)
        pq.add(new Students("D ", 6)); // O (logn)
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "-> " + pq.peek().rank);// O(1)
            pq.remove();// O(logn)
        }
    }
}